

public class Dosen extends Pegawai {
    private String mataKuliah;

    public Dosen(String n, double g, String mk) {
        super(n, g);          // kalo gak super?
        this.mataKuliah = mk;
    }a

    @Override
    public void tampilData() {
        super.tampilData();   // tampilkan nama dan gaji dari Pegawai
        System.out.println("Mata Kuliah: " + mataKuliah);
    }
}
