<html>
<head>
<title>read product dengan category</title>
</head>
<body bgcolor="#FFFFFF">
<?php
include 'connect.php';
$StrSQL = "select products.code, products.name, products.description, products.price, 
products.discount, products.status_code, category.category from products join category on products.category_code = category.code";
echo $StrSQL . "<br>";
$result = mysqli_query($id, $StrSQL);
if ($result)
    printf("successfull<br>");
else
    printf("error");
?>
<table border="1" cellpadding="8" cellspacing="0">
    <tr>
        <th>Code</th>
        <th>Name</th>
        <th>Description</th>
        <th>Price</th>
        <th>Discount</th>
        <th>Status</th>
        <th>Category</th>
    </tr>
    <?php
    while ($row = mysqli_fetch_row($result)) {
        echo "<tr>";
        echo "<td>" . $row[0] . "</td>";
        echo "<td>" . $row[1] . "</td>";
        echo "<td>" . $row[2] . "</td>";
        echo "<td>" . $row[3] . "</td>";
        echo "<td>" . $row[4] . "</td>";
        echo "<td>" . $row[5] . "</td>";
        echo "<td>" . $row[6] . "</td>";
        echo "</tr>";
    }
    ?>
</table>
<?php
mysqli_close($id);
?>
</body>
</html>
