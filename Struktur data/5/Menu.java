import java.util.Scanner;

class formatBiodata {
    String nama;
    String alamat;
    int umur;
    char jekel;
    String hobi[] = new String[3];
    float ipk;
}

public class Menu {
    public static int N = 0; // jumlah data saat ini (growable)
    public static Scanner masukan = new Scanner(System.in);

    // Fungsi INSERT DATA
    public static void insertData(formatBiodata[] biodataMahasiswa) {
        System.out.print("Masukkan jumlah data yang ingin ditambahkan: ");
        int tambah = Integer.parseInt(masukan.nextLine());

        for (int i = 0; i < tambah; i++) {
            if (N >= biodataMahasiswa.length) {
                System.out.println("Array sudah penuh, tidak bisa tambah data lagi!");
                return;
            }

            biodataMahasiswa[N] = new formatBiodata();
            System.out.println("\nInput Data ke-" + (N + 1));

            System.out.print("Masukkan Nama   : ");
            biodataMahasiswa[N].nama = masukan.nextLine();

            System.out.print("Masukkan Alamat : ");
            biodataMahasiswa[N].alamat = masukan.nextLine();

            System.out.print("Masukkan Umur   : ");
            biodataMahasiswa[N].umur = Integer.parseInt(masukan.nextLine());

            System.out.print("Masukkan Jenis Kelamin (L/P): ");
            biodataMahasiswa[N].jekel = masukan.nextLine().charAt(0);

            System.out.println("Masukkan Hobi (maks 3)");
            System.out.print("Hobi ke-0: ");
            biodataMahasiswa[N].hobi[0] = masukan.nextLine();
            System.out.print("Hobi ke-1: ");
            biodataMahasiswa[N].hobi[1] = masukan.nextLine();
            System.out.print("Hobi ke-2: ");
            biodataMahasiswa[N].hobi[2] = masukan.nextLine();

            System.out.print("Masukkan IPK   : ");
            biodataMahasiswa[N].ipk = Float.parseFloat(masukan.nextLine());

            N++; // Tambah total data
        }
    }

    // Fungsi VIEW DATA
    public static void tampilkanData(formatBiodata[] biodataMahasiswa) {
        if (N == 0) {
            System.out.println("\nData masih kosong!");
            return;
        }

        System.out.println("\n===============================================");
        System.out.println("NAMA\tALAMAT\tUMUR\tJEKEL\tH0\tH1\tH2\tIPK");
        System.out.println("===============================================");

        for (int i = 0; i < N; i++) {
            System.out.print((i) + ". ");
            System.out.print(biodataMahasiswa[i].nama + "\t");
            System.out.print(biodataMahasiswa[i].alamat + "\t");
            System.out.print(biodataMahasiswa[i].umur + "\t");
            System.out.print(biodataMahasiswa[i].jekel + "\t");
            System.out.print(biodataMahasiswa[i].hobi[0] + "\t");
            System.out.print(biodataMahasiswa[i].hobi[1] + "\t");
            System.out.print(biodataMahasiswa[i].hobi[2] + "\t");
            System.out.println(biodataMahasiswa[i].ipk);
        }
    }

    // Fungsi SORT (Insertion Sort by IPK)
    public static void sortByIPK(formatBiodata[] biodataMahasiswa) {
        if (N <= 1) {
            System.out.println("Data kurang dari 2, tidak perlu sort.");
            return;
        }

        for (int i = 1; i < N; i++) {
            formatBiodata temp = biodataMahasiswa[i];
            int j = i - 1;

            while (j >= 0 && biodataMahasiswa[j].ipk > temp.ipk) {
                biodataMahasiswa[j + 1] = biodataMahasiswa[j];
                j--;
            }
            biodataMahasiswa[j + 1] = temp;
        }

        System.out.println("\nData berhasil diurutkan berdasarkan IPK (Ascending).");
    }

    // MAIN PROGRAM DENGAN MENU
    public static void main(String[] args) {
        formatBiodata[] biodataMahasiswa = new formatBiodata[20];
        int pilihan;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Insert Data");
            System.out.println("2. View Data");
            System.out.println("3. Sort Berdasarkan IPK");
            System.out.println("4. Exit");
            System.out.print("Pilih (1-4): ");
            pilihan = Integer.parseInt(masukan.nextLine());

            switch (pilihan) {
                case 1:
                    insertData(biodataMahasiswa);
                    break;
                case 2:
                    tampilkanData(biodataMahasiswa);
                    break;
                case 3:
                    sortByIPK(biodataMahasiswa);
                    break;
                case 4:
                    System.out.println("Keluar...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 4);
    }
}
