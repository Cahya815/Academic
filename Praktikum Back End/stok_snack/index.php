<?php
// index.php - Halaman Utama: Menampilkan Stok Bahan Baku
require_once 'db.php';

// Ambil data bahan baku beserta nama kategorinya (JOIN 2 tabel)
$sql = "SELECT b.id_bahan, b.nama_bahan, b.satuan, b.stok_saat_ini, 
               b.stok_minimum, b.tanggal_update, b.keterangan,
               k.nama_kategori
        FROM bahan_baku b
        JOIN kategori_bahan k ON b.id_kategori = k.id_kategori
        ORDER BY k.nama_kategori, b.nama_bahan";

$result = mysqli_query($conn, $sql);

// Hitung total bahan & bahan yang stok menipis
$total_bahan    = mysqli_num_rows($result);
$sql_tipis      = "SELECT COUNT(*) as jml FROM bahan_baku WHERE stok_saat_ini <= stok_minimum";
$res_tipis      = mysqli_query($conn, $sql_tipis);
$row_tipis      = mysqli_fetch_assoc($res_tipis);
$stok_tipis     = $row_tipis['jml'];
?>
<!DOCTYPE html>
<html lang="id">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Stok Bahan Baku Snack</title>
    <style>
        * { margin: 0; padding: 0; box-sizing: border-box; }
        body { font-family: 'Segoe UI', sans-serif; background: #f0f4f8; color: #333; }

        /* HEADER */
        header {
            background: linear-gradient(135deg, #ff6b35, #f7931e);
            color: white;
            padding: 20px 30px;
            display: flex;
            justify-content: space-between;
            align-items: center;
            box-shadow: 0 2px 8px rgba(0,0,0,0.2);
        }
        header h1 { font-size: 22px; }
        header p  { font-size: 13px; opacity: 0.9; margin-top: 3px; }

        /* CONTAINER */
        .container { max-width: 1100px; margin: 30px auto; padding: 0 20px; }

        /* STATS CARDS */
        .stats { display: flex; gap: 15px; margin-bottom: 25px; flex-wrap: wrap; }
        .stat-card {
            background: white;
            border-radius: 10px;
            padding: 18px 25px;
            flex: 1;
            min-width: 180px;
            box-shadow: 0 2px 6px rgba(0,0,0,0.08);
            border-left: 4px solid #ff6b35;
        }
        .stat-card.warning { border-left-color: #e74c3c; }
        .stat-card h3 { font-size: 28px; color: #ff6b35; }
        .stat-card.warning h3 { color: #e74c3c; }
        .stat-card p  { font-size: 13px; color: #666; margin-top: 4px; }

        /* TOOLBAR */
        .toolbar {
            display: flex;
            justify-content: space-between;
            align-items: center;
            margin-bottom: 15px;
            flex-wrap: wrap;
            gap: 10px;
        }
        .btn {
            display: inline-block;
            padding: 10px 20px;
            border-radius: 6px;
            text-decoration: none;
            font-size: 14px;
            font-weight: 600;
            cursor: pointer;
            border: none;
            transition: opacity 0.2s;
        }
        .btn:hover { opacity: 0.85; }
        .btn-primary { background: #ff6b35; color: white; }
        .btn-warning { background: #f39c12; color: white; }
        .btn-danger  { background: #e74c3c; color: white; font-size: 13px; padding: 7px 14px; }
        .btn-info    { background: #3498db; color: white; font-size: 13px; padding: 7px 14px; }

        /* TABLE */
        .card {
            background: white;
            border-radius: 10px;
            box-shadow: 0 2px 6px rgba(0,0,0,0.08);
            overflow: hidden;
        }
        table { width: 100%; border-collapse: collapse; }
        thead { background: #ff6b35; color: white; }
        thead th { padding: 13px 15px; text-align: left; font-size: 14px; }
        tbody tr { border-bottom: 1px solid #eee; transition: background 0.15s; }
        tbody tr:hover { background: #fff8f5; }
        tbody td { padding: 12px 15px; font-size: 14px; }

        /* STOK STATUS */
        .badge {
            display: inline-block;
            padding: 4px 10px;
            border-radius: 20px;
            font-size: 12px;
            font-weight: 600;
        }
        .badge-ok      { background: #d5f5e3; color: #1e8449; }
        .badge-warning { background: #fde8d8; color: #c0392b; }

        /* KATEGORI BADGE */
        .kat {
            background: #eaf1fb;
            color: #2471a3;
            padding: 3px 9px;
            border-radius: 20px;
            font-size: 12px;
        }

        /* ALERT */
        .alert {
            padding: 12px 18px;
            border-radius: 8px;
            margin-bottom: 20px;
            font-size: 14px;
        }
        .alert-warning { background: #fde8d8; border-left: 4px solid #e74c3c; color: #922b21; }
        .alert-success { background: #d5f5e3; border-left: 4px solid #1e8449; color: #1e8449; }

        /* EMPTY STATE */
        .empty { text-align: center; padding: 50px; color: #999; }

        footer { text-align: center; color: #aaa; font-size: 12px; margin: 30px 0 10px; }
    </style>
</head>
<body>

<header>
    <div>
        <h1>🥨 Manajemen Stok Bahan Baku Snack</h1>
        <p>Sistem pencatatan stok harian untuk produksi snack</p>
    </div>
    <div style="font-size:13px; opacity:0.9;">
        📅 <?= date('l, d F Y') ?>
    </div>
</header>

<div class="container">

    <!-- STATS -->
    <div class="stats">
        <div class="stat-card">
            <h3><?= $total_bahan ?></h3>
            <p>Total Bahan Baku</p>
        </div>
        <div class="stat-card warning">
            <h3><?= $stok_tipis ?></h3>
            <p>Stok Perlu Diisi Ulang</p>
        </div>
        <div class="stat-card" style="border-left-color:#27ae60;">
            <h3><?= $total_bahan - $stok_tipis ?></h3>
            <p>Stok Aman</p>
        </div>
    </div>

    <!-- ALERT -->
    <?php if ($stok_tipis > 0): ?>
    <div class="alert alert-warning">
        ⚠️ Ada <strong><?= $stok_tipis ?> bahan baku</strong> yang stoknya menipis! Segera lakukan pengisian stok sore ini.
    </div>
    <?php else: ?>
    <div class="alert alert-success">
        ✅ Semua stok bahan baku dalam kondisi aman.
    </div>
    <?php endif; ?>

    <!-- TOOLBAR -->
    <div class="toolbar">
        <h2 style="font-size:17px; color:#555;">📦 Daftar Bahan Baku</h2>
        <div style="display:flex; gap:10px; flex-wrap:wrap;">
            <a href="kategori.php" class="btn btn-warning">⚙️ Kelola Kategori</a>
            <a href="create.php"   class="btn btn-primary">➕ Tambah Bahan Baku</a>
        </div>
    </div>

    <!-- TABLE -->
    <div class="card">
        <?php if ($total_bahan == 0): ?>
        <div class="empty">
            <p style="font-size:40px;">📭</p>
            <p>Belum ada data bahan baku.</p>
            <a href="create.php" class="btn btn-primary" style="margin-top:15px; display:inline-block;">Tambah Sekarang</a>
        </div>
        <?php else: ?>
        <table>
            <thead>
                <tr>
                    <th>#</th>
                    <th>Nama Bahan</th>
                    <th>Kategori</th>
                    <th>Stok Saat Ini</th>
                    <th>Stok Minimum</th>
                    <th>Status</th>
                    <th>Tgl Update</th>
                    <th>Aksi</th>
                </tr>
            </thead>
            <tbody>
            <?php 
            $no = 1;
            mysqli_data_seek($result, 0);
            while ($row = mysqli_fetch_assoc($result)): 
                $aman = ($row['stok_saat_ini'] > $row['stok_minimum']);
            ?>
                <tr>
                    <td><?= $no++ ?></td>
                    <td><strong><?= htmlspecialchars($row['nama_bahan']) ?></strong>
                        <?php if ($row['keterangan']): ?>
                        <br><small style="color:#999;"><?= htmlspecialchars($row['keterangan']) ?></small>
                        <?php endif; ?>
                    </td>
                    <td><span class="kat"><?= htmlspecialchars($row['nama_kategori']) ?></span></td>
                    <td><strong><?= number_format($row['stok_saat_ini'], 2) ?></strong> <?= htmlspecialchars($row['satuan']) ?></td>
                    <td><?= number_format($row['stok_minimum'], 2) ?> <?= htmlspecialchars($row['satuan']) ?></td>
                    <td>
                        <?php if ($aman): ?>
                        <span class="badge badge-ok">✅ Aman</span>
                        <?php else: ?>
                        <span class="badge badge-warning">⚠️ Tipis</span>
                        <?php endif; ?>
                    </td>
                    <td><?= $row['tanggal_update'] ? date('d/m/Y', strtotime($row['tanggal_update'])) : '-' ?></td>
                    <td>
                        <a href="update.php?id=<?= $row['id_bahan'] ?>" class="btn btn-info">✏️ Edit</a>
                        <a href="delete.php?id=<?= $row['id_bahan'] ?>" class="btn btn-danger"
                           onclick="return confirm('Yakin hapus bahan ini?')">🗑️ Hapus</a>
                    </td>
                </tr>
            <?php endwhile; ?>
            </tbody>
        </table>
        <?php endif; ?>
    </div>

</div>

<footer>
    <p>Sistem Manajemen Stok Bahan Baku Snack &copy; <?= date('Y') ?> | PBL Project</p>
</footer>

</body>
</html>
<?php mysqli_close($conn); ?>
