<html>
<body>
<?php
include 'connect.php';
$StrSQL = "delete from products where code=" . $_GET['code'];
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
