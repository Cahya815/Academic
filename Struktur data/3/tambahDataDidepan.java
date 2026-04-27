import java.util.Scanner;

// Struktur Data Mahasiswa
class formatBiodata {
    String nama;
    String alamat;
    int umur;
    char jekel;
    String hobi[] = new String[3];
    float ipk;
}

// Class utama berisi operasi tambah dan tampil
public class tambahDataDidepan {
    public static int N = 0; // Banyak data terisi

    // Fungsi input data (isi array pertama kali)
    public static void ngentriData(formatBiodata biodataMahasiswa[]) {
        Scanner masukan = new Scanner(System.in);

        System.out.print("Masukkan jumlah data awal: ");
        N = masukan.nextInt();

        for (int i = 0; i < N; i++) {
            biodataMahasiswa[i] = new formatBiodata();

            System.out.print("Nama : ");
            biodataMahasiswa[i].nama = masukan.next();

            System.out.print("Alamat : ");
            biodataMahasiswa[i].alamat = masukan.next();

            System.out.print("Umur : ");
            biodataMahasiswa[i].umur = masukan.nextInt();

            System.out.print("Jenis Kelamin (L/P): ");
            biodataMahasiswa[i].jekel = masukan.next().charAt(0);

            System.out.print("Hobi 1 : ");
            biodataMahasiswa[i].hobi[0] = masukan.next();
            System.out.print("Hobi 2 : ");
            biodataMahasiswa[i].hobi[1] = masukan.next();
            System.out.print("Hobi 3 : ");
            biodataMahasiswa[i].hobi[2] = masukan.next();

            System.out.print("IPK : ");
            biodataMahasiswa[i].ipk = masukan.nextFloat();
        }
    }

    // Fungsi tambah data di depan
    public static void tambahDataDiDepan(formatBiodata biodataMahasiswa[]) {
        Scanner masukan = new Scanner(System.in);
        formatBiodata biodataBaru = new formatBiodata();

        System.out.println("\n--- Tambah Data di Depan ---");
        System.out.print("Nama : ");
        biodataBaru.nama = masukan.next();
        System.out.print("Alamat : ");
        biodataBaru.alamat = masukan.next();
        System.out.print("Umur : ");
        biodataBaru.umur = masukan.nextInt();
        System.out.print("Jenis Kelamin (L/P): ");
        biodataBaru.jekel = masukan.next().charAt(0);
        System.out.print("Hobi 1 : ");
        biodataBaru.hobi[0] = masukan.next();
        System.out.print("Hobi 2 : ");
        biodataBaru.hobi[1] = masukan.next();
        System.out.print("Hobi 3 : ");
        biodataBaru.hobi[2] = masukan.next();
        System.out.print("IPK : ");
        biodataBaru.ipk = masukan.nextFloat();

        // Geser data ke belakang
        for (int i = N - 1; i >= 0; i--) {
            biodataMahasiswa[i + 1] = biodataMahasiswa[i];
        }

        biodataMahasiswa[0] = biodataBaru;
        N++;
    }

    // Fungsi tampil
    public static void tampilkanData(formatBiodata biodataMahasiswa[]) {
        System.out.println("\n--- DATA MAHASISWA ---");
        for (int i = 0; i < N; i++) {
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

    public static void main(String[] args) {
        formatBiodata[] data = new formatBiodata[15];

        ngentriData(data);
        tampilkanData(data);

        tambahDataDiDepan(data);
        tampilkanData(data);
    }
}
