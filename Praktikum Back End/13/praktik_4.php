<?php
setcookie("nama", "", time() - 60, "/", "", 0);
setcookie("usia", "", time() - 60, "/", "", 0);
?>
<html>
<head>
<title> Menghapus Cookies dengan PHP </title>
</head>
<body>
<?php echo "Dihapus Cookies" ?>
</body>
</html>
