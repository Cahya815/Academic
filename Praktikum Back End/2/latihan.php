<html>

<body>
    
    <?php
    $d = date("D");

    echo "Kode hari saat ini: $d<br><br>";

    if ($d == "Mon") {
        echo "Hari ini Senin";
    } elseif ($d == "Tue") {
        echo "Hari ini Selasa";
    } elseif ($d == "Wed") {
        echo "Hari ini Rabu";
    } elseif ($d == "Thu") {
        echo "Hari ini Kamis";
    } elseif ($d == "Fri") {
        echo "Hari ini Jumat";
    } elseif ($d == "Sat") {
        echo "Hari ini Sabtu";
    } elseif ($d == "Sun") {
        echo "Hari ini hari Minggu";
    } else {
        echo "Hari Ajaib yang ini?";
    }
    ?>
</body>
</html>
