<html>
<head>
<title>delete product</title>
</head>
<body bgcolor="#FFFFFF">
<?php
include 'connect.php';
if (isset($_GET['delete_button'])) {
    $StrSQL = "delete from products where code=" . $_GET['code'];
    echo $StrSQL;
    $result = mysqli_query($id, $StrSQL);
    if ($result)
        printf("successfull<br>");
    else
        printf("error");
} else {
?>
<br>
<b>delete product<br></b>
<?php
    $StrSQL = "select code,name from products";
    $result = mysqli_query($id, $StrSQL);
    while ($row = mysqli_fetch_row($result)) {
        echo $row[0] . "|" . $row[1]
            . "<a href='praktik_1_variasi3.php?delete_button=1&code=" . $row[0] . "'>DELETE</a><br>";
    }
?>
<?php
}
mysqli_close($id);
?>
</body>
</html>
