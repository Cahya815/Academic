public class Prak3 {
    public static long Prak3(int n) {
        long hasil = 1;
        for (int i = 1; i <= n; i++) {
            hasil *= i;
        }
        return hasil;
    }

    public static void main(String[] args) {
        int N = 5;
        for (int i = 1; i <= N; i++) {
            System.out.println(i + "! = " + Prak3(i));
        }
    }
}
