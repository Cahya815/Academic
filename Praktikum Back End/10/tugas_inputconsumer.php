<html>
<head>
<title>input consumer</title>
</head>
<body bgcolor="#FFFFFF">
<?php
include 'connect.php';
if (isset($_POST['save_button'])) {
    $StrSQL = "insert into consumer (name, address, phone) values ('"
        . $_POST['name'] . "','"
        . $_POST['address'] . "','"
        . $_POST['phone'] . "')";
    echo $StrSQL . "<br>";
    $result = mysqli_query($id, $StrSQL);
    if ($result)
        printf("successfull<br>");
    else
        printf("error");
} else {
?>
<br>
<b>INPUT CONSUMER</b>
<form method="POST" name="forminputconsumer">
    <table border="0">
        <tr><td>Name</td><td><input type="text" size="20" name="name"></td></tr>
        <tr><td>Address</td><td><input type="text" size="20" name="address"></td></tr>
        <tr><td>Phone</td><td><input type="text" size="20" name="phone"></td></tr>
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
