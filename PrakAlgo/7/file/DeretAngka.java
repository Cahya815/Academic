public class DeretAngka {
    public static void main(String[] args) {
        int n = 6;
        int[] deret = new int[n];

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                deret[i] = 1;
            } else if (i == 1) {
                deret[i] = 2;
            } else if (i == 2) {
                deret[i] = deret[0] + deret[1];
            } else if (i == 3) {
                deret[i] = 3;
            } else if (i == 4) {
                deret[i] = 4;
            } else {
                deret[i] = deret[3] + deret[4];
            }
            System.out.print(deret[i] + " ");
        }
        System.out.println();
    }
}