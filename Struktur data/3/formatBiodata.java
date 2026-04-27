import java.util.Scanner;

 class formatBiodata {

    String nama;
    String alamat;
    int umur;
    char jekel;
    String hobi[] = new String[3];
    float ipk;
}

public class menambahData {
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
            try {
                int bacaTombol = System.in.read();
                biodataMahasiswa[i].jekel = (char) bacaTombol;
                System.in.read(); // untuk membersihkan enter
            } catch (java.io.IOException e) {}
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

    // Fungsi untuk Menambah Data Di Tengah
    public static void tambahDataDiTengah(formatBiodata biodataMahasiswa[]) {
        // Membuat record sementara untuk data baru
        formatBiodata biodataMahasiswaBaru = new formatBiodata();
        Scanner masukan = new Scanner(System.in);
        int bacaTombol = 0;

        System.out.print("\nSilakan masukkan nama anda : ");
        biodataMahasiswaBaru.nama = masukan.next();
        System.out.print("Silakan masukkan alamat anda : ");
        biodataMahasiswaBaru.alamat = masukan.next();
        System.out.print("Silakan masukkan umur anda : ");
        biodataMahasiswaBaru.umur = masukan.nextInt();
        System.out.print("Silakan masukkan Jenis Kelamin anda : ");
        try {
            bacaTombol = System.in.read();
            System.in.read(); // membersihkan enter
        } catch (java.io.IOException e) {}
        biodataMahasiswaBaru.jekel = (char) bacaTombol;
        System.out.println("Silakan masukkan hobi (maks 3) : ");
        System.out.print("hobi ke-0 : ");
        biodataMahasiswaBaru.hobi[0] = masukan.next();
        System.out.print("hobi ke-1 : ");
        biodataMahasiswaBaru.hobi[1] = masukan.next();
        System.out.print("hobi ke-2 : ");
        biodataMahasiswaBaru.hobi[2] = masukan.next();
        System.out.print("Silakan masukkan IPK anda : ");
        biodataMahasiswaBaru.ipk = masukan.nextFloat();

        // Menentukan posisi target T
        int T;
        System.out.print("Pada posisi ke berapa data akan dimasukkan? : ");
        T = masukan.nextInt();

        if (T < 0 || T > N) {
            System.out.println("Posisi tidak valid!");
            return;
        }

        // Menggeser isi larik dari belakang ke T
        for (int i = N - 1; i >= T; i--) {
            biodataMahasiswa[i + 1] = biodataMahasiswa[i];
        }

        // Memasukkan data baru
        biodataMahasiswa[T] = biodataMahasiswaBaru;
        N++;
    }

    // Fungsi untuk Menampilkan Data
    public static void tampilkanData(formatBiodata biodataMahasiswa[]) {
        System.out.println("\n===============================================");
        System.out.println("NAMA\tALAMAT\tUMUR\tJEKEL\tH0\tH1\tH2\tIPK");
        System.out.println("===============================================");

        for (int i = 0; i <= N - 1; i++) {
            System.out.print(i + ". ");
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
    public static void main (String[] args) {
        // Deklarasi larik object
        formatBiodata biodataMahasiswa[] = new formatBiodata[20];

        // Input awal
        ngentriData(biodataMahasiswa);
        // Tampilkan sebelum penambahan
        tampilkanData(biodataMahasiswa);
        // Tambah data di tengah
        tambahDataDiTengah(biodataMahasiswa);
        // Tampilkan setelah penambahan
        tampilkanData(biodataMahasiswa);
    }
}
