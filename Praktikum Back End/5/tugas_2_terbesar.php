<html>
<body>
<?php
function nilaiTerbesar($arr)
{
    $terbesar = $arr[0];
    for ($i = 1; $i < count($arr); $i++) {
        if ($arr[$i] > $terbesar) {
            $terbesar = $arr[$i];
        }
    }
    return $terbesar;
}

$data = [64, 34, 25, 12, 22, 11, 90];
echo "Nilai terbesar: " . nilaiTerbesar($data);
?>
</body>
</html>
