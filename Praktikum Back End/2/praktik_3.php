<html>

<body>
   
    <?php
    $day = "Monday";

    echo "Hari: $day<br><br>";

    switch ($day) {
        case "Monday":
            echo "Start of the week!";
            break;
        case "Friday":
            echo "Weekend is near!";
            break;
        default:
            echo "Have a nice day!";
    }
    ?>
</body>
</html>
