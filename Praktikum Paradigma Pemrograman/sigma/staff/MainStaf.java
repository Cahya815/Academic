package staff;

import java.util.Scanner;

public class MainStaf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama Staf: ");
        String nama = input.nextLine();

        System.out.print("Masukkan Gaji Staf: ");
        double gaji = input.nextDouble();
        input.nextLine();

        System.out.print("Masukkan Bagian: ");
        String bagian = input.nextLine();

        System.out.print("Masukkan Tunjangan: ");
        double tunjangan = input.nextDouble();

        Staf staf1 = new Staf(nama, gaji, bagian, tunjangan);
        staf1.tampilData();

        input.close();
    }
}
