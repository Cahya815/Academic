<html>
<body>
<?php
/* Praktik 1 - notasi bracket */
$angka = [11, 22, 33, 44, 55];
foreach ($angka as $value) {
    echo "Nilai adalah $value <br>";
}

$angka[0] = "satu";
$angka[1] = "dua";
$angka[2] = "tiga";
$angka[3] = "empat";
$angka[4] = "lima";
foreach ($angka as $value) {
    echo "Nilai adalah $value <br>";
}

/* Praktik 2 - notasi bracket */
$gaji = [
    "muhammad" => 2000,
    "qadir"    => 1000,
    "zara"     => 500
];
echo "Gaji muhammad adalah " . $gaji['muhammad'] . "<br>";
echo "Gaji qadir adalah " . $gaji['qadir'] . "<br>";
echo "Gaji zara adalah " . $gaji['zara'] . "<br>";

/* Praktik 3 - notasi bracket */
$tanda = [
    "mohammad" => [
        "fisika"     => 35,
        "matematika" => 30,
        "chemistry"  => 39
    ],
    "qadir" => [
        "fisika"     => 30,
        "matematika" => 32,
        "chemistry"  => 29
    ],
    "zara" => [
        "fisika"     => 31,
        "matematika" => 22,
        "chemistry"  => 39
    ]
];
echo "Marks untuk mohammad dalam fisika: ";
echo $tanda['mohammad']['fisika'] . "<br>";
echo "Marks untuk qadir dalam matematika: ";
echo $tanda['qadir']['matematika'] . "<br>";
echo "Marks untuk zara dalam kimia: ";
echo $tanda['zara']['chemistry'] . "<br>";
?>
</body>
</html>
