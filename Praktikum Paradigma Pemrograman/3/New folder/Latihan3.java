class Latihan3 {
    private double alas, tinggi;

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    public void tampilkanLuas() {
        System.out.println("Luas segitiga = " + hitungLuas());
    }

    public static void main(String[] args) {
        Latihan3 s = new Latihan3();
        s.setAlas(10);
        s.setTinggi(6);
        s.tampilkanLuas();
    }
}
