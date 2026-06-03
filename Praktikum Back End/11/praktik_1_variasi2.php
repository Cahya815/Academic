<html>
<head>
<title>delete product</title>
</head>
<body bgcolor="#FFFFFF">
<?php
include 'connect.php';
if (isset($_POST['delete_button'])) {
    $StrSQL = "delete from products where code=" . $_POST['code'];
    echo $StrSQL;
    $result = mysqli_query($id, $StrSQL);
    if ($result)
        printf("successfull<br>");
    else
        printf("error");
} else {
?>
<br>
<b>delete product</b>
<?php
    $StrSQL = "select code,name from products";
    $result = mysqli_query($id, $StrSQL);
    while ($row = mysqli_fetch_row($result)) {
        echo "<form method='POST' name='formdeleteproduct'>";
        echo $row[0] . "|" . $row[1];
        echo "<input type='hidden' name='code' value='" . $row[0] . "'>";
        echo "<input type='submit' name='delete_button' value='DELETE'>";
        echo "</form>";
    }
?>
<?php
}
mysqli_close($id);
?>
</body>
</html>
