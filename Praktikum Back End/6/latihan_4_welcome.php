<html>
<body>
<?php
// GET
if (isset($_GET["name"])) {
    echo "Welcome (GET): " . $_GET["name"] . "<br>";
    echo "Your email address is: " . $_GET["email"] . "<br><br>";
}

// COOKIE
setcookie("name", $_GET["name"] ?? "Guest", time() + 3600);
setcookie("email", $_GET["email"] ?? "", time() + 3600);
echo "Welcome (COOKIE): " . ($_COOKIE["name"] ?? "belum ada cookie") . "<br>";
echo "Your email address is: " . ($_COOKIE["email"] ?? "belum ada cookie") . "<br><br>";

// REQUEST
echo "Welcome (REQUEST): " . $_REQUEST["name"] . "<br>";
echo "Your email address is: " . $_REQUEST["email"] . "<br>";
?>
</body>
</html>
