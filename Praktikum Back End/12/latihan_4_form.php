<html>
<head>
<title>update product</title>
</head>
<body bgcolor="#FFFFFF">
<?php
include 'connect.php';
?>
<br>
<b>update product</b>
<?php
$StrSQL = "select code,name,description,price,discount,status_code,category_code from products";
$result = mysqli_query($id, $StrSQL);
while ($row = mysqli_fetch_row($result)) {
    echo "<form method='GET' action='latihan_4_action.php'>";
    echo "<input type='hidden' name='code' value='" . $row[0] . "'>";
    echo $row[0] . " | name:<input type='text' name='name' value='" . $row[1] . "'>";
    echo " description:<input type='text' name='description' value='" . $row[2] . "'>";
    echo " price:<input type='text' name='price' value='" . $row[3] . "'>";
    echo " discount:<input type='text' name='discount' value='" . $row[4] . "'>";
    echo " status:<input type='text' name='status_code' value='" . $row[5] . "'>";
    echo " category:<input type='text' name='category_code' value='" . $row[6] . "'>";
    echo "<input type='submit' name='update_button' value='UPDATE'>";
    echo "</form>";
}
mysqli_close($id);
?>
</body>
</html>
