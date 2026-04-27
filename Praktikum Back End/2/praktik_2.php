<html>

<body>
    
    <?php
    $age = 20;

    echo "Umur: $age tahun<br><br>";

    if ($age >= 18) {
        if ($age < 60) {
            echo "You are an adult.";
        } else {
            echo "You are a senior citizen.";
        }
    } else {
        echo "You are a minor.";
    }
    ?>
</body>
</html>
