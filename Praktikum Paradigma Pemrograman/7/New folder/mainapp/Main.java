package mainapp;
import nilai.Nilai; // kelas terakhir dalam rantai pewarisan

public class Main {
    public static void main(String[] args) {
        Nilai data = new Nilai();

        System.out.println("=== Input Data Dosen ===");
        data.inputDosen();

        System.out.println("\n=== Input Data Mahasiswa ===");
        data.inputMahasiswa();

        System.out.println("\n=== Input Nilai Mahasiswa ===");
        data.inputNilai();

        System.out.println("\n\n=== HASIL DATA LENGKAP ===");
        data.tampilDosen();
        data.tampilMahasiswa();
        data.tampilNilai();
    }
}
