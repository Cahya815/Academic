<html>
<head>
<title> Menulis PHP function dengan Parameter </title>
</head>
<body>
<?php
function addFunction($num1, $num2)
{
    $jumlah = $num1 + $num2;
    echo "Jumlah dua angka adalah: $jumlah";
}
addFunction(10, 20);
?>
</body>
</html>
