import java.util.Scanner;

class formatBiodata {
    String nama;
    String alamat;
    char jekel;
}

public class edit {
    static Scanner sc = new Scanner(System.in);
    static formatBiodata[] data = new formatBiodata[10];
    static int N = 0;

    public static void main(String[] args) {

        tambahDummy("Lina", "Bandung", 'P');
        tambahDummy("Rudi", "Jakarta", 'L');
        tambahDummy("Niken", "Magelang", 'P');
        tambahDummy("Sari", "Solo", 'P');

        tampilkan();
        System.out.print("\nPilih record yang ingin diedit (1 - " + N + "): ");
        int idx = sc.nextInt();
        sc.nextLine();

        editData(idx - 1);

        System.out.println("\n=== DATA SETELAH EDIT ===");
        tampilkan();
    }

    static void tambahDummy(String nama, String alamat, char jk) {
        data[N] = new formatBiodata();
        data[N].nama = nama;
        data[N].alamat = alamat;
        data[N].jekel = jk;
        N++;
    }

    static void tampilkan() {
        System.out.println("\nIdx | Nama     | Alamat    | JK");
        System.out.println("--------------------------------");
        for (int i = 0; i < N; i++) {
            System.out.printf("%-3d | %-8s | %-9s | %-2s\n",
                    (i + 1), data[i].nama, data[i].alamat, data[i].jekel);
        }
    }

    // === ️ FUNGSI EDIT DATA ===
    static void editData(int index) {
        if (index < 0 || index >= N) {
            System.out.println("Index tidak valid!");
            return;
        }

        System.out.println("\nMengedit data ke-" + (index + 1));
        System.out.print("Nama baru    : ");
        String namaBaru = sc.nextLine();
        System.out.print("Alamat baru  : ");
        String alamatBaru = sc.nextLine();
        System.out.print("Jenis Kelamin baru (L/P): ");
        char jkBaru = sc.next().charAt(0);

        data[index].nama = namaBaru;
        data[index].alamat = alamatBaru;
        data[index].jekel = jkBaru;

        System.out.println("Data berhasil diedit!");
    }
}
