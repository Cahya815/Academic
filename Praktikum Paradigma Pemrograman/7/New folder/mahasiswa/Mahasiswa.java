package mahasiswa;
import dosen.Dosen; // mewarisi dari package dosen

public class Mahasiswa extends Dosen {
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
