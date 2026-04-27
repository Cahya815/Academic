<html>
<body>
<?php
    // Mendefinisikan array dengan 10 anggota [cite: 147]
    $nama[0] = "Isabella";
    $nama[1] = "Affan";
    $nama[2] = "Desty"; 
    $nama[3] = "Budi";
    $nama[4] = "Citra";
    $nama[5] = "Eko";
    $nama[6] = "Fani";
    $nama[7] = "Gita";
    $nama[8] = "Hadi";
    $nama[9] = "Indra";

    // Menampilkan semua anggota array
    for ($i = 0; $i < 10; $i++) {
        echo "Nama indeks ke-$i: " . $nama[$i] . "<br>";
    }
?>
</body>
</html>