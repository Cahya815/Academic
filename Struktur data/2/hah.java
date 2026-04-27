import java.util.Scanner;

class Mahasiswa {
    String nama;
    String noMhs;
    float uts;
    float uas;
}

class hah {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        final int MAKS = 20;
        Mahasiswa[] data = new Mahasiswa[MAKS];
        int N = 0;
        int pilihan;

        do {
            System.out.println("\n===== MENU BIODATA MAHASISWA =====");
            System.out.println("1. Input Data");
            System.out.println("2. View Data");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1-3): ");
            pilihan = masukan.nextInt();

            switch (pilihan) {
                case 1:
                    if (N >= MAKS) {
                        System.out.println("Data penuh! Tidak bisa menambah lagi.");
                        break;
                    }
                    data[N] = new Mahasiswa();
                    System.out.print("Nama       : ");
                    data[N].nama = masukan.next();
                    System.out.print("No. Mhs    : ");
                    data[N].noMhs = masukan.next();
                    System.out.print("Nilai UTS  : ");
                    data[N].uts = masukan.nextFloat();
                    System.out.print("Nilai UAS  : ");
                    data[N].uas = masukan.nextFloat();
                    N++;
                    System.out.println("Data berhasil disimpan!");
                    break;

                case 2:
                    System.out.println("\n==============================================");
                    System.out.println("NAMA\tNOMHS\t\tUTS\tUAS");
                    System.out.println("==============================================");
                    for (int i = 0; i < N; i++) {
                        System.out.println(data[i].nama + "\t" + data[i].noMhs + "\t\t" +
                                data[i].uts + "\t" + data[i].uas);
                    }
                    break;

                case 3:
                    System.out.println("Keluar dari program...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 3);
    }
}
