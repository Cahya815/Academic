public class SepedaMotor {
    private String merk;
    private int cc;
    private String warna;
    private int tahun;
    private double harga;

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void tampilkanInfo() {
        System.out.println("Merk: " + this.merk);
        System.out.println("CC: " + this.cc);
        System.out.println("Warna: " + this.warna);
        System.out.println("Tahun: " + this.tahun);
        System.out.printf("Harga: Rp%,.0f%n", this.harga);
    }
}
