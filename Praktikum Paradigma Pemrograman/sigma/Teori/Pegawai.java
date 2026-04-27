public abstract class Pegawai {
    // Atribut umum
    protected String nama;
    protected String nip;
    protected double gajiPokok;

    // Konstruktor
    public Pegawai(String nama, String nip, double gajiPokok) {
        this.nama = nama;
        this.nip = nip;
        this.gajiPokok = gajiPokok;
    }

    public abstract double hitungGaji();

    public void tampilData() {
        System.out.println("--- Data Pegawai ---");
        System.out.println("Nama    : " + nama);
        System.out.println("NIP     : " + nip);
        System.out.println("Gaji Pokok: " + gajiPokok);
    }
}