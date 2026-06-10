<?php
// create.php - Halaman Tambah Bahan Baku Baru
require_once 'db.php';

$pesan = "";

// Proses form ketika tombol simpan ditekan
if ($_SERVER['REQUEST_METHOD'] === 'POST') {
    $id_kategori    = (int) $_POST['id_kategori'];
    $nama_bahan     = mysqli_real_escape_string($conn, trim($_POST['nama_bahan']));
    $satuan         = mysqli_real_escape_string($conn, trim($_POST['satuan']));
    $stok_saat_ini  = (float) $_POST['stok_saat_ini'];
    $stok_minimum   = (float) $_POST['stok_minimum'];
    $tanggal_update = mysqli_real_escape_string($conn, $_POST['tanggal_update']);
    $keterangan     = mysqli_real_escape_string($conn, trim($_POST['keterangan']));

    // Validasi sederhana
    if (empty($nama_bahan) || empty($satuan) || $id_kategori == 0) {
        $pesan = ["error", "Nama bahan, satuan, dan kategori wajib diisi!"];
    } else {
        $sql = "INSERT INTO bahan_baku 
                    (id_kategori, nama_bahan, satuan, stok_saat_ini, stok_minimum, tanggal_update, keterangan)
                VALUES 
                    ($id_kategori, '$nama_bahan', '$satuan', $stok_saat_ini, $stok_minimum, '$tanggal_update', '$keterangan')";

        if (mysqli_query($conn, $sql)) {
            header("Location: index.php?success=Bahan baku berhasil ditambahkan");
            exit;
        } else {
            $pesan = ["error", "Gagal menyimpan: " . mysqli_error($conn)];
        }
    }
}

