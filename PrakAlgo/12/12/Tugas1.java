public class Tugas1 {

    public static long pangkat(int A, int B) {
        long hasil = 1;
        for (int i = 1; i <= B; i++) {
            hasil *= A;
        }
        return hasil;
    }

    public static void main(String[] args) {
        int A = 3;
        int B = 4;

        System.out.println(A + " ^ " + B + " = " + pangkat(A, B));
    }
}
