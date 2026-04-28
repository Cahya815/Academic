<?php
setcookie("nama_lengkap", $_POST["nama_lengkap"], time() + 3600);
?>
<html>
<body>
<?php
echo "Nama Lengkap (POST): " . $_POST["nama_lengkap"] . "<br>";
echo "Jurusan (POST): " . $_POST["jurusan"] . "<br>";
echo "Angkatan (POST): " . $_POST["angkatan"] . "<br><br>";

echo "Nama Lengkap (REQUEST): " . $_REQUEST["nama_lengkap"] . "<br>";
echo "Jurusan (REQUEST): " . $_REQUEST["jurusan"] . "<br>";
echo "Angkatan (REQUEST): " . $_REQUEST["angkatan"] . "<br><br>";

if (isset($_COOKIE["nama_lengkap"])) {
    echo "Nama tersimpan di cookie: " . $_COOKIE["nama_lengkap"] . "<br>";
} else {
    echo "Cookie belum tersedia, refresh halaman ini.<br>";
}
?>
</body>
</html>
