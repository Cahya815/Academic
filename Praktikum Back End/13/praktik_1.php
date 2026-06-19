<?php
setcookie("nama", "John Watkin", time() + 3600, "/", "", 0);
setcookie("usia", "36", time() + 3600, "/", "", 0);
?>
<html>
<head>
<title> Pengaturan Cookies dengan PHP </title>
</head>
<body>
<?php echo "Set Cookies"?>
</body>
</html>