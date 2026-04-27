import java.util.Scanner;
import mahasiswa.Biodata;
import mahasiswa.NilaiMahasiswa;

public class MainApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Input Biodata Mahasiswa ===");
        System.out.print("Masukkan Nama    : ");
        String nama = input.nextLine();
        System.out.print("Masukkan NIM     : ");
        String nim = input.nextLine();
        System.out.print("Masukkan Jurusan : ");
        String jurusan = input.nextLine();

        System.out.println("\n=== Input Nilai Mahasiswa ===");
        System.out.print("Masukkan Nilai Tugas : ");
        double tugas = input.nextDouble();
        System.out.print("Masukkan Nilai UTS   : ");
        double uts = input.nextDouble();
        System.out.print("Masukkan Nilai UAS   : ");
        double uas = input.nextDouble();

        // Buat objek
        Biodata bio = new Biodata(nama, nim, jurusan);
        NilaiMahasiswa nilai = new NilaiMahasiswa(tugas, uts, uas);

        // Tampilkan hasil
        System.out.println("\n=== HASIL DATA MAHASISWA ===");
        bio.tampilkanBiodata();
        nilai.tampilkanNilai();

        input.close();
    }
}
