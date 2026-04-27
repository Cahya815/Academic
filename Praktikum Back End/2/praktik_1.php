<html>

<body>
    

    <?php
    $d = date("D");

    echo "<h3>Contoh 1:</h3>";
    if ($d == "Fri")
        echo "Have a nice weekend!";
    else
        echo "Have a nice day!";

    // If dengan blok kurung kurawal 
    echo "<h3>Contoh 2:</h3>";
    if ($d == "Fri") {
        echo "Hello!<br>";
        echo "Have a nice weekend!<br>";
        echo "Sampai jumpa pada hari Senin!";
    }
    ?>
</body>
</html>
