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
        $hasil[$i][$j] = 0;
        for ($k = 0; $k < 3; $k++) {
            $hasil[$i][$j] += $A[$i][$k] * $B[$k][$j];
        }
    }
}

echo "Hasil Perkalian Matriks A x B:<br>";
for ($i = 0; $i < 3; $i++) {
    for ($j = 0; $j < 3; $j++) {
        echo $hasil[$i][$j] . " ";
    }
    echo "<br>";
}
?>
</body>
</html>
