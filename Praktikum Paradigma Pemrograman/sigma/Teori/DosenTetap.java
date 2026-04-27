public class DosenTetap extends Pegawai {
    private double tunjanganTetap;

    // Konstruktor
    public DosenTetap(String nama, String nip, double gajiPokok, double tunjanganTetap) {
        super(nama, nip, gajiPokok);
        this.tunjanganTetap = tunjanganTetap;
    }

    // Implementasi metode hitungGaji()
    @Override
    public double hitungGaji() {
        return gajiPokok + tunjanganTetap;
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan Tetap: " + tunjanganTetap);
        System.out.println("**TOTAL GAJI**: " + hitungGaji());
    }
}