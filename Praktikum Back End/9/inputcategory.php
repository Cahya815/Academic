<html>
<head>
<title>input category</title>
</head><body bgcolor="#FFFFFF">
<?php
include 'connect.php';
if(isset($_POST['save_button']))
{ $StrSQL="insert into category values ('','" . $_POST['category'] . "')";
echo $StrSQL;
$result=mysqli_query($id, $StrSQL);
if($result)
printf("successfull<br>");
else
printf("error");
}
else
{
?>
<br>
<b>INPUT CATEGORY</b>
<form method="POST" name="forminputcategory">
<table border="0">
<tr><td>Category</td>
<td><input type="text"size="20"name="category"></td></tr>
</table>
<input type="submit"name="save_button"value="SAVE">
<input type="reset"value="CLEAR">
</form>
<?php
}
mysqli_close($id)
?>
</body>
</html>