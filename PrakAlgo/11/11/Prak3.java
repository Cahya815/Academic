public class Prak3 {

    // Method rekursif untuk menghitung faktorial
    public static long faktorial(int n) {
        if (n == 1)
            return 1;
        else
            return n * faktorial(n - 1);
    }

    public static void main(String[] args) {
        int N = 5;
        System.out.println("Faktorial dari 1 sampai " + N + ":");

        for (int i = 1; i <= N; i++) {
            long hasil = faktorial(i);
            System.out.println(i + "! = " + hasil);
        }
    }
}
