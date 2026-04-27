<html>
<head>
<title> Menulis function PHP yang mengembalikan nilai </title>
</head>
<body>
<?php
function printme($param = NULL)
{
    print $param;
}
printme("Ini adalah test");
printme();
?>
</body>
</html>
