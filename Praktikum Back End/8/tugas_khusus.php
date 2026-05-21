<html>
<head>
    <title>Kalkulator Nilai Akhir Mahasiswa</title>
</head>
<body>
    <h2>Kalkulator Nilai Akhir Mahasiswa</h2>

    <form action="<?php echo $_SERVER['PHP_SELF']; ?>" method="POST">
        Nama Mahasiswa: <input type="text" name="nama"><br><br>
        Nilai Tugas (0-100): <input type="text" name="tugas"><br><br>
        Nilai UTS (0-100): <input type="text" name="uts"><br><br>
        Nilai UAS (0-100): <input type="text" name="uas"><br><br>
        <input type="submit" value="Hitung">
    </form>

    <?php
    function hitungNilaiAkhir($tugas, $uts, $uas)
    {
        return ($tugas * 0.3) + ($uts * 0.35) + ($uas * 0.35);
    }

    function konversiHuruf($nilai)
    {
        if ($nilai >= 80) {
            return "A";
        } elseif ($nilai >= 60) {
            return "B";
        } elseif ($nilai >= 40) {
            return "C";
        } elseif ($nilai >= 20) {
            return "D";
        } else {
            return "E";
        }
    }

    function tampilRiwayat($riwayat)
    {
        echo "<h3>Riwayat Perhitungan:</h3>";
        echo "<table border='1' cellpadding='8'>";
        echo "<tr><th>No</th><th>Nama</th><th>Tugas</th><th>UTS</th><th>UAS</th><th>Nilai Akhir</th><th>Grade</th></tr>";
        for ($i = 0; $i < count($riwayat); $i++) {
            echo "<tr>";
            echo "<td>" . ($i + 1) . "</td>";
            echo "<td>" . $riwayat[$i]['nama'] . "</td>";
            echo "<td>" . $riwayat[$i]['tugas'] . "</td>";
            echo "<td>" . $riwayat[$i]['uts'] . "</td>";
            echo "<td>" . $riwayat[$i]['uas'] . "</td>";
            echo "<td>" . $riwayat[$i]['nilai_akhir'] . "</td>";
            echo "<td>" . $riwayat[$i]['grade'] . "</td>";
            echo "</tr>";
        }
        echo "</table>";
    }

    if ($_POST["nama"] && $_POST["tugas"] && $_POST["uts"] && $_POST["uas"]) {
        $nama  = $_POST["nama"];
        $tugas = $_POST["tugas"];
        $uts   = $_POST["uts"];
        $uas   = $_POST["uas"];

        $nilai_akhir = hitungNilaiAkhir($tugas, $uts, $uas);
        $grade       = konversiHuruf($nilai_akhir);

        echo "<h3>Hasil:</h3>";
        echo "Nama Mahasiswa: $nama <br>";
        echo "Nilai Tugas: $tugas <br>";
        echo "Nilai UTS: $uts <br>";
        echo "Nilai UAS: $uas <br>";
        echo "Nilai Akhir: $nilai_akhir <br>";
        echo "Grade: $grade <br>";

        $riwayat = [
            ["nama" => $nama, "tugas" => $tugas, "uts" => $uts, "uas" => $uas, "nilai_akhir" => $nilai_akhir, "grade" => $grade]
        ];

        tampilRiwayat($riwayat);
    }
    ?>
</body>
</html>