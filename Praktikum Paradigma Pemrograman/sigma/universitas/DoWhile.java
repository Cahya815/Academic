import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n;

        System.out.print("Masukkan batas bilangan: ");
        n = input.nextInt();

        System.out.println("\n=== Bilangan Ganjil dan Genap ===");

        int i = 1;
        do {
            if (i % 2 == 0)
                System.out.println(i + " adalah bilangan genap");
            else
                System.out.println(i + " adalah bilangan ganjil");

            i++;
        } while (i <= n);
    }
}
