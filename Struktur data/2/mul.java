import java.util.Scanner;

public class mul {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah bilangan (N): ");
        int N = scanner.nextInt();
        int[] resultProducts = new int[N];
        int smallest = 0;
        int largest = 0;
        System.out.println("\n--- Masukkan " + N + " bilangan bulat ---");
        for (int i = 0; i < N; i++) {
            System.out.print("Bilangan ke-" + (i + 1) + ": ");
            int input = scanner.nextInt();
            int product = input * (input + 1);
            resultProducts[i] = product;

            if (i == 0) {
                smallest = product;
                largest = product;
            } else {
                if (product < smallest) {
                    smallest = product;
                }
                if (product > largest) {
                    largest = product;
                }
            }
        }

        System.out.println("           HASIL PERKALIAN DATA");
        for (int i = 0; i < N; i++) {
            System.out.println("Hasil ke-" + (i + 1) + ": " + resultProducts[i]);
        }
        if (N > 0) {
            System.out.println("\n---------------------------------------------");
            System.out.println("Nilai Terkecil dari Hasil Perkalian: " + smallest);
            System.out.println("Nilai Terbesar dari Hasil Perkalian: " + largest);
            System.out.println("---------------------------------------------");
        } else {
             System.out.println("Tidak ada data untuk dianalisis (N = 0).");
        }
    }
}