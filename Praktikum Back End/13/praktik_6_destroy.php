<?php
session_start();
session_destroy();
?>
<html>
<head>
<title> Menghancurkan Sesi PHP </title>
</head>
<body>
<?php echo "Semua variabel sesi telah dihancurkan."; ?>
</body>
</html>
