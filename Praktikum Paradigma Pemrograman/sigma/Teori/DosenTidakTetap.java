public class DosenTidakTetap extends Pegawai {
    private int jamMengajar;
    private double honorPerJam;


    public DosenTidakTetap(String nama, String nip, double gajiPokok, int jamMengajar, double honorPerJam) {
        super(nama, nip, gajiPokok);
        this.jamMengajar = jamMengajar;
        this.honorPerJam = honorPerJam;
    }

    // Implementasi metode hitungGaji()
    @Override
    public double hitungGaji() {
        return jamMengajar * honorPerJam;
    }

    // Override tampilData()
    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Jam Mengajar   : " + jamMengajar);
        System.out.println("Honor Per Jam  : " + honorPerJam);
        System.out.println("**TOTAL GAJI**: " + hitungGaji());
    }
}