<html>
<head>
<title>update product</title>
</head>
<body bgcolor="#FFFFFF">
<?php
include 'connect.php';
if (isset($_GET['update_button'])) {
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
} else if (isset($_GET['show_button'])) {
?>
<br>
<b>update product</b>
<form method="GET" name="formupdateproduct">
<?php
    $StrSQL = "select code,name,description,price,discount,status_code,category_code from products where code='" . $_GET['code'] . "'";
    echo $StrSQL . "<br>";
    $result = mysqli_query($id, $StrSQL);
    $row = mysqli_fetch_row($result);
?>
    code: <?php echo $row[0]; ?>
    <input type="hidden" name="code" value="<?php echo $row[0]; ?>"><br>
    name:<input type="text" name="name" value="<?php echo $row[1]; ?>"><br>
    description:<input type="text" name="description" value="<?php echo $row[2]; ?>"><br>
    price:<input type="text" name="price" value="<?php echo $row[3]; ?>"><br>
    discount:<input type="text" name="discount" value="<?php echo $row[4]; ?>"><br>
    status_code:
    <select name="status_code">
        <option value="1" <?php if ($row[5] == 1) echo 'selected'; ?>>ready</option>
        <option value="2" <?php if ($row[5] == 2) echo 'selected'; ?>>order</option>
        <option value="3" <?php if ($row[5] == 3) echo 'selected'; ?>>sold out</option>
    </select><br>
    category_code:
    <select name="category_code">
    <?php
    $StrCat = "select code,category from category";
    $resCat = mysqli_query($id, $StrCat);
    while ($cat = mysqli_fetch_row($resCat)) {
        $sel = ($cat[0] == $row[6]) ? 'selected' : '';
        echo "<option value='" . $cat[0] . "' $sel>" . $cat[1] . "</option>";
    }
    ?>
    </select><br>
    <input type="submit" name="update_button" value="UPDATE">
</form>
<?php
} else {
?>
<br>
<b>update product</b>
<form method="GET" name="formupdateproduct">
<?php
    $StrSQL = "select code,name from products";
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
