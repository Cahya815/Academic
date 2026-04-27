public class Lat2 {

    public static int gcd(int x, int y) {
        if (y == 0)
            return x;  // Basis: jika y = 0, gcd adalah x
        else
            return gcd(y, x % y);  // Rekursi: gcd(x, y) = gcd(y, x % y)
    }

    public static void main(String[] args) {
        int x = 48;
        int y = 18;
        System.out.println("GCD dari " + x + " dan " + y + " adalah " + gcd(x, y));  // Output: 6
    }
}
