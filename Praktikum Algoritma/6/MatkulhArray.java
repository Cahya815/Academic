import java.util.Scanner;

public class MatkulhArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String jenjang;
        int maxMatkul = 0;
        
        System.out.print("Masukkan jenjang (D3 / S1) = ");
        jenjang = input.nextLine();

        if (jenjang.equalsIgnoreCase("D3")) {
            maxMatkul = 3;
        } else if (jenjang.equalsIgnoreCase("S1")) {
            maxMatkul = 5;
        }
        String[] mataKuliah = new String[maxMatkul];
        int[] sks = new int[maxMatkul];
        int totalSks = 0;

        for (int i = 0; i < maxMatkul; i++) {
            System.out.print("Masukkan matakuliah = ");
            mataKuliah[i] = input.nextLine();

            System.out.print("Masukkan sks = ");
            sks[i] = input.nextInt();
            totalSks += sks[i];
            input.nextLine(); // bersihkan newline
        }
        System.out.println("\n--- Data Mata Kuliah ---");
        for (int i = 0; i < maxMatkul; i++) {
            System.out.println("Matakuliah: " + mataKuliah[i]);
            System.out.println("SKS: " + sks[i]);
        }
        System.out.println("Total SKS = " + totalSks);
    }
}
