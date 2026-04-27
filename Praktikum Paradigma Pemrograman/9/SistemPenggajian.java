import java.util.*;

abstract class Karyawan {
    protected String nama, id, jenis;
    public Karyawan(String nama, String id, String jenis) {
        this.nama = nama; this.id = id; this.jenis = jenis;
    }
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

class FullTimeEmployee extends Karyawan {
    private double gajiBulanan, tunjangan;
    public FullTimeEmployee(String n, String i, double g, double t) {
        super(n, i, "TETAP"); gajiBulanan = g; tunjangan = t;
    }
    @Override public double hitungGaji() { return gajiBulanan + tunjangan; }
}

class DailyEmployee extends Karyawan {
    private int hari; private double upah;
    public DailyEmployee(String n, String i, int h, double u) {
        super(n, i, "HARIAN"); hari = h; upah = u;
    }
    @Override public double hitungGaji() { return hari * upah; }
}

class FreelanceEmployee extends Karyawan {
    private int jam; private double rate;
    public FreelanceEmployee(String n, String i, int j, double r) {
        super(n, i, "FREELANCE"); jam = j; rate = r;
    }
    @Override public double hitungGaji() { return jam * rate; }
}

public class SistemPenggajian {
    public static void main(String[] args) {
        List<Karyawan> karyawan = Arrays.asList(
            new FullTimeEmployee("Andi", "FT01", 5500000, 500000),
            new DailyEmployee("Budi", "DL02", 20, 150000),
            new FreelanceEmployee("Cici", "FR03", 160, 25000)
        );
        karyawan.forEach(Karyawan::cetakSlipGaji);
    }
}