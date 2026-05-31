<html>
<head>
<title>input sale</title>
</head>
<body bgcolor="#FFFFFF">
<?php
include 'connect.php';
if (isset($_POST['save_button'])) {
    $StrSQL = "insert into sale (sale_date, consumer_code, product_code, quantity, total_price) values ('"
        . $_POST['sale_date'] . "','"
        . $_POST['consumer_code'] . "','"
        . $_POST['product_code'] . "','"
        . $_POST['quantity'] . "','"
        . $_POST['total_price'] . "')";
    echo $StrSQL . "<br>";
    $result = mysqli_query($id, $StrSQL);
    if ($result)
        printf("successfull<br>");
    else
        printf("error");
} else {
?>
<br>
<b>INPUT SALE</b>
<form method="POST" name="forminputsale">
    <table border="0">
        <tr><td>Sale Date</td><td><input type="date" name="sale_date"></td></tr>
        <?php
        $StrSQL = "select code,name from consumer";
        $result = mysqli_query($id, $StrSQL);
        ?>
        <tr><td>Consumer</td><td>
            <select name="consumer_code">
                <?php
                while ($row = mysqli_fetch_row($result)) {
                    echo "<option value='" . $row[0] . "'>" . $row[1] . "</option>";
                }
                ?>
            </select></td></tr>
        <?php
        $StrSQL = "select code,name from products";
        $result = mysqli_query($id, $StrSQL);
        ?>
        <tr><td>Product</td><td>
            <select name="product_code">
                <?php
                while ($row = mysqli_fetch_row($result)) {
                    echo "<option value='" . $row[0] . "'>" . $row[1] . "</option>";
                }
                ?>
            </select></td></tr>
        <tr><td>Quantity</td><td><input type="text" size="20" name="quantity"></td></tr>
        <tr><td>Total Price</td><td><input type="text" size="20" name="total_price"></td></tr>
    </table>
    <input type="submit" name="save_button" value="SAVE">
    <input type="reset" value="CLEAR">
</form>
<?php
}
mysqli_close($id);
?>
</body>
</html>
