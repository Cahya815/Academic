public class Lat1 {

    public static int pangkat(int A, int B) {
        if (B == 0) {
            return 1;  // Basis: A^0 = 1
        } else {
            return A * pangkat(A, B - 1);  // Rekursi: A^B = A * A^(B-1)
        }
    }

    public static void main(String[] args) {
        int A = 2;
        int B = 5;
        System.out.println(A + "^" + B + " = " + pangkat(A, B));  // Output: 2^5 = 32
    }
}
