<html>
<body>
<?php
function tampilKelipatan($kelipatan, $awal, $akhir)
{
    for ($i = $awal; $i <= $akhir; $i++) {
        if ($i % $kelipatan == 0) {
            echo "$i ";
        }
    }
}
tampilKelipatan(3, 1, 30);
?>
</body>
</html>
