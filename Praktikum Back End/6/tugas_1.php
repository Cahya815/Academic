<?php
// Set cookie jika form disubmit
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    setcookie("kota", $_POST["kota"], time() + 3600);
}
?>
<html>
<body>

<!-- Form GET -->
<h3>Form GET</h3>
<form action="<?php echo $_SERVER['PHP_SELF']; ?>" method="GET">
    Hobi: <input type="text" name="hobi">
    <input type="submit" value="Kirim GET">
</form>
<?php if (isset($_GET["hobi"])) {
    echo "Hobi kamu (GET): " . $_GET["hobi"] . "<br>";
} ?>

<!-- Form POST -->
<h3>Form POST</h3>
<form action="<?php echo $_SERVER['PHP_SELF']; ?>" method="POST">
    Kota: <input type="text" name="kota">
    <input type="submit" value="Kirim POST">
</form>
<?php if (isset($_POST["kota"])) {
    echo "Kota kamu (POST): " . $_POST["kota"] . "<br>";
} ?>

<!-- COOKIE -->
<h3>Cookie</h3>
<?php
if (isset($_COOKIE["kota"])) {
    echo "Kota tersimpan di cookie: " . $_COOKIE["kota"] . "<br>";
} else {
    echo "Belum ada cookie kota.<br>";
}
?>

<!-- REQUEST -->
<h3>Request</h3>
<?php
if (isset($_REQUEST["hobi"])) {
    echo "Hobi kamu (REQUEST): " . $_REQUEST["hobi"] . "<br>";
}
if (isset($_REQUEST["kota"])) {
    echo "Kota kamu (REQUEST): " . $_REQUEST["kota"] . "<br>";
}
?>

</body>
</html>
