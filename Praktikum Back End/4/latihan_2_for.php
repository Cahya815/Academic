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
$nama_gaji = ["muhammad", "qadir", "zara"];
$gaji = [
    "muhammad" => 2000,
    "qadir"    => 1000,
    "zara"     => 500
];
for ($i = 0; $i < count($nama_gaji); $i++) {
    $key = $nama_gaji[$i];
    echo "Gaji $key adalah " . $gaji[$key] . "<br>";
}

/* Praktik 3 - for */
$siswa = ["mohammad", "qadir", "zara"];
$mapel = ["fisika", "matematika", "chemistry"];
$tanda = [
    "mohammad" => ["fisika" => 35, "matematika" => 30, "chemistry" => 39],
    "qadir"    => ["fisika" => 30, "matematika" => 32, "chemistry" => 29],
    "zara"     => ["fisika" => 31, "matematika" => 22, "chemistry" => 39]
];
for ($i = 0; $i < count($siswa); $i++) {
    for ($j = 0; $j < count($mapel); $j++) {
        echo "Marks untuk " . $siswa[$i] . " dalam " . $mapel[$j] . ": ";
        echo $tanda[$siswa[$i]][$mapel[$j]] . "<br>";
    }
}
?>
</body>
</html>
