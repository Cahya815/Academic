class Latihan1 {
    private int a, b;
    private double c, d;

    // Overloading 1: parameter int
    void sum(int a, int b) {
        System.out.println("Hasil penjumlahan int: " + (a + b));
    }

    // Overloading 2: parameter double
    void sum(double c, double d) {
        System.out.println("Hasil penjumlahan double: " + (c + d));
    }

    // Overloading 3: parameter campuran
    void sum(int a, double b) {
        System.out.println("Hasil penjumlahan campuran: " + (a + b));
    }

    public static void main(String[] args) {
        Latihan1 obj = new Latihan1();
        obj.sum(10.5, 10.5);
        obj.sum(20, 20);
        obj.sum(10, 5.5);  // memanggil versi campuran
    }
}
