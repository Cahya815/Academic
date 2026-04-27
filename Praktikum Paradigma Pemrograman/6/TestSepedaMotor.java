import java.util.Scanner;

public class TestSepedaMotor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SepedaMotor motor = new SepedaMotor();

        System.out.print("Masukkan Merk: ");
        motor.setMerk(input.nextLine());

        System.out.print("Masukkan CC: ");
        motor.setCc(input.nextInt());
        input.nextLine(); // Consume newline

        System.out.print("Masukkan Warna: ");
        motor.setWarna(input.nextLine());

        System.out.print("Masukkan Tahun: ");
        motor.setTahun(input.nextInt());

        System.out.print("Masukkan Harga: ");
        motor.setHarga(input.nextDouble());

        System.out.println("\nInformasi Sepeda Motor:");
        motor.tampilkanInfo();

        input.close();
    }
}
