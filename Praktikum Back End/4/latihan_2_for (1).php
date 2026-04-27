<html>
<body>
<?php
/* Praktik 1 - for */
$angka = [11, 22, 33, 44, 55];
for ($i = 0; $i < count($angka); $i++) {
    echo "Nilai adalah $angka[$i] <br>";
}

$angka[0] = "satu";
$angka[1] = "dua";
$angka[2] = "tiga";
$angka[3] = "empat";
$angka[4] = "lima";
for ($i = 0; $i < count($angka); $i++) {
    echo "Nilai adalah $angka[$i] <br>";
}

/* Praktik 2 - for */
$gaji = [
    "muhammad" => 2000,
    "qadir"    => 1000,
    "zara"     => 500
];
$kunci = array_keys($gaji);
for ($i = 0; $i < count($kunci); $i++) {
    echo "Gaji " . $kunci[$i] . " adalah " . $gaji[$kunci[$i]] . "<br>";
}

$gaji['muhammad'] = "tinggi";
$gaji['qadir']    = "menengah";
$gaji['zara']     = "rendah";
$kunci = array_keys($gaji);
for ($i = 0; $i < count($kunci); $i++) {
    echo "Gaji " . $kunci[$i] . " adalah " . $gaji[$kunci[$i]] . "<br>";
}

/* Praktik 3 - for */
$tanda = [
    "mohammad" => ["fisika" => 35, "matematika" => 30, "chemistry" => 39],
    "qadir"    => ["fisika" => 30, "matematika" => 32, "chemistry" => 29],
    "zara"     => ["fisika" => 31, "matematika" => 22, "chemistry" => 39]
];
$siswa = array_keys($tanda);
for ($i = 0; $i < count($siswa); $i++) {
    $mapel = array_keys($tanda[$siswa[$i]]);
    for ($j = 0; $j < count($mapel); $j++) {
        echo "Marks untuk " . $siswa[$i] . " dalam " . $mapel[$j] . ": ";
        echo $tanda[$siswa[$i]][$mapel[$j]] . "<br>";
    }
}
?>
</body>
</html>