// Ambil data kategori untuk dropdown
$kategori_list = mysqli_query($conn, "SELECT * FROM kategori_bahan ORDER BY nama_kategori");
?>
<!DOCTYPE html>
<html lang="id">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tambah Bahan Baku</title>
    <style>
        * { margin: 0; padding: 0; box-sizing: border-box; }
        body { font-family: 'Segoe UI', sans-serif; background: #f0f4f8; color: #333; }

        header {
            background: linear-gradient(135deg, #ff6b35, #f7931e);
            color: white; padding: 18px 30px;
            box-shadow: 0 2px 8px rgba(0,0,0,0.2);
        }
        header h1 { font-size: 20px; }

        .container { max-width: 650px; margin: 35px auto; padding: 0 20px; }

        .card {
            background: white;
            border-radius: 12px;
            padding: 30px;
            box-shadow: 0 2px 10px rgba(0,0,0,0.08);
        }
        .card h2 { font-size: 18px; margin-bottom: 22px; color: #ff6b35; }

        .form-group { margin-bottom: 18px; }
        label { display: block; font-size: 13px; font-weight: 600; color: #555; margin-bottom: 6px; }
        label span { color: #e74c3c; }

        input[type="text"], input[type="number"], input[type="date"],
        select, textarea {
            width: 100%; padding: 10px 13px;
            border: 1.5px solid #ddd; border-radius: 7px;
            font-size: 14px; outline: none; transition: border 0.2s;
        }
        input:focus, select:focus, textarea:focus { border-color: #ff6b35; }

        .row { display: flex; gap: 15px; }
        .row .form-group { flex: 1; }

        .btn {
            display: inline-block; padding: 11px 24px;
            border-radius: 7px; font-size: 14px; font-weight: 600;
            cursor: pointer; border: none; text-decoration: none;
            transition: opacity 0.2s;
        }
        .btn:hover { opacity: 0.85; }
        .btn-primary { background: #ff6b35; color: white; }
        .btn-secondary { background: #95a5a6; color: white; }

        .alert { padding: 12px 16px; border-radius: 7px; margin-bottom: 18px; font-size: 14px; }
        .alert-error   { background: #fde8d8; border-left: 4px solid #e74c3c; color: #922b21; }
        .alert-success { background: #d5f5e3; border-left: 4px solid #1e8449; color: #1e8449; }

        .hint { font-size: 12px; color: #999; margin-top: 4px; }
    </style>
</head>
<body>

<header>
    <h1>🥨 Manajemen Stok Bahan Baku Snack</h1>
</header>

<div class="container">
    <div style="margin-bottom: 15px;">
        <a href="index.php" style="color:#ff6b35; text-decoration:none; font-size:14px;">← Kembali ke Daftar</a>
    </div>

    <div class="card">
        <h2>➕ Tambah Bahan Baku Baru</h2>

        <?php if (!empty($pesan)): ?>
        <div class="alert alert-<?= $pesan[0] ?>"><?= $pesan[1] ?></div>
        <?php endif; ?>

        <?php if (isset($_GET['success'])): ?>
        <div class="alert alert-success">✅ <?= htmlspecialchars($_GET['success']) ?></div>
        <?php endif; ?>

        <form method="POST">
            <!-- Nama Bahan -->
            <div class="form-group">
                <label>Nama Bahan Baku <span>*</span></label>
                <input type="text" name="nama_bahan" placeholder="contoh: Tepung Terigu"
                       value="<?= isset($_POST['nama_bahan']) ? htmlspecialchars($_POST['nama_bahan']) : '' ?>">
            </div>

            <!-- Kategori -->
            <div class="form-group">
                <label>Kategori <span>*</span></label>
                <select name="id_kategori">
                    <option value="0">-- Pilih Kategori --</option>
                    <?php while ($kat = mysqli_fetch_assoc($kategori_list)): ?>
                    <option value="<?= $kat['id_kategori'] ?>"
                        <?= (isset($_POST['id_kategori']) && $_POST['id_kategori'] == $kat['id_kategori']) ? 'selected' : '' ?>>
                        <?= htmlspecialchars($kat['nama_kategori']) ?>
                    </option>
                    <?php endwhile; ?>
                </select>
                <p class="hint">Belum ada kategori? <a href="kategori.php" style="color:#ff6b35;">Tambah kategori dulu</a></p>
            </div>

            <!-- Satuan -->
            <div class="form-group">
                <label>Satuan <span>*</span></label>
                <input type="text" name="satuan" placeholder="contoh: kg, liter, pcs, gram"
                       value="<?= isset($_POST['satuan']) ? htmlspecialchars($_POST['satuan']) : '' ?>">
            </div>

            <!-- Stok -->
            <div class="row">
                <div class="form-group">
                    <label>Stok Saat Ini</label>
                    <input type="number" name="stok_saat_ini" step="0.01" min="0"
                           value="<?= isset($_POST['stok_saat_ini']) ? $_POST['stok_saat_ini'] : '0' ?>">
                </div>
                <div class="form-group">
                    <label>Stok Minimum</label>
                    <input type="number" name="stok_minimum" step="0.01" min="0"
                           value="<?= isset($_POST['stok_minimum']) ? $_POST['stok_minimum'] : '0' ?>">
                    <p class="hint">Batas minimal sebelum peringatan muncul</p>
                </div>
            </div>

            <!-- Tanggal -->
            <div class="form-group">
                <label>Tanggal Update Stok</label>
                <input type="date" name="tanggal_update"
                       value="<?= isset($_POST['tanggal_update']) ? $_POST['tanggal_update'] : date('Y-m-d') ?>">
            </div>

            <!-- Keterangan -->
            <div class="form-group">
                <label>Keterangan (opsional)</label>
                <textarea name="keterangan" rows="3" placeholder="contoh: Merk Segitiga Biru, untuk adonan keripik"><?= isset($_POST['keterangan']) ? htmlspecialchars($_POST['keterangan']) : '' ?></textarea>
            </div>

            <!-- Tombol -->
            <div style="display:flex; gap:10px; margin-top:10px;">
                <button type="submit" class="btn btn-primary">💾 Simpan Bahan Baku</button>
                <a href="index.php" class="btn btn-secondary">Batal</a>
            </div>
        </form>
    </div>
</div>

</body>
</html>
<?php mysqli_close($conn); ?>
