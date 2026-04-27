<html>
<body>

    <?php
    $d = date("D");

    echo "Kode hari saat ini: $d<br><br>";

    switch ($d) {
        case "Mon":
            echo "Hari ini Senin";
            break;
        case "Tue":
            echo "Hari ini Selasa";
            break;
        case "Wed":
            echo "Hari ini Rabu";
            break;
        case "Thu":
            echo "Hari ini Kamis";
            break;
        case "Fri":
            echo "Hari ini Jumat";
            break;
        case "Sat":
            echo "Hari ini Sabtu";
            break;
        case "Sun":
            echo "Hari ini hari Minggu";
            break;
        default:
            echo "Hari Ajaib yang ini?";
    }
    ?>
</body>
</html>
