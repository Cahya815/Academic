<?php
// db.php - Koneksi ke Database MySQL

$host     = "localhost";
$user     = "root";
$password = "";           // Sesuaikan password MySQL kamu
$database = "stok_snack";

$conn = mysqli_connect($host, $user, $password, $database);

if (!$conn) {
    die("<div style='color:red; padding:20px;'>
        <strong>Koneksi Database Gagal!</strong><br>
        Error: " . mysqli_connect_error() . "
    </div>");
}

mysqli_set_charset($conn, "utf8");
?>
