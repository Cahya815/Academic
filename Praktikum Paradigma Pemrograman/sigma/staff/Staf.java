package staff;

import universitas.Pegawai;

public class Staf extends Pegawai {
    private String bagian;
    private double tunjangan;

    public Staf(String n, double g, String b, double t) {
        super(n, g);
        bagian = b;
        tunjangan = t;
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Bagian: " + bagian);
        System.out.println("Tunjangan: " + tunjangan);
    }
}
