<?php
// delete.php - Menghapus Bahan Baku
require_once 'db.php';

$id = (int) ($_GET['id'] ?? 0);

if ($id == 0) {
    header("Location: index.php");
    exit;
}

// Cek apakah data ada
$check = mysqli_query($conn, "SELECT nama_bahan FROM bahan_baku WHERE id_bahan = $id");
if (mysqli_num_rows($check) == 0) {
    header("Location: index.php?error=Data tidak ditemukan");
    exit;
}

$row          = mysqli_fetch_assoc($check);
$nama_bahan   = $row['nama_bahan'];

// Hapus data
$sql = "DELETE FROM bahan_baku WHERE id_bahan = $id";
if (mysqli_query($conn, $sql)) {
    header("Location: index.php?success=" . urlencode("Bahan '$nama_bahan' berhasil dihapus"));
} else {
    header("Location: index.php?error=" . urlencode("Gagal menghapus: " . mysqli_error($conn)));
}

mysqli_close($conn);
exit;
?>
