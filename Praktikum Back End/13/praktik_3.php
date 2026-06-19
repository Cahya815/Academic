<html>
<head>
<title> Mengakses Cookies dengan PHP </title>
</head>
<body>
<?php
if (isset($_COOKIE["nama"]))
    echo "Selamat datang " . $_COOKIE["nama"] . "<br>";
else
    echo "Maaf ... Tidak diakui" . "<br>";
?>
</body>
</html>
