import java.util.Scanner;

class Mahasiswa {
    String nama;
    String alamat;
    int umur;
    char jekel;
    String hobi[] = new String[3];
    float ipk;
}

public class mhs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Mahasiswa[] mhs = new Mahasiswa[5]; // minimal 5 mahasiswa

        for (int i = 0; i < 5; i++) {
            mhs[i] = new Mahasiswa();
            System.out.println("\n=== Input Data Mahasiswa ke-" + (i+1) + " ===");

            System.out.print("Nama        : ");
            mhs[i].nama = input.nextLine();

            System.out.print("Alamat      : ");
            mhs[i].alamat = input.nextLine();

            System.out.print("Umur        : ");
            mhs[i].umur = Integer.parseInt(input.nextLine());

            System.out.print("Jenis Kelamin (L/P) : ");
            mhs[i].jekel = input.nextLine().charAt(0);

            for (int j = 0; j < 3; j++) {
                System.out.print("Hobi ke-" + j + " : ");
                mhs[i].hobi[j] = input.nextLine();
            }

            System.out.print("IPK         : ");
            mhs[i].ipk = Float.parseFloat(input.nextLine());
        }

        // Output semua biodata
        System.out.println("\n=== Data Mahasiswa ===");
        for (int i = 0; i < 5; i++) {
            System.out.println("\nMahasiswa ke-" + (i+1));
            System.out.println("Nama    : " + mhs[i].nama);
            System.out.println("Alamat  : " + mhs[i].alamat);
            System.out.println("Umur    : " + mhs[i].umur);
            System.out.println("Jekel   : " + mhs[i].jekel);
            System.out.println("Hobi    : " + String.join(", ", mhs[i].hobi));
            System.out.println("IPK     : " + mhs[i].ipk);
        }
    }
}
