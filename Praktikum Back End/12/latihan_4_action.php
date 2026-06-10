<html>
<body>
<?php
include 'connect.php';
$StrSQL = "update products set name='" . $_GET['name'] . "'"
    . ",description='" . $_GET['description'] . "'"
    . ",price='" . $_GET['price'] . "'"
    . ",discount='" . $_GET['discount'] . "'"
    . ",status_code='" . $_GET['status_code'] . "'"
    . ",category_code='" . $_GET['category_code'] . "'"
    . " where code='" . $_GET['code'] . "'";
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
