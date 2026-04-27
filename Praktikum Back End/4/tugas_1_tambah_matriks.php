<html>
<body>
<?php
$A = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
];

$B = [
    [9, 8, 7],
    [6, 5, 4],
    [3, 2, 1]
];

$hasil = [];
for ($i = 0; $i < 3; $i++) {
    for ($j = 0; $j < 3; $j++) {
        $hasil[$i][$j] = $A[$i][$j] + $B[$i][$j];
    }
}

echo "Hasil Penjumlahan Matriks A + B:<br>";
for ($i = 0; $i < 3; $i++) {
    for ($j = 0; $j < 3; $j++) {
        echo $hasil[$i][$j] . " ";
    }
    echo "<br>";
}
?>
</body>
</html>
