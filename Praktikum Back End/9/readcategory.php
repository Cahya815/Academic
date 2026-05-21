<html>
<head>
<title>input category</title>
</head>
<body bgcolor="#FFFFFF">
<?php
include 'connect.php';
$StrSQL = "select code,category from category";
echo $StrSQL;
$result = mysqli_query($id, $StrSQL);
if ($result)
    printf("successfull<br>");
else
    printf("error");
while ($row = mysqli_fetch_row($result)) {
    echo $row[0] . "|" . $row[1] . "<br>";
}
mysqli_close($id);
?>
</body>
</html>