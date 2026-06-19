<html>
<head>
<title> Mengakses Cookies dengan PHP </title>
</head>
<body>
<?php
echo $_COOKIE["nama"] . "<br>";
/* Setara dengan */
echo $HTTP_COOKIE_VARS["nama"] . "<br>";
echo $_COOKIE["usia"] . "<br>";
/* Setara dengan */
echo $HTTP_COOKIE_VARS["usia"] . "<br>";
?>
</body>
</html>
