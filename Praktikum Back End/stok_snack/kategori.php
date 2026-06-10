<?php
// kategori.php - Kelola Kategori Bahan Baku
require_once 'db.php';

$pesan = "";

// TAMBAH KATEGORI
if (isset($_POST['aksi']) && $_POST['aksi'] === 'tambah') {
    $nama_kategori = mysqli_real_escape_string($conn, trim($_POST['nama_kategori']));
    $keterangan    = mysqli_real_escape_string($conn, trim($_POST['keterangan']));

    if (empty($nama_kategori)) {
        $pesan = ["error", "Nama kategori wajib diisi!"];
    } else {
        $sql = "INSERT INTO kategori_bahan (nama_kategori, keterangan) VALUES ('$nama_kategori', '$keterangan')";
        if (mysqli_query($conn, $sql)) {
            $pesan = ["success", "Kategori '$nama_kategori' berhasil ditambahkan!"];
        } else {
            $pesan = ["error", "Gagal menambahkan: " . mysqli_error($conn)];
        }
    }
}

// EDIT KATEGORI
if (isset($_POST['aksi']) && $_POST['aksi'] === 'edit') {
    $id_kategori   = (int) $_POST['id_kategori'];
    $nama_kategori = mysqli_real_escape_string($conn, trim($_POST['nama_kategori']));
    $keterangan    = mysqli_real_escape_string($conn, trim($_POST['keterangan']));

    if (empty($nama_kategori)) {
        $pesan = ["error", "Nama kategori wajib diisi!"];
    } else {
        $sql = "UPDATE kategori_bahan SET nama_kategori='$nama_kategori', keterangan='$keterangan' WHERE id_kategori=$id_kategori";
        if (mysqli_query($conn, $sql)) {
            $pesan = ["success", "Kategori berhasil diperbarui!"];
        } else {
            $pesan = ["error", "Gagal memperbarui: " . mysqli_error($conn)];
        }
    }
}

// HAPUS KATEGORI
if (isset($_GET['hapus'])) {
    $id_kategori = (int) $_GET['hapus'];
    // Cek apakah masih ada bahan baku di kategori ini
    $cek = mysqli_query($conn, "SELECT COUNT(*) as jml FROM bahan_baku WHERE id_kategori = $id_kategori");
    $row_cek = mysqli_fetch_assoc($cek);
    if ($row_cek['jml'] > 0) {
        $pesan = ["error", "Kategori tidak bisa dihapus karena masih memiliki {$row_cek['jml']} bahan baku!"];
    } else {
        mysqli_query($conn, "DELETE FROM kategori_bahan WHERE id_kategori = $id_kategori");
        $pesan = ["success", "Kategori berhasil dihapus!"];
    }
}

// Mode edit: siapkan data kategori yang akan diedit
$edit_data = null;
if (isset($_GET['edit'])) {
    $edit_id   = (int) $_GET['edit'];
    $res_edit  = mysqli_query($conn, "SELECT * FROM kategori_bahan WHERE id_kategori = $edit_id");
    $edit_data = mysqli_fetch_assoc($res_edit);
}

// Ambil semua kategori + jumlah bahan baku per kategori
$sql_kat = "SELECT k.*, COUNT(b.id_bahan) as jumlah_bahan
            FROM kategori_bahan k
            LEFT JOIN bahan_baku b ON k.id_kategori = b.id_kategori
            GROUP BY k.id_kategori
            ORDER BY k.nama_kategori";
