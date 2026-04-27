<html>
<body>
<?php
/* Metode pertama untuk membuat array. */
$angka = array(11, 22, 33, 44, 55);
foreach ($angka as $value)
{
echo "Nilai adalah $value <br>";
}
/* Metode kedua untuk membuat array. */
$angka[0] = "satu";
$angka[1] = "dua";
$angka[2] = "tiga";
$angka[3] = "empat";
$angka[4] = "lima";
foreach ($angka as $value)
{
echo "Nilai adalah $value <br>";
}?>
</body>
</html>