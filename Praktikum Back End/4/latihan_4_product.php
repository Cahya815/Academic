<html>
<body>
<?php
$product = [
    ["code" => 1, "name" => "Pensil 2B",    "price" => 1000,  "code_category" => 1],
    ["code" => 2, "name" => "Buku Gambar",  "price" => 5000,  "code_category" => 2],
    ["code" => 3, "name" => "Buku Tulis",   "price" => 10000, "code_category" => 2]
];

foreach ($product as $item) {
    echo "Code: " . $item['code'] . " | Name: " . $item['name'] . " | Price: " . $item['price'] . " | Code Category: " . $item['code_category'] . "<br>";
}
?>
</body>
</html>