$list_kat = mysqli_query($conn, $sql_kat);
?>
<!DOCTYPE html>
<html lang="id">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Kelola Kategori</title>
    <style>
        * { margin: 0; padding: 0; box-sizing: border-box; }
        body { font-family: 'Segoe UI', sans-serif; background: #f0f4f8; color: #333; }

        header {
            background: linear-gradient(135deg, #ff6b35, #f7931e);
            color: white; padding: 18px 30px;
            box-shadow: 0 2px 8px rgba(0,0,0,0.2);
        }
        header h1 { font-size: 20px; }

        .container { max-width: 900px; margin: 30px auto; padding: 0 20px; display: flex; gap: 20px; flex-wrap: wrap; }

        .card {
            background: white; border-radius: 12px;
            padding: 25px; box-shadow: 0 2px 10px rgba(0,0,0,0.08);
        }
        .card h2 { font-size: 16px; margin-bottom: 18px; color: #ff6b35; }

        .form-left  { flex: 0 0 300px; }
        .table-right { flex: 1; min-width: 280px; }

        .form-group { margin-bottom: 15px; }
        label { display: block; font-size: 13px; font-weight: 600; color: #555; margin-bottom: 5px; }

        input[type="text"], textarea {
            width: 100%; padding: 9px 12px;
            border: 1.5px solid #ddd; border-radius: 7px;
            font-size: 14px; outline: none; transition: border 0.2s;
        }
        input:focus, textarea:focus { border-color: #ff6b35; }

        .btn {
            display: inline-block; padding: 9px 20px;
            border-radius: 7px; font-size: 13px; font-weight: 600;
            cursor: pointer; border: none; text-decoration: none; transition: opacity 0.2s;
        }
        .btn:hover { opacity: 0.85; }
        .btn-primary   { background: #ff6b35; color: white; }
        .btn-warning   { background: #f39c12; color: white; }
        .btn-danger    { background: #e74c3c; color: white; font-size: 12px; padding: 5px 11px; }
        .btn-secondary { background: #95a5a6; color: white; }

        table { width: 100%; border-collapse: collapse; }
        thead { background: #ff6b35; color: white; }
        thead th { padding: 11px 13px; text-align: left; font-size: 13px; }
        tbody tr { border-bottom: 1px solid #eee; }
        tbody tr:hover { background: #fff8f5; }
        tbody td { padding: 10px 13px; font-size: 13px; }

        .alert { padding: 11px 15px; border-radius: 7px; margin-bottom: 16px; font-size: 13px; }
        .alert-error   { background: #fde8d8; border-left: 4px solid #e74c3c; color: #922b21; }
        .alert-success { background: #d5f5e3; border-left: 4px solid #1e8449; color: #1e8449; }

        .badge-count { background: #eaf1fb; color: #2471a3; padding: 3px 9px; border-radius: 20px; font-size: 12px; }
    </style>
</head>
<body>

<header>
    <h1>🥨 Manajemen Stok Bahan Baku Snack</h1>
</header>

<div style="max-width:900px; margin: 20px auto; padding: 0 20px;">
    <a href="index.php" style="color:#ff6b35; text-decoration:none; font-size:14px;">← Kembali ke Daftar Utama</a>
</div>

<div class="container">

    <!-- FORM TAMBAH / EDIT -->
    <div class="card form-left">
        <?php if ($edit_data): ?>
        <h2>✏️ Edit Kategori</h2>
        <form method="POST">
            <input type="hidden" name="aksi" value="edit">
            <input type="hidden" name="id_kategori" value="<?= $edit_data['id_kategori'] ?>">
        <?php else: ?>
        <h2>➕ Tambah Kategori</h2>
        <form method="POST">
            <input type="hidden" name="aksi" value="tambah">
        <?php endif; ?>

            <?php if (!empty($pesan)): ?>
            <div class="alert alert-<?= $pesan[0] ?>"><?= $pesan[1] ?></div>
            <?php endif; ?>

            <div class="form-group">
                <label>Nama Kategori *</label>
                <input type="text" name="nama_kategori" required
                       placeholder="contoh: Tepung & Pati"
                       value="<?= $edit_data ? htmlspecialchars($edit_data['nama_kategori']) : '' ?>">
            </div>
            <div class="form-group">
                <label>Keterangan</label>
                <textarea name="keterangan" rows="3"
                          placeholder="Deskripsi singkat kategori ini"><?= $edit_data ? htmlspecialchars($edit_data['keterangan'] ?? '') : '' ?></textarea>
            </div>
            <div style="display:flex; gap:8px;">
                <button type="submit" class="btn <?= $edit_data ? 'btn-warning' : 'btn-primary' ?>">
                    <?= $edit_data ? '💾 Simpan' : '➕ Tambah' ?>
                </button>
                <?php if ($edit_data): ?>
                <a href="kategori.php" class="btn btn-secondary">Batal</a>
                <?php endif; ?>
            </div>
        </form>
    </div>

    <!-- TABEL KATEGORI -->
    <div class="card table-right">
        <h2>📋 Daftar Kategori</h2>

        <?php if (!$edit_data && !empty($pesan)): ?>
        <div class="alert alert-<?= $pesan[0] ?>"><?= $pesan[1] ?></div>
        <?php endif; ?>

        <table>
            <thead>
                <tr>
                    <th>#</th>
                    <th>Nama Kategori</th>
                    <th>Jumlah Bahan</th>
                    <th>Aksi</th>
                </tr>
            </thead>
            <tbody>
            <?php 
            $no = 1;
            while ($kat = mysqli_fetch_assoc($list_kat)): ?>
                <tr>
                    <td><?= $no++ ?></td>
                    <td>
                        <strong><?= htmlspecialchars($kat['nama_kategori']) ?></strong>
                        <?php if ($kat['keterangan']): ?>
                        <br><small style="color:#999;"><?= htmlspecialchars($kat['keterangan']) ?></small>
                        <?php endif; ?>
                    </td>
                    <td><span class="badge-count"><?= $kat['jumlah_bahan'] ?> bahan</span></td>
                    <td>
                        <a href="kategori.php?edit=<?= $kat['id_kategori'] ?>" class="btn btn-warning">✏️</a>
                        <a href="kategori.php?hapus=<?= $kat['id_kategori'] ?>" class="btn btn-danger"
                           onclick="return confirm('Hapus kategori ini?')">🗑️</a>
                    </td>
                </tr>
            <?php endwhile; ?>
            </tbody>
        </table>
    </div>

</div>

</body>
</html>
<?php mysqli_close($conn); ?>
