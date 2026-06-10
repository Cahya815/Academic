<html>
<body>
<?php
include 'connect.php';
$StrSQL = "update products set name='" . $_POST['name'] . "'"
    . ",description='" . $_POST['description'] . "'"
    . ",price='" . $_POST['price'] . "'"
    . ",discount='" . $_POST['discount'] . "'"
    . ",status_code='" . $_POST['status_code'] . "'"
    . ",category_code='" . $_POST['category_code'] . "'"
    . " where code='" . $_POST['code'] . "'";
echo $StrSQL . "<br>";
$result = mysqli_query($id, $StrSQL);
if ($result)
    printf("successfull<br>");
else
    printf("error");
mysqli_close($id);
?>
</body>
</html>
