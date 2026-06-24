<?php
class Kendaraan {
    var $merk;
    var $warna;
    var $kecepatan;

    function __construct($merk, $warna) {
        $this->merk      = $merk;
        $this->warna     = $warna;
        $this->kecepatan = 0;
    }
    function getMerk() {
        echo "Merk: " . $this->merk . "<br/>";
    }
    function getWarna() {
        echo "Warna: " . $this->warna . "<br/>";
    }
    function getKecepatan() {
        echo "Kecepatan: " . $this->kecepatan . " km/h<br/>";
    }
    function tambahKecepatan($nilai) {
        $this->kecepatan += $nilai;
    }
    function __destruct() {
        echo "Kendaraan " . $this->merk . " dihancurkan.<br/>";
    }
}

class Mobil extends Kendaraan {
    var $jumlah_pintu;

    function __construct($merk, $warna, $jumlah_pintu) {
        parent::__construct($merk, $warna);
        $this->jumlah_pintu = $jumlah_pintu;
    }
    function getJumlahPintu() {
        echo "Jumlah Pintu: " . $this->jumlah_pintu . "<br/>";
    }
    function getKecepatan() {
        echo "Kecepatan Mobil: " . $this->kecepatan . " km/h<br/>";
        return $this->kecepatan;
    }
}

class Motor extends Kendaraan {
    var $jenis;

    function __construct($merk, $warna, $jenis) {
        parent::__construct($merk, $warna);
        $this->jenis = $jenis;
    }
    function getJenis() {
        echo "Jenis Motor: " . $this->jenis . "<br/>";
    }
    function getKecepatan() {
        echo "Kecepatan Motor: " . $this->kecepatan . " km/h<br/>";
        return $this->kecepatan;
    }
}

echo "=== Data Mobil ===<br/>";
$mobil = new Mobil("Toyota", "Merah", 4);
$mobil->getMerk();
$mobil->getWarna();
$mobil->getJumlahPintu();
$mobil->tambahKecepatan(80);
$mobil->getKecepatan();

echo "<br/>=== Data Motor ===<br/>";
$motor = new Motor("Honda", "Hitam", "Sport");
$motor->getMerk();
$motor->getWarna();
$motor->getJenis();
$motor->tambahKecepatan(120);
$motor->getKecepatan();
?>
