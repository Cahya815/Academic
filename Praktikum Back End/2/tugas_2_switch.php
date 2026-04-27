<html>
<body>
<?php
$nilai = 75;
$kategori = (int) floor($nilai / 20);

switch ($kategori) {
    case 0:
        echo "Nilai E";
        break;
    case 1:
        echo "Nilai D";
        break;
    case 2:
        echo "Nilai C";
        break;
    case 3:
        echo "Nilai B";
        break;
    case 4:
    case 5:
        echo "Nilai A";
        break;
}
?>
</body>
</html>
