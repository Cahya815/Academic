<html>
<head>
<title>input product</title>
</head>
<body bgcolor="#FFFFFF">
<?php
include 'connect.php';
?>
<br>
<b>INPUT PRODUCT</b>
<form method="POST" action="latihan_2_action.php" name="forminputproduct">
    <table border="0">
        <tr><td>name</td><td><input type="text" size="20" name="name"></td></tr>
        <tr><td>description</td><td><input type="text" size="20" name="description"></td></tr>
        <tr><td>price</td><td><input type="text" size="20" name="price"></td></tr>
        <tr><td>discount</td><td><input type="text" size="20" name="discount"></td></tr>
        <tr><td>status_code</td><td>
            <select name="status_code">
                <option value="1">ready</option>
                <option value="2">order</option>
                <option value="3">sold out</option>
            </select></td></tr>
        <?php
        $StrSQL = "select code,category from category";
        $result = mysqli_query($id, $StrSQL);
        ?>
        <tr><td>category_code</td><td>
            <select name="category_code">
                <?php
                while ($row = mysqli_fetch_row($result)) {
                    echo "<option value='" . $row[0] . "'>" . $row[1] . "</option>";
                }
                ?>
            </select></td></tr>
    </table>
    <input type="submit" name="save_button" value="SAVE">
    <input type="reset" value="CLEAR">
</form>
<?php
mysqli_close($id);
?>
</body>
</html>
