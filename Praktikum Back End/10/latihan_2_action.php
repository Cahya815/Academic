<html>
<body>
<?php
include 'connect.php';
$StrSQL = "insert into products values ('','" . $_POST['name'] . "'"
    . ",'" . $_POST['description'] . "'"
    . ",'" . $_POST['price'] . "'"
    . ",'" . $_POST['discount'] . "'"
    . ",'" . $_POST['status_code'] . "'"
    . ",'" . $_POST['category_code'] . "')";
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
