<?php
session_start();
unset($_SESSION['counter']);
?>
<html>
<head>
<title> Unset Variabel Sesi </title>
</head>
<body>
<?php echo "Variabel counter telah dihapus dari sesi."; ?>
</body>
</html>
