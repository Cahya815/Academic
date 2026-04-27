import java.util.Scanner;

class Toko {

    static class Diskon {
        static double hitungHarga(double harga, double diskon) {
            return harga - (harga * diskon / 100);
        }
    }
}

public class MainToko {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan harga barang: ");
        double harga = input.nextDouble();

        System.out.print("Masukkan diskon (%): ");
        double diskon = input.nextDouble();

        double hasil = Toko.Diskon.hitungHarga(harga, diskon);
        System.out.println("Harga setelah diskon: " + hasil);
    }
}
