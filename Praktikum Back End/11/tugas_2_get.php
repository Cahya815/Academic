<html>
<head>
<title>delete consumer</title>
</head>
<body bgcolor="#FFFFFF">
<?php
include 'connect.php';
if (isset($_GET['delete_button'])) {
    $StrSQL = "delete from consumer where code=" . $_GET['code'];
    echo $StrSQL;
    $result = mysqli_query($id, $StrSQL);
    if ($result)
        printf("successfull<br>");
    else
        printf("error");
} else {
?>
<br>
<b>delete consumer<br></b>
<?php
    $StrSQL = "select code,name from consumer";
    $result = mysqli_query($id, $StrSQL);
    while ($row = mysqli_fetch_row($result)) {
        echo $row[0] . "|" . $row[1]
            . " <a href='tugas_2_get.php?delete_button=1&code=" . $row[0] . "'>DELETE</a><br>";
    }
?>
<?php
}
mysqli_close($id);
?>
</body>
</html>
