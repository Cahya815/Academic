<html>
<body>
<?php
$array = array(11, 22, 33, 44, 55);
$i = 0;
do {
    if ($array[$i] == 33) {
        $i++;
        continue;
    }
    echo "Nilai adalah $array[$i] <br>";
    $i++;
} while ($i < count($array));
?>
</body>
</html>
