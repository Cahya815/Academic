<?php
if ($_REQUEST["nama"] || $_REQUEST["usia"]) {
    echo "Selamat datang " . $_REQUEST['nama'] . "<br>";
    echo "Anda " . $_REQUEST['usia'] . " Tahun.";
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
