<?php
interface Mail {
    public function sendmail();
}

class Report implements Mail {
    public function sendmail() {
        echo "Mengirim laporan via email.<br/>";
    }
}

$report = new Report();
$report->sendmail();
?>
