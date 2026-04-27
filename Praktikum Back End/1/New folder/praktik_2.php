<html>
<head>
    <title>Pemrograman PHP dengan Array</title>
</head>
<body>
<?php
// 1. Indexed Array
$nama[0] = "Isabella";
$nama[1] = "Affan";
$nama[2] = "Desty";

// Menggunakan titik (.) untuk menggabungkan string (concatenation)
echo $nama[0] . " " . $nama[1] . " " . $nama[2]; 
echo "<br>";

// 2. Associative Array
// Kunci (key) seperti 'sekolah' harus pakai tanda kutip
$kampus['sekolah'] = "STMIK";
$kampus['nama_kampus'] = "Akakom";

echo "Kampusku adalah " . $kampus['sekolah'] . " " . $kampus['nama_kampus'];
?>
</body>
</html>