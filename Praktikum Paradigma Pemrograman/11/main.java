import java.util.Scanner;

// Superclass
abstract class Karyawan {
    String nama;

    public Karyawan(String nama) {
        this.nama = nama;
    }

    public abstract double hitungGaji();

    public void tampilkanData() {
        System.out.println("\n---- DATA GAJI KARYAWAN ----");
        System.out.println("Nama Karyawan : " + nama);
        System.out.println("Total Gaji    : " + hitungGaji());
    }
}

// Subclass: Karyawan Tetap
class karTap extends Karyawan {
    double gapok;

    public karTap(String nama, double gapok) {
        super(nama);
        this.gapok = gapok;
    }

    @Override
    public double hitungGaji() {
        double tunjangan = 0.2 * gapok;
        return gapok + tunjangan;
    }
}

// Subclass: Karyawan Kontrak
class Kkontrak extends Karyawan {
    int jamKerja;
    double upahPerJam;

    public Kkontrak(String nama, int jamKerja, double upahPerJam) {
        super(nama);
        this.jamKerja = jamKerja;
        this.upahPerJam = upahPerJam;
    }

    @Override
    public double hitungGaji() {
        return jamKerja * upahPerJam;
    }
}

// Subclass: Karyawan Magang
class KMagang extends Karyawan {
    double uangSaku;

    public KMagang(String nama, double uangSaku) {
        super(nama);
        this.uangSaku = uangSaku;
    }

    @Override
    public double hitungGaji() {
        return uangSaku;
    }
}

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Karyawan karyawan; 

        System.out.println("---- PILIH JENIS KARYAWAN ----");
        System.out.println("1. Karyawan Tetap");
        System.out.println("2. Karyawan Kontrak");
        System.out.println("3. Karyawan Magang");
        System.out.print("Pilihan: ");
        int pilihan = input.nextInt();
        input.nextLine(); 

        System.out.print("Masukkan Nama Karyawan: ");
        String nama = input.nextLine();

        if (pilihan == 1) {
            System.out.print("Masukkan Gaji Pokok: ");
            double gaji = input.nextDouble();
            karyawan = new karTap(nama, gaji);
        } else if (pilihan == 2) {
            System.out.print("Masukkan Jam Kerja: ");
            int jam = input.nextInt();
            System.out.print("Masukkan Upah per Jam: ");
            double upah = input.nextDouble();
            karyawan = new Kkontrak(nama, jam, upah);
        } else if (pilihan == 3) {
            System.out.print("Masukkan Uang Saku: ");
            double saku = input.nextDouble();
            karyawan = new KMagang(nama, saku);
        } else {
            System.out.println("Pilihan tidak valid!");
            return;
        }

        // Polimorfisme: Memanggil method melalui referensi superclass
        karyawan.tampilkanData();
        
        System.out.println("Press any key to continue . . .");
    }
}