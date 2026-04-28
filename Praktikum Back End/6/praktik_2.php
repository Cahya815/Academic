<?php
if ($_POST["nama"] || $_POST["usia"]) {
    echo "Selamat datang " . $_POST['nama'] . "<br>";
    echo "Anda " . $_POST['usia'] . " Tahun.";
    exit();
}
?>
<html>
<body>
    <form action="<?php echo $_SERVER['PHP_SELF']; ?>" method="POST">
        Nama: <input type="text" name="nama">
        Umur: <input type="text" name="usia">
        <input type="submit">
    </form>
</body>
</html>
