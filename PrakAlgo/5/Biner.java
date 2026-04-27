public class Biner{

    public static void main(String[] args) {
        int[] biner = {0, 1}; // nilai yang mungkin untuk setiap posisi

        // Gunakan array dan perulangan untuk kombinasi
        for (int i = 0; i < biner.length; i++) {
            for (int j = 0; j < biner.length; j++) {
                for (int k = 0; k < biner.length; k++) {
                    System.out.println(biner[i] + " | " + biner[j] + " | " + biner[k]);
                }
            }
        }
    }
}
