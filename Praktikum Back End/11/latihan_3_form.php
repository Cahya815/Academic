<html>
<head>
<title>delete product</title>
</head>
<body bgcolor="#FFFFFF">
<?php
include 'connect.php';
$StrSQL = "select code,name from products";
$result = mysqli_query($id, $StrSQL);
?>
<br>
<b>delete product<br></b>
<?php
while ($row = mysqli_fetch_row($result)) {
    echo $row[0] . "|" . $row[1]
        . " <a href='latihan_3_action.php?code=" . $row[0] . "'>DELETE</a><br>";
}
mysqli_close($id);
?>
</body>
</html>
