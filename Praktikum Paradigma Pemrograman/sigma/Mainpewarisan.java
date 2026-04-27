import java.util.Scanner;

class Dosen {
    protected String namaDosen;
    protected String nidn;
    Scanner input = new Scanner(System.in);

    public void inputDosen() {
        System.out.print("Masukkan Nama Dosen: ");
        namaDosen = input.nextLine();
        System.out.print("Masukkan NIDN Dosen: ");
        nidn = input.nextLine();
    }

    public void tampilDosen() {
        System.out.println("\n=== Data Dosen ===");
        System.out.println("Nama Dosen : " + namaDosen);
        System.out.println("NIDN        : " + nidn);
    }
}

class Mahasiswa extends Dosen{
    protected String namaMhs;
    protected String nim;

    public void inputMahasiswa() {
        System.out.print("\nMasukkan Nama Mahasiswa: ");
        namaMhs = input.nextLine();
        System.out.print("Masukkan NIM Mahasiswa: ");
        nim = input.nextLine();
    }

    public void tampilMahasiswa() {
        System.out.println("\n=== Data Mahasiswa ===");
        System.out.println("Nama Mahasiswa : " + namaMhs);
        System.out.println("NIM            : " + nim);
    }
}

class Nilai extends Mahasiswa {
    private String kodeMK;
    private double nilaiAngka;
    private String nilaiHuruf;

    public void inputNilai() {
        System.out.print("\nMasukkan Kode Mata Kuliah: ");
        kodeMK = input.nextLine();
        System.out.print("Masukkan Nilai Angka: ");
        nilaiAngka = input.nextDouble();
        input.nextLine(); // membersihkan buffer

        // konversi ke huruf otomatis
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

public class Mainpewarisan {
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
