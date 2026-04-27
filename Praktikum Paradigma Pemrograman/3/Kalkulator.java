import java.util.Scanner;

public class Kalkulator {
    // method operasi aritmatika dasar
    public int tambah(int a, int b) {
        return a + b;
    }

    public int kurang(int a, int b) {
        return a - b;
    }

    public int kali(int a, int b) {
        return a * b;
    }

    public double bagi(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Kalkulator kalk = new Kalkulator();

        System.out.print("Masukkan bilangan pertama: ");
        int a = input.nextInt();
        System.out.print("Masukkan bilangan kedua: ");
        int b = input.nextInt();

        System.out.println("Pilih operasi:");
        System.out.println("1. Tambah");
        System.out.println("2. Kurang");
        System.out.println("3. Kali");
        System.out.println("4. Bagi");
        System.out.print("Masukkan pilihan: ");
        int pilih = input.nextInt();

        switch (pilih) {
            case 1:
                System.out.println("Hasil: " + kalk.tambah(a, b));
                break;
            case 2:
                System.out.println("Hasil: " + kalk.kurang(a, b));
                break;
            case 3:
                System.out.println("Hasil: " + kalk.kali(a, b));
                break;
            case 4:
                System.out.println("Hasil: " + kalk.bagi(a, b));
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }

        input.close();
    }
}
