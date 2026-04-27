<html>
<body>
<?php
$nilai = 75;

if ($nilai >= 0 && $nilai < 20) {
    echo "Nilai E";
} elseif ($nilai >= 20 && $nilai < 40) {
    echo "Nilai D";
} elseif ($nilai >= 40 && $nilai < 60) {
    echo "Nilai C";
} elseif ($nilai >= 60 && $nilai < 80) {
    echo "Nilai B";
} elseif ($nilai >= 80 && $nilai <= 100) {
    echo "Nilai A";
}
?>
</body>
</html>
