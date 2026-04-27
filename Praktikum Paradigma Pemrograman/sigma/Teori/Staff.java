public class Staff extends Pegawai {
    private double bonus;

    // Konstruktor
    public Staff(String nama, String nip, double gajiPokok, double bonus) {
        super(nama, nip, gajiPokok);
        this.bonus = bonus;
    }

    // Implementasi metode hitungGaji()
    @Override
    public double hitungGaji() {
        return gajiPokok + bonus;
    }

    // Override tampilData()
    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Bonus          : " + bonus);
        System.out.println("**TOTAL GAJI**: " + hitungGaji());
    }
}