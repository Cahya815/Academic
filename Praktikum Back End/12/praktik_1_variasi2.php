<html>
<head>
<title>update Category</title>
</head>
<body bgcolor="#FFFFFF">
<?php
include 'connect.php';
if (isset($_GET['update_button'])) {
    $StrSQL = "update category set category='" . $_GET['category'] . "' where code='" . $_GET['code'] . "'";
    echo $StrSQL . "<br>";
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
    $StrSQL = "select code,category from category";
    $result = mysqli_query($id, $StrSQL);
    while ($row = mysqli_fetch_row($result)) {
        echo "<form method='GET' name='formupdatecategory'>";
        echo $row[0] . " : <input type='text' name='category' value='" . $row[1] . "'>";
        echo "<input type='hidden' name='code' value='" . $row[0] . "'>";
        echo "<input type='submit' name='update_button' value='UPDATE'>";
        echo "</form>";
    }
?>
<?php
}
mysqli_close($id);
?>
</body>
</html>
