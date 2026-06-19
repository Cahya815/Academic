<?php
session_start();
if (isset($_SESSION['counter'])) {
    $_SESSION['counter'] += 1;
} else {
    $_SESSION['counter'] = 1;
}
$msg  = "Anda telah mengunjungi halaman ini " . $_SESSION['counter'];
$msg .= " di sesi ini.";
?>
<html>
<head>
<title> Menyiapkan sesi PHP </title>
</head>
<body>
<?php echo($msg); ?>
</body>
</html>
