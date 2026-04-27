public class Tug2 {
    // Method untuk mengubah angka negatif jadi absolut
    public static int ubahKeAbsolut(int angka) {
        return Math.abs(angka);
    }

    // Method untuk membulatkan angka desimal ke integer
    public static long bulatkan(double angka) {
        return Math.round(angka);
    }

    // Method untuk mengubah string menjadi huruf kapital
    public static String ubahKeKapital(String teks) {
        return teks.toUpperCase();
    }

    public static void main(String[] args) {
        int nilaiNegatif = -15;
        double nilaiDesimal = 9.56;
        String kata = "belajar java";

        System.out.println("Nilai absolut dari " + nilaiNegatif + " adalah " + ubahKeAbsolut(nilaiNegatif));
        System.out.println("Hasil pembulatan dari " + nilaiDesimal + " adalah " + bulatkan(nilaiDesimal));
        System.out.println("String setelah diubah ke huruf kapital: " + ubahKeKapital(kata));
    }
}
