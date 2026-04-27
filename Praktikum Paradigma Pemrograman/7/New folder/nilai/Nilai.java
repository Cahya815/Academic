package nilai;
import mahasiswa.Mahasiswa; // pewarisan dari package mahasiswa

public class Nilai extends Mahasiswa {
    private String kodeMK;
    private double nilaiAngka;
    private String nilaiHuruf;

    public void inputNilai() {
        System.out.print("\nMasukkan Kode Mata Kuliah: ");
        kodeMK = input.nextLine();
        System.out.print("Masukkan Nilai Angka: ");
        nilaiAngka = input.nextDouble();
        input.nextLine(); // bersihkan buffer

        if (nilaiAngka >= 85) nilaiHuruf = "A";
        else if (nilaiAngka >= 75) nilaiHuruf = "B";
        else if (nilaiAngka >= 65) nilaiHuruf = "C";
        else if (nilaiAngka >= 55) nilaiHuruf = "D";
        else nilaiHuruf = "E";
    }

    public void tampilNilai() {
        System.out.println("\n=== Data Nilai ===");
        System.out.println("Kode MK     : " + kodeMK);
        System.out.println("Nilai Angka : " + nilaiAngka);
        System.out.println("Nilai Huruf : " + nilaiHuruf);
    }
}
