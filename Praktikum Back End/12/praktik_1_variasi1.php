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
} else if (isset($_GET['show_button'])) {
?>
<br>
<b>update category</b>
<form method="GET" name="formupdatecategory">
<?php
    $StrSQL = "select code,category from category where code='" . $_GET['code'] . "'";
    echo $StrSQL . "<br>";
    $result = mysqli_query($id, $StrSQL);
    $row = mysqli_fetch_row($result);
?>
    code: <?php echo $row[0]; ?>
    <input type="hidden" name="code" value="<?php echo $row[0]; ?>"><br>
    category:<input type="text" name="category" value="<?php echo $row[1]; ?>"><br>
    <input type="submit" name="update_button" value="UPDATE">
</form>
<?php
} else {
?>
<br>
<b>update category</b>
<form method="GET" name="formupdatecategory">
<?php
    $StrSQL = "select code,category from category";
    $result = mysqli_query($id, $StrSQL);
?>
    <select name='code'>
    <?php
    while ($row = mysqli_fetch_row($result)) {
        echo "<option value='" . $row[0] . "'>" . $row[0] . "|" . $row[1];
    }
    ?>
    </select>
    <input type="submit" name="show_button" value="SHOW">
</form>
<?php
}
mysqli_close($id);
?>
</body>
</html>
