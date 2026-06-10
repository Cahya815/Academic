<?php
// update.php - Halaman Edit Bahan Baku
require_once 'db.php';

// Ambil ID dari URL
$id = (int) ($_GET['id'] ?? 0);
if ($id == 0) {
    header("Location: index.php");
    exit;
}

// Ambil data bahan yang akan diedit
$sql_get  = "SELECT * FROM bahan_baku WHERE id_bahan = $id";
$result   = mysqli_query($conn, $sql_get);
$bahan    = mysqli_fetch_assoc($result);

if (!$bahan) {
    header("Location: index.php");
    exit;
}

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

    if (empty($nama_bahan) || empty($satuan) || $id_kategori == 0) {
        $pesan = ["error", "Nama bahan, satuan, dan kategori wajib diisi!"];
    } else {
        $sql_update = "UPDATE bahan_baku SET
                        id_kategori    = $id_kategori,
                        nama_bahan     = '$nama_bahan',
                        satuan         = '$satuan',
                        stok_saat_ini  = $stok_saat_ini,
                        stok_minimum   = $stok_minimum,
                        tanggal_update = '$tanggal_update',
                        keterangan     = '$keterangan'
                       WHERE id_bahan = $id";

        if (mysqli_query($conn, $sql_update)) {
            header("Location: index.php?success=Data berhasil diperbarui");
            exit;
        } else {
            $pesan = ["error", "Gagal memperbarui: " . mysqli_error($conn)];
        }
    }

    // Update nilai bahan dari POST supaya form tidak reset
    $bahan['id_kategori']    = $_POST['id_kategori'];
    $bahan['nama_bahan']     = $_POST['nama_bahan'];
    $bahan['satuan']         = $_POST['satuan'];
    $bahan['stok_saat_ini']  = $_POST['stok_saat_ini'];
    $bahan['stok_minimum']   = $_POST['stok_minimum'];
    $bahan['tanggal_update'] = $_POST['tanggal_update'];
    $bahan['keterangan']     = $_POST['keterangan'];
}

// Ambil data kategori untuk dropdown
$kategori_list = mysqli_query($conn, "SELECT * FROM kategori_bahan ORDER BY nama_kategori");
?>
<!DOCTYPE html>
<html lang="id">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Edit Bahan Baku</title>
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
            background: white; border-radius: 12px;
            padding: 30px; box-shadow: 0 2px 10px rgba(0,0,0,0.08);
        }
        .card h2 { font-size: 18px; margin-bottom: 22px; color: #f39c12; }

        .form-group { margin-bottom: 18px; }
        label { display: block; font-size: 13px; font-weight: 600; color: #555; margin-bottom: 6px; }
        label span { color: #e74c3c; }

        input[type="text"], input[type="number"], input[type="date"],
        select, textarea {
            width: 100%; padding: 10px 13px;
            border: 1.5px solid #ddd; border-radius: 7px;
            font-size: 14px; outline: none; transition: border 0.2s;
        }
        input:focus, select:focus, textarea:focus { border-color: #f39c12; }

        .row { display: flex; gap: 15px; }
        .row .form-group { flex: 1; }

        .btn {
            display: inline-block; padding: 11px 24px;
            border-radius: 7px; font-size: 14px; font-weight: 600;
            cursor: pointer; border: none; text-decoration: none;
            transition: opacity 0.2s;
        }
        .btn:hover { opacity: 0.85; }
        .btn-warning  { background: #f39c12; color: white; }
        .btn-secondary{ background: #95a5a6; color: white; }

        .alert { padding: 12px 16px; border-radius: 7px; margin-bottom: 18px; font-size: 14px; }
        .alert-error   { background: #fde8d8; border-left: 4px solid #e74c3c; color: #922b21; }
        .alert-success { background: #d5f5e3; border-left: 4px solid #1e8449; color: #1e8449; }

        .stok-info {
            background: #fff8f0; border: 1px solid #f7cca0;
            border-radius: 8px; padding: 12px 16px;
            font-size: 13px; color: #875a00; margin-bottom: 20px;
        }
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
        <h2>✏️ Edit Bahan Baku</h2>

        <?php if (!empty($pesan)): ?>
        <div class="alert alert-<?= $pesan[0] ?>"><?= $pesan[1] ?></div>
        <?php endif; ?>

        <div class="stok-info">
            📝 Mengedit: <strong><?= htmlspecialchars($bahan['nama_bahan']) ?></strong>
            &nbsp;|&nbsp; Update terakhir: <?= $bahan['tanggal_update'] ? date('d/m/Y', strtotime($bahan['tanggal_update'])) : '-' ?>
        </div>

        <form method="POST">
            <!-- Nama Bahan -->
            <div class="form-group">
                <label>Nama Bahan Baku <span>*</span></label>
                <input type="text" name="nama_bahan"
                       value="<?= htmlspecialchars($bahan['nama_bahan']) ?>">
            </div>

            <!-- Kategori -->
            <div class="form-group">
                <label>Kategori <span>*</span></label>
                <select name="id_kategori">
                    <option value="0">-- Pilih Kategori --</option>
                    <?php while ($kat = mysqli_fetch_assoc($kategori_list)): ?>
                    <option value="<?= $kat['id_kategori'] ?>"
                        <?= ($bahan['id_kategori'] == $kat['id_kategori']) ? 'selected' : '' ?>>
                        <?= htmlspecialchars($kat['nama_kategori']) ?>
                    </option>
                    <?php endwhile; ?>
                </select>
            </div>

            <!-- Satuan -->
            <div class="form-group">
                <label>Satuan <span>*</span></label>
                <input type="text" name="satuan"
                       value="<?= htmlspecialchars($bahan['satuan']) ?>">
            </div>

            <!-- Stok -->
            <div class="row">
                <div class="form-group">
                    <label>Stok Saat Ini</label>
                    <input type="number" name="stok_saat_ini" step="0.01" min="0"
                           value="<?= $bahan['stok_saat_ini'] ?>">
                </div>
                <div class="form-group">
                    <label>Stok Minimum</label>
                    <input type="number" name="stok_minimum" step="0.01" min="0"
                           value="<?= $bahan['stok_minimum'] ?>">
                </div>
            </div>

            <!-- Tanggal -->
            <div class="form-group">
                <label>Tanggal Update Stok</label>
                <input type="date" name="tanggal_update"
                       value="<?= $bahan['tanggal_update'] ?? date('Y-m-d') ?>">
            </div>

            <!-- Keterangan -->
            <div class="form-group">
                <label>Keterangan (opsional)</label>
                <textarea name="keterangan" rows="3"><?= htmlspecialchars($bahan['keterangan'] ?? '') ?></textarea>
            </div>

            <!-- Tombol -->
            <div style="display:flex; gap:10px; margin-top:10px;">
                <button type="submit" class="btn btn-warning">💾 Simpan Perubahan</button>
                <a href="index.php" class="btn btn-secondary">Batal</a>
            </div>
        </form>
    </div>
</div>

</body>
</html>
<?php mysqli_close($conn); ?>
