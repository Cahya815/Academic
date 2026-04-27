import java.util.Scanner;

public class Konverter {
    // konversi suhu dari Celsius ke Fahrenheit
    public double konversiSuhu(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // konversi panjang dari meter ke kilometer
    public double konversiPanjang(double meter) {
        return meter / 1000;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Konverter konv = new Konverter();

        System.out.println("Pilih konversi:");
        System.out.println("1. Suhu (Celsius ke Fahrenheit)");
        System.out.println("2. Panjang (Meter ke Kilometer)");
        System.out.print("Masukkan pilihan: ");
        int pilih = input.nextInt();

        switch (pilih) {
            case 1:
                System.out.print("Masukkan suhu dalam Celsius: ");
                double c = input.nextDouble();
                System.out.println("Hasil konversi: " + konv.konversiSuhu(c) + " °F");
                break;
            case 2:
                System.out.print("Masukkan panjang dalam meter: ");
                double m = input.nextDouble();
                System.out.println("Hasil konversi: " + konv.konversiPanjang(m) + " km");
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }

        input.close();
    }
}
