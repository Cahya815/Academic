<html>
<body>
<?php
function tampilGanjil($awal, $akhir)
{
    for ($i = $awal; $i <= $akhir; $i++) {
        if ($i % 2 != 0) {
            echo "$i ";
        }
    }
}
tampilGanjil(1, 20);
?>
</body>
</html>
