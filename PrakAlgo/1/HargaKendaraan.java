import java.util.Scanner;

public class HargaKendaraan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Pilih jenis kendaraan:");
        System.out.println("1. Mobil 2. Motor");
        System.out.print("Pilihan Anda: ");
        int jenisKendaraan = input.nextInt();

        if (jenisKendaraan == 1) {
            System.out.println("Pilih merek mobil:");
            System.out.println("1. Honda 2. Suzuki");
            System.out.print("Pilihan Anda: ");
            int merekMobil = input.nextInt();

            if (merekMobil == 1) {
                System.out.println("Pilih model Honda:");
                System.out.println("1. Jazz 2. Brio 3. Mobilio");
                System.out.print("Pilihan Anda: ");
                int modelHonda = input.nextInt();

                if (modelHonda == 1) {
                    System.out.println("Harga Honda Jazz: 170.000.000");
                } else if (modelHonda == 2) {
                    System.out.println("Harga Honda Brio: 120.000.000");
                } else if (modelHonda == 3) {
                    System.out.println("Harga Honda Mobilio: 170.000.000");
                } else {
                    System.out.println("Pilihan model Honda tidak valid.");
                }

            } else if (merekMobil == 2) {
                System.out.println("Pilih model Suzuki:");
                System.out.println("1. APV 2. Swift 3. Ertiga");
                System.out.print("Pilihan Anda: ");
                int modelSuzuki = input.nextInt();

                if (modelSuzuki == 1) {
                    System.out.println("Harga Suzuki APV: 180.000.000");
                } else if (modelSuzuki == 2) {
                    System.out.println("Harga Suzuki Swift: 155.000.000");
                } else {
                    System.out.println("Harga Suzuki Ertiga: 160.000.000");
                }
            } else {
                System.out.println("Pilihan merek mobil tidak valid.");
            }

        } else if (jenisKendaraan == 2) {
            System.out.println("Pilih merek motor:");
            System.out.println("1. Honda 2. Yamaha");
            System.out.print("Pilihan Anda: ");
            int merekMotor = input.nextInt();

            if (merekMotor == 1) {
                System.out.println("Pilih model Honda:");
                System.out.println("1. Vario 2. Supra");
                System.out.print("Pilihan Anda: ");
                int modelHondaMotor = input.nextInt();

                if (modelHondaMotor == 1) {
                    System.out.println("Harga Honda Vario: 15.000.000");
                } else if (modelHondaMotor == 2) {
                    System.out.println("Harga Honda Supra: 12.000.000");
                } else {
                    System.out.println("Pilihan model Honda tidak valid.");
                }

            } else if (merekMotor == 2) {
                System.out.println("Pilih model Yamaha:");
                System.out.println("1. Mio 2. Vixion");
                System.out.print("Pilihan Anda: ");
                int modelYamaha = input.nextInt();

                if (modelYamaha == 1) {
                    System.out.println("Harga Yamaha Mio: 14.000.000");
                } else if (modelYamaha == 2) {
                    System.out.println("Harga Yamaha Vixion: 20.000.000");
                } else {
                    System.out.println("Pilihan model Yamaha tidak valid.");
                }
            } else {
                System.out.println("Pilihan merek motor tidak valid.");
            }
        } else {
            System.out.println("Pilihan jenis kendaraan tidak valid.");
        }}}