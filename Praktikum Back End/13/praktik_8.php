<?php
session_start();
if (isset($_SESSION['counter'])) {
    $_SESSION['counter'] = 1;
} else {
    $_SESSION['counter']++;
}
$msg  = "Anda telah mengunjungi halaman ini " . $_SESSION['counter'];
$msg .= " di sesi ini.<br>";
echo($msg);
echo htmlspecialchars(SID);
?>
<p>
Untuk melanjutkan klik link berikut <br>
<a href="nextpage.php?<?php echo htmlspecialchars(SID); ?>">nextpage.php</a>
</p>
