<html>
<head>
<title>read product</title>
</head>
<body bgcolor="#FFFFFF">
<?php
include 'connect.php';
$StrSQL = "select code,name,description,price,discount,status_code,category_code from products";
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
        <th>Category Code</th>
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
