<html>
<body>
<?php
$category = [
    ["code" => 1, "name" => "pensil"],
    ["code" => 2, "name" => "buku"]
];

foreach ($category as $item) {
    echo "Code: " . $item['code'] . " | Name: " . $item['name'] . "<br>";
}
?>
</body>
</html>
