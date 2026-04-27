<html>
<body>
<?php
$array = array(11, 22, 33, 44, 55);
for ($i = 0; $i < count($array); $i++) {
    if ($array[$i] == 33) continue;
    echo "Nilai adalah $array[$i] <br>";
}
?>
</body>
</html>
