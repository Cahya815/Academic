<html>
<body>
<?php
function hitungVokal($str)
{
    $vokal = ['a', 'i', 'u', 'e', 'o'];
    $jumlah = 0;
    for ($i = 0; $i < strlen($str); $i++) {
        if (in_array(strtolower($str[$i]), $vokal)) {
            $jumlah++;
        }
    }
    return $jumlah;
}
echo "Jumlah vokal: " . hitungVokal("halo dunia");
?>
</body>
</html>
