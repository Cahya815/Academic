<html>
<head>
<title> Passing Argumen oleh Referensi </title>
</head>
<body>
<?php
function addFive($num)
{
    $num += 5;
}
function addSix(&$num)
{
    $num += 6;
}
$orignum = 10;
addFive($orignum);
echo "Nilai Asli adalah $orignum <br>";
addSix($orignum);
echo "Nilai Asli adalah $orignum <br>";
?>
</body>
</html>
