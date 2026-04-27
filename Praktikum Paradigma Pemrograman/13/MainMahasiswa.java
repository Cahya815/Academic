import java.util.Scanner;

class Mahasiswa {
    String nama;
    Scanner input = new Scanner(System.in);

    // inner class non-static
    class Nilai {
        double uts, uas;

        void inputNilai() {
            System.out.print("Masukkan nilai UTS: ");
            uts = input.nextDouble();
            System.out.print("Masukkan nilai UAS: ");
            uas = input.nextDouble();
        }

        double hitungRataRata() {
            return (uts + uas) / 2;
        }
    }

    void inputMahasiswa() {
        System.out.print("Masukkan nama mahasiswa: ");
        nama = input.nextLine();
    }

    void tampilData(double rata) {
        System.out.println("Nama Mahasiswa: " + nama);
        System.out.println("Rata-rata Nilai: " + rata);
    }
}

public class MainMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        mhs.inputMahasiswa();

        Mahasiswa.Nilai nilai = mhs.new Nilai(); // WAJIB lewat objek luar
        nilai.inputNilai();

        double rata = nilai.hitungRataRata();
        mhs.tampilData(rata);
    }
}
