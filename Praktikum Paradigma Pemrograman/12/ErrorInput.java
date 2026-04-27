import java.util.Scanner;

public class ErrorInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        
        if (in.hasNextInt()) { // Validasi apakah input adalah angka
            int angka = in.nextInt();
            System.out.println("Angka = " + angka);
        } else {
            System.out.println("Kesalahan: Input harus berupa angka bulat!");
        }
        in.close(); // Menutup scanner
    }
}