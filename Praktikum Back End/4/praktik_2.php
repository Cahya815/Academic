<html>
<body>
<?php
/* Metode pertama untuk mengasosiasikan membuat array. */
$gaji = array(
    "muhammad" => 2000,
    "qadir"    => 1000,
    "zara"     => 500
);
echo "Gaji muhammad adalah " . $gaji['muhammad'] . "<br>";
echo "Gaji qadir adalah " . $gaji['qadir'] . "<br>";
echo "Gaji zara adalah " . $gaji['zara'] . "<br>";

/* Metode kedua untuk membuat array. */
$gaji['muhammad'] = "tinggi";
$gaji['qadir']    = "menengah";
$gaji['zara']     = "rendah";
echo "Gaji muhammad adalah " . $gaji['muhammad'] . "<br>";
echo "Gaji qadir adalah " . $gaji['qadir'] . "<br>";
echo "Gaji zara adalah " . $gaji['zara'] . "<br>";
?>
</body>
</html>
