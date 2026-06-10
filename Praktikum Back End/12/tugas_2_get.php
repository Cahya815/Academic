<html>
<head>
<title>update consumer</title>
</head>
<body bgcolor="#FFFFFF">
<?php
include 'connect.php';
if (isset($_GET['update_button'])) {
    $StrSQL = "update consumer set name='" . $_GET['name'] . "'"
        . ",address='" . $_GET['address'] . "'"
        . ",phone='" . $_GET['phone'] . "'"
        . " where code='" . $_GET['code'] . "'";
    echo $StrSQL . "<br>";
    $result = mysqli_query($id, $StrSQL);
    if ($result)
        printf("successfull<br>");
    else
        printf("error");
} else {
?>
<br>
<b>update consumer</b>
<?php
    $StrSQL = "select code,name,address,phone from consumer";
    $result = mysqli_query($id, $StrSQL);
    while ($row = mysqli_fetch_row($result)) {
        echo "<form method='GET' name='formupdateconsumer'>";
        echo "<input type='hidden' name='code' value='" . $row[0] . "'>";
        echo $row[0] . " | name:<input type='text' name='name' value='" . $row[1] . "'>";
        echo " address:<input type='text' name='address' value='" . $row[2] . "'>";
        echo " phone:<input type='text' name='phone' value='" . $row[3] . "'>";
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
