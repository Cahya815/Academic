package dosen;
import java.util.Scanner;

public class Dosen {
    protected String namaDosen;
    protected String nidn;
    protected Scanner input = new Scanner(System.in);

    public void inputDosen() {
        System.out.print("Masukkan Nama Dosen: ");
        namaDosen = input.nextLine();
        System.out.print("Masukkan NIDN Dosen: ");
        nidn = input.nextLine();
    }

    public void tampilDosen() {
        System.out.println("\n=== Data Dosen ===");
        System.out.println("Nama Dosen : " + namaDosen);
        System.out.println("NIDN        : " + nidn);
    }
}
