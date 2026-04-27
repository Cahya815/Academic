import java.util.Scanner;

public class Tug1 {

    public double luasSegitigaSamaKaki(double alas, double tinggi) {
        return 0.5 * alas * tinggi;
    }

    public double kelilingSegitigaSamaKaki(double alas, double sisiMiring) {
        return 2 * sisiMiring + alas;
    }

    public double luasSegiEmpat(double panjang, double lebar) {
        return panjang * lebar;
    }

    public double kelilingSegiEmpat(double panjang, double lebar) {
        return 2 * (panjang + lebar);
    }

    public double luasLingkaran(double jariJari) {
        return Math.PI * jariJari * jariJari;
    }

    public double kelilingLingkaran(double jariJari) {
        return 2 * Math.PI * jariJari;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Tug1 bd = new Tug1();

        while (true) {
            System.out.println("1. Segitiga Sama Kaki");
            System.out.println("2. Segi Empat");
            System.out.println("3. Lingkaran");
            System.out.println("4. Keluar");

            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan alas segitiga sama kaki: ");
                    double alas = input.nextDouble();
                    System.out.print("Masukkan tinggi segitiga sama kaki: ");
                    double tinggi = input.nextDouble();
                    System.out.print("Masukkan panjang sisi miring segitiga sama kaki: ");
                    double sisiMiring = input.nextDouble();

                    System.out.printf("Luas segitiga sama kaki: %.2f\n", bd.luasSegitigaSamaKaki(alas, tinggi));
                    System.out.printf("Keliling segitiga sama kaki: %.2f\n", bd.kelilingSegitigaSamaKaki(alas, sisiMiring));
                    break;

                case 2:
                    System.out.print("Masukkan panjang segi empat: ");
                    double panjang = input.nextDouble();
                    System.out.print("Masukkan lebar segi empat: ");
                    double lebar = input.nextDouble();

                    System.out.printf("Luas segi empat: %.2f\n", bd.luasSegiEmpat(panjang, lebar));
                    System.out.printf("Keliling segi empat: %.2f\n", bd.kelilingSegiEmpat(panjang, lebar));
                    break;

                case 3:
                    System.out.print("Masukkan jari-jari lingkaran: ");
                    double jariJari = input.nextDouble();

                    System.out.printf("Luas lingkaran: %.2f\n", bd.luasLingkaran(jariJari));
                    System.out.printf("Keliling lingkaran: %.2f\n", bd.kelilingLingkaran(jariJari));
                    break;

                case 4:
                    System.out.println("Terima kasih!");
                    input.close();
                    System.exit(0);
                    break;
            }
        }
    }
}
