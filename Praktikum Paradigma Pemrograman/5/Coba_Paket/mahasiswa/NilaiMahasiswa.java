package mahasiswa;

public class NilaiMahasiswa {
    private double tugas;
    private double uts;
    private double uas;

    public NilaiMahasiswa(double tugas, double uts, double uas) {
        this.tugas = tugas;
        this.uts = uts;
        this.uas = uas;
    }

    // Hitung nilai akhir (30% tugas, 30% uts, 40% uas)
    public double hitungNilaiAkhir() {
        return (0.3 * tugas) + (0.3 * uts) + (0.4 * uas);
    }

    // Menentukan grade berdasarkan nilai akhir
    public char getGrade() {
        double nilaiAkhir = hitungNilaiAkhir();
        if (nilaiAkhir >= 85) {
            return 'A';
        } else if (nilaiAkhir >= 70) {
            return 'B';
        } else if (nilaiAkhir >= 50) {
            return 'C';
        } else {
            return 'D';
        }
    }

    // Menampilkan nilai
    public void tampilkanNilai() {
        System.out.println("Nilai Tugas : " + tugas);
        System.out.println("Nilai UTS   : " + uts);
        System.out.println("Nilai UAS   : " + uas);
        System.out.println("Nilai Akhir : " + hitungNilaiAkhir());
        System.out.println("Grade       : " + getGrade());
    }
}
