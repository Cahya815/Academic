public class DeretPola {

    public static void main(String[] args) {
        int suku1 = 1;
        int suku2 = 2;
        int sukuBerikutnya;

        System.out.print(suku1 + " " + suku2 + " ");

        for (int i = 3; i <= 6; i++) {
            if (i == 3) {
                sukuBerikutnya = suku1 + suku2;
            } else if (i == 4) {
                sukuBerikutnya = 3;
            } else if (i == 5) {
                sukuBerikutnya = 4;
            } else { // i == 6
                sukuBerikutnya = 4 + 7;
            }

            System.out.print(sukuBerikutnya + " ");

            if (i == 3) {
                suku1 = suku2;
                suku2 = sukuBerikutnya;
            } else if (i == 4) {
              suku1 = suku2;
              suku2 = sukuBerikutnya;
            } else if (i == 5) {
              suku1 = suku2;
              suku2 = sukuBerikutnya;
            }
        }
        System.out.println();
    }
}