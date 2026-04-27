import java.util.Scanner;
public class Matrik2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] x = {{1, 2, 3}, {4, 5, 6}};
        int[][] y = {{3, 6, 1}, {4, 7, 9}};
        int baris = 2;
        int kolom = 3;
        int[][] hasilTambah = new int[baris][kolom];
        int[][] hasilKurang = new int[baris][kolom];
        System.out.println("Ini adalah matrix X:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(x[i][j] + " ");
            }
            System.out.println(); }
        System.out.println("Ini adalah matrix Y:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(y[i][j] + " ");
            }
            System.out.println();
            }
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                hasilTambah[i][j] = x[i][j] + y[i][j];
                hasilKurang[i][j] = x[i][j] - y[i][j];
            }}
        System.out.println("Hasil Penjumlahan Matriks X + Y:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(hasilTambah[i][j] + " ");
            }
            System.out.println();
        }
		System.out.println("Hasil Pengurangan Matriks X - Y:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(hasilKurang[i][j] + " ");
            }System.out.println(); }}}
