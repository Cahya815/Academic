<html>
<body>
<?php
include 'connect.php';
$StrSQL = "insert into products values ('','" . $_GET['name'] . "'"
    . ",'" . $_GET['description'] . "'"
    . ",'" . $_GET['price'] . "'"
    . ",'" . $_GET['discount'] . "'"
    . ",'" . $_GET['status_code'] . "'"
    . ",'" . $_GET['category_code'] . "')";
echo $StrSQL;
$result = mysqli_query($id, $StrSQL);
if ($result)
    printf("successfull<br>");
else
    printf("error");
mysqli_close($id);
?>
</body>
</html>
