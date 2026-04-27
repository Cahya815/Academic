import java.util.Scanner;

class formatBiodata {
    String nama;
    String alamat;
    int umur;
    String jekel;
    String hobi[] = new String[3];

    public void inputData(Scanner sc) {
        sc.nextLine(); // buang newline sisa dari nextInt() sebelumnya
        System.out.print("Nama   : ");
        nama = sc.nextLine();
        System.out.print("Alamat : ");
        alamat = sc.nextLine();
        System.out.print("Umur   : ");
        umur = sc.nextInt();
        sc.nextLine(); // buang newline lagi setelah nextInt()
        System.out.print("Jenis Kelamin (L/P): ");
        jekel = sc.nextLine();

        for (int i = 0; i < 3; i++) {
            System.out.print("Hobi ke-" + (i + 1) + ": ");
            hobi[i] = sc.nextLine();
        }
    }

    public void tampilData() {
        System.out.println("Nama   : " + nama);
        System.out.println("Alamat : " + alamat);
        System.out.println("Umur   : " + umur);
        System.out.println("JK     : " + jekel);
        System.out.print("Hobi   : ");
        for (int i = 0; i < 3; i++) {
            System.out.print(hobi[i] + (i < 2 ? ", " : ""));
        }
        System.out.println("\n-----------------------------");
    }
}

public class mainProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah record (max 15): ");
        int N = sc.nextInt();

        formatBiodata[] biodata = new formatBiodata[N];

        // Input data
        for (int i = 0; i < N; i++) {
            System.out.println("\nInput Data ke-" + (i + 1));
            biodata[i] = new formatBiodata();
            biodata[i].inputData(sc);
        }

        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Tampilkan Data");
            System.out.println("2. Tukar Data");
            System.out.println("3. Keluar");
            System.out.print("Pilih: ");
            int pilih = sc.nextInt();

            if (pilih == 1) {
                tampilSemua(biodata);
            }
            else if (pilih == 2) {
                System.out.print("Masukkan posisi pertama: ");
                int p1 = sc.nextInt() - 1;
                System.out.print("Masukkan posisi kedua  : ");
                int p2 = sc.nextInt() - 1;

                tukarData(biodata, p1, p2);
                System.out.println("\nData berhasil ditukar!");
                tampilSemua(biodata);
            }
            else if (pilih == 3) {
                System.out.println("Program selesai.");
                break;
            }
            else {
                System.out.println("Pilihan tidak valid.");
            }
        }

        sc.close();
    }

    public static void tukarData(formatBiodata[] biodata, int pos1, int pos2) {
        formatBiodata temp = biodata[pos1];
        biodata[pos1] = biodata[pos2];
        biodata[pos2] = temp;
    }

    public static void tampilSemua(formatBiodata[] biodata) {
        System.out.println("\n=== DAFTAR DATA ===");
        for (int i = 0; i < biodata.length; i++) {
            System.out.println("Record ke-" + (i + 1));
            biodata[i].tampilData();
        }
    }
}
