// Abstract class sebagai blueprint untuk semua jenis karyawan
abstract class Karyawan {
    protected String nama;
    protected String id;
    protected String jenis;

    public Karyawan(String nama, String id, String jenis) {
        this.nama = nama;
        this.id = id;
        this.jenis = jenis;
    }

    // Abstract method yang harus diimplementasikan oleh subclass
    public abstract double hitungGaji();

    public void cetakSlipGaji() {
        System.out.println("============== Slip Gaji ==============");
        System.out.println("Nama: " + nama);
        System.out.println("ID : " + id);
        System.out.println("Jenis: " + jenis);
        System.out.println("Gaji : Rp " + hitungGaji());
        System.out.println("=======================================\n");
    }
}

// Kelas untuk Karyawan Tetap
class FullTimeEmployee extends Karyawan {
    private double gajiBulanan;
    private double tunjangan;

    public FullTimeEmployee(String nama, String id, double gajiBulanan, double tunjangan) {
        super(nama, id, "TETAP");
        this.gajiBulanan = gajiBulanan;
        this.tunjangan = tunjangan;
    }

    @Override
    public double hitungGaji() {
        return gajiBulanan + tunjangan;
    }
}

// Kelas untuk Karyawan Harian
class DailyEmployee extends Karyawan {
    private int jumlahHariKerja;
    private double upahHarian;

    public DailyEmployee(String nama, String id, int jumlahHariKerja, double upahHarian) {
        super(nama, id, "HARIAN");
        this.jumlahHariKerja = jumlahHariKerja;
        this.upahHarian = upahHarian;
    }

    @Override
    public double hitungGaji() {
        return jumlahHariKerja * upahHarian;
    }
}

// Kelas untuk Karyawan Freelance
class FreelanceEmployee extends Karyawan {
    private int jumlahJamKerja;
    private double ratePerJam;

    public FreelanceEmployee(String nama, String id, int jumlahJamKerja, double ratePerJam) {
        super(nama, id, "FREELANCE");
        this.jumlahJamKerja = jumlahJamKerja;
        this.ratePerJam = ratePerJam;
    }

    @Override
    public double hitungGaji() {
        return jumlahJamKerja * ratePerJam;
    }
}

// Main class untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        // Membuat array karyawan (tanpa ArrayList)
        Karyawan[] daftarKaryawan = new Karyawan[3];

        // Mengisi array dengan karyawan
        daftarKaryawan[0] = new FullTimeEmployee("Andi", "FT01", 5500000, 500000);
        daftarKaryawan[1] = new DailyEmployee("Budi", "DL02", 20, 150000);
        daftarKaryawan[2] = new FreelanceEmployee("Cici", "FR03", 160, 25000);

        // Mencetak slip gaji untuk semua karyawan
        for (int i = 0; i < daftarKaryawan.length; i++) {
            daftarKaryawan[i].cetakSlipGaji();
        }
    }
}