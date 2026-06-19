<?php
session_start();
?>
<html>
<head>
<title>Next Page</title>
</head>
<body>
<?php
echo "Ini adalah halaman berikutnya.<br>";
echo "Counter sesi: " . (isset($_SESSION['counter']) ? $_SESSION['counter'] : 'tidak ada') . "<br>";
echo htmlspecialchars(SID);
?>
</body>
</html>
