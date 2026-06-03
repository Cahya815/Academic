<html>
<head>
<title>delete product</title>
</head>
<body bgcolor="#FFFFFF">
<?php
include 'connect.php';
?>
<br>
<b>delete product</b>
<form method="POST" action="latihan_2_action.php" name="formdeleteproduct">
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
    <input type="submit" name="delete_button" value="DELETE">
</form>
<?php
mysqli_close($id);
?>
</body>
</html>
