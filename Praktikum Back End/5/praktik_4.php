<html>
<head>
<title> Menulis function PHP yang mengembalikan nilai </title>
</head>
<body>
<?php
function addFunction($num1, $num2)
{
    $jumlah = $num1 + $num2;
    return $jumlah;
}
$return_value = addFunction(10, 20);
echo "Nilai Kembali dari function: $return_value";
?>
</body>
</html>
