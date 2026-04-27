import java.util.Scanner;

class formatBiodata {
    String nama;
    String alamat;
    int umur;
    char jekel;
    String hobi[] = new String[3];
    float ipk;
}

public class Binary {
    public static int N = 0;

    // Fungsi untuk mengentri data ke dalam larik
    public static void ngentriData(formatBiodata biodataMahasiswa[]) {
        Scanner masukan = new Scanner(System.in);
        System.out.print("Masukkan jumlah data awal (N): ");
        N = masukan.nextInt();

        for (int i = 0; i < N; i++) {
            biodataMahasiswa[i] = new formatBiodata();
            System.out.println("\nData ke-" + i);
            System.out.print("Masukkan Nama   : ");
            biodataMahasiswa[i].nama = masukan.next();
            System.out.print("Masukkan Alamat : ");
            biodataMahasiswa[i].alamat = masukan.next();
            System.out.print("Masukkan Umur   : ");
            biodataMahasiswa[i].umur = masukan.nextInt();
            System.out.print("Masukkan Jenis Kelamin (L/P): ");
            biodataMahasiswa[i].jekel = masukan.next().charAt(0);
            System.out.println("Masukkan Hobi (maks 3)");
            System.out.print("Hobi ke-0: ");
            biodataMahasiswa[i].hobi[0] = masukan.next();
            System.out.print("Hobi ke-1: ");
            biodataMahasiswa[i].hobi[1] = masukan.next();
            System.out.print("Hobi ke-2: ");
            biodataMahasiswa[i].hobi[2] = masukan.next();
            System.out.print("Masukkan IPK   : ");
            biodataMahasiswa[i].ipk = masukan.nextFloat();
        }
    }

    // --- Fungsi Binary Search berdasarkan nama ---
    public static void mencariDataBiner(formatBiodata biodataMahasiswa[]) {
        Scanner masukan = new Scanner(System.in);
        System.out.print("\nMasukkan kata kunci pencarian (Nama): ");
        String kataKunci = masukan.next();

        int atas = 0;
        int bawah = N - 1;
        int lokasi = -1;
        boolean statusKetemu = false;

        while (atas <= bawah && !statusKetemu) {
            int tengah = (atas + bawah) / 2;
            System.out.println("Membandingkan dengan: " + biodataMahasiswa[tengah].nama);

            int hasilBanding = kataKunci.compareToIgnoreCase(biodataMahasiswa[tengah].nama);

            if (hasilBanding == 0) {
                statusKetemu = true;
                lokasi = tengah;
            } else if (hasilBanding < 0) {
                bawah = tengah - 1;
            } else {
                atas = tengah + 1;
            }
        }

        if (statusKetemu) {
            System.out.println("\nData ditemukan di indeks ke-" + lokasi + ":");
            System.out.println("Nama   : " + biodataMahasiswa[lokasi].nama);
            System.out.println("Alamat : " + biodataMahasiswa[lokasi].alamat);
            System.out.println("Umur   : " + biodataMahasiswa[lokasi].umur);
            System.out.println("Jekel  : " + biodataMahasiswa[lokasi].jekel);
            System.out.println("Hobi   : " + String.join(", ", biodataMahasiswa[lokasi].hobi));
            System.out.println("IPK    : " + biodataMahasiswa[lokasi].ipk);
        } else {
            System.out.println("\nMaaf, nama yang anda cari tidak ditemukan.");
        }
    }

    // Fungsi untuk Menampilkan Data
    public static void tampilkanData(formatBiodata biodataMahasiswa[]) {
        System.out.println("\n===============================================================");
        System.out.println("No\tNama\tAlamat\tUmur\tJK\tHobi0\tHobi1\tHobi2\tIPK");
        System.out.println("===============================================================");

        for (int i = 0; i < N; i++) {
            System.out.print(i + "\t");
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

    // Program Utama
    public static void main(String[] args) {
        formatBiodata biodataMahasiswa[] = new formatBiodata[20];

        ngentriData(biodataMahasiswa);
        tampilkanData(biodataMahasiswa);
        mencariDataBiner(biodataMahasiswa);
    }
}
