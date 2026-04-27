<html>
<body>
<?php
function konsonanKapital($str)
{
    $vokal = ['a', 'i', 'u', 'e', 'o'];
    $hasil = "";
    for ($i = 0; $i < strlen($str); $i++) {
        $huruf = $str[$i];
        if (!in_array(strtolower($huruf), $vokal)) {
            $hasil .= strtoupper($huruf);
        } else {
            $hasil .= $huruf;
        }
    }
    return $hasil;
}
echo konsonanKapital("halo dunia");
?>
</body>
</html>
