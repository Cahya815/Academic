<html>
<body>
<?php
$tanda = array(
    "mohammad" => array(
        "fisika"      => 35,
        "matematika"  => 30,
        "chemistry"   => 39
    ),
    "qadir" => array(
        "fisika"      => 30,
        "matematika"  => 32,
        "chemistry"   => 29
    ),
    "zara" => array(
        "fisika"      => 31,
        "matematika"  => 22,
        "chemistry"   => 39
    )
);

/* Mengakses nilai array multi-dimensi */
echo "Marks untuk mohammad dalam fisika: ";
echo $tanda['mohammad']['fisika'] . "<br>";
echo "Marks untuk qadir dalam matematika: ";
echo $tanda['qadir']['matematika'] . "<br>";
echo "Marks untuk zara dalam kimia: ";
echo $tanda['zara']['chemistry'] . "<br>";
?>
</body>
</html>
