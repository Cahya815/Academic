package isntitusi;

public class Pegawai {
    protected String nama;
    protected double gaji;

    public Pegawai(String n, double g) {
        nama = n;
        gaji = g;
    }

    public void tampilData() {
        System.out.println("Nama  : " + nama);
        System.out.println("Gaji  : " + gaji);
    }
}
