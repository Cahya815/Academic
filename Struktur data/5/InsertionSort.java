import java.util.Scanner;

class formatBiodata {
    String nama;
    String alamat;
    int umur;
    char jekel;
    String hobi[] = new String[3];
    float ipk;
}

public class InsertionSort {
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
///
//--- Fungsi untuk Mengurutkan Data (Insertion) ---
//
public static void mengurutkanDataInsertion(formatBiodata biodataMahasiswa[])
{
formatBiodata biodataSementara = new formatBiodata();
//untuk menentukan awal dari data sisi kanan (sisi yg masih berantakan)
int awal;
//untuk mencari posisi yg tepat pada sisi kiri (sisi yg sudah berurutan)
int cari;
awal = 1;
while (awal <=N-1)
{
biodataSementara = biodataMahasiswa[awal];
cari = awal-1;
//cari akan bergerak dari kanan (awal-1) ke kiri
while ( cari >= 0)
{
//( biodataMahasiswa[cari].nama > biodataSementara.nama )
if (biodataMahasiswa[cari].nama.compareTo(biodataSementara.nama)>0)
{
biodataMahasiswa[cari+1] = biodataMahasiswa[cari];
biodataMahasiswa[cari] = biodataSementara;
cari--; //cari digeser kekiri 1 langkah
}
else
{ biodataMahasiswa[cari+1] = biodataSementara;
// perintah ini untuk keluar dari loop while
cari=-1;
}
}
awal++;
}
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
    public static void main(String[] args) {
        // Deklarasi larik object
        formatBiodata biodataMahasiswa[] = new formatBiodata[20];

        // Input awal
        ngentriData(biodataMahasiswa);
        // Tampilkan sebelum penambahan
        tampilkanData(biodataMahasiswa);
        // Tambah data di tengah
        mengurutkanDataInsertion(biodataMahasiswa);
        // Tampilkan setelah penambahan
        tampilkanData(biodataMahasiswa);
    }
}
