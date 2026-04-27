import java.util.Scanner;

public class nilai {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nilai;

        while (true) {  // perulangan tak hingga, bisa dihentikan dengan kondisi
            System.out.print("Masukkan angka bulat (0 - 100) ");
            nilai = in.nextInt();

            if (nilai >= 0 && nilai <= 100) {
                if (nilai >= 60) {
                    if (nilai >= 80)
                        System.out.println("Nilaimu bagus sekali");
                    else
                        System.out.println("Nilaimu bagus");
                } else {
                    if (nilai >= 30)
                        System.out.println("Nilaimu kurang");
                    else
                        System.out.println("Nilaimu jelek");
                }
            } else {
                System.out.println("Nilai di luar jangkauan (0 - 100).");
            }

            System.out.println("------------------------------");
        }
    }
}
