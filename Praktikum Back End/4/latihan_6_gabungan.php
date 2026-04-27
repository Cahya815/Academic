<html>
<body>
<?php
$category = [
    1 => "pensil",
    2 => "buku"
];

$product = [
    ["code" => 1, "name" => "Pensil 2B",   "price" => 1000,  "code_category" => 1],
    ["code" => 2, "name" => "Buku Gambar", "price" => 5000,  "code_category" => 2],
    ["code" => 3, "name" => "Buku Tulis",  "price" => 10000, "code_category" => 2]
];

foreach ($product as $item) {
    $nama_kategori = $category[$item['code_category']];
    echo "Code: " . $item['code'] . " | Name: " . $item['name'] . " | Price: " . $item['price'] . " | Category: " . $nama_kategori . "<br>";
}
?>
</body>
</html>
