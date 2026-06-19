<html>
<head>
<title> Auto Sesi PHP </title>
</head>
<body>
<?php
/*
    Untuk mengaktifkan auto session tanpa memanggil session_start(),
    set session.auto_start = 1 di file php.ini.
    Setelah diaktifkan, session langsung tersedia di semua halaman
    tanpa perlu memanggil session_start() secara manual.
*/
echo "Auto session aktif jika session.auto_start = 1 di php.ini.<br>";
echo "Nilai counter: " . (isset($_SESSION['counter']) ? $_SESSION['counter'] : 'belum ada');
?>
</body>
</html>
