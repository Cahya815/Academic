import java.util.Scanner;

class formatBiodata {
    String nama;
    String alamat;
    int umur;
    char jekel;
    String hobi[] = new String[3];
    float ipk;
}

public class MasterPaktik1 {
    public static int N = 0; // jumlah data saat ini

    // Fungsi input data awal
    public static void ngentriData(formatBiodata[] biodataMahasiswa) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan jumlah data awal: ");
        N = in.nextInt();
        in.nextLine();

        for (int i = 0; i < N; i++) {
            biodataMahasiswa[i] = new formatBiodata();
            System.out.println("Data ke-" + (i + 1));
            System.out.print("Nama   : ");
            biodataMahasiswa[i].nama = in.nextLine();
            System.out.print("Alamat : ");
            biodataMahasiswa[i].alamat = in.nextLine();
            System.out.print("Umur   : ");
            biodataMahasiswa[i].umur = in.nextInt();
            in.nextLine();
            System.out.print("Jenis Kelamin (L/P): ");
            biodataMahasiswa[i].jekel = in.next().charAt(0);
            in.nextLine();
            System.out.print("Hobi 1: ");
            biodataMahasiswa[i].hobi[0] = in.nextLine();
            System.out.print("Hobi 2: ");
            biodataMahasiswa[i].hobi[1] = in.nextLine();
            System.out.print("Hobi 3: ");
            biodataMahasiswa[i].hobi[2] = in.nextLine();
            System.out.print("IPK    : ");
            biodataMahasiswa[i].ipk = in.nextFloat();
            in.nextLine();
        }
    }


	//--- Fungsi untuk Menambah Data Di Tengah ---
	//
	public static void tambahDataDiTengah(formatBiodata biodataMahasiswa[])
	{
	//bagian membuat record sementara untuk menampung data baru-----------
	formatBiodata biodataMahasiswaBaru = new formatBiodata();
	//bagian entri data baru ke penyimpan sementara-----------------------
	Scanner masukan = new Scanner(System.in);
	int bacaTombol=0;
	System.out.print("Silakan masukkan nama anda : ");
	biodataMahasiswaBaru.nama = masukan.next();
	System.out.print("Silakan masukkan alamat anda : ");
	biodataMahasiswaBaru.alamat = masukan.next();
	System.out.print("Silakan masukkan umur anda : ");
	biodataMahasiswaBaru.umur = masukan.nextInt();
	System.out.print("Silakan masukkan Jenis Kelamin anda : ");
	try
	{ bacaTombol = System.in.read();
	}
	catch(java.io.IOException e)
{
    }}

    // Fungsi tampilkan data
    public static void tampilkanData(formatBiodata[] biodataMahasiswa) {
        System.out.println("\n=== DATA MAHASISWA ===");
        System.out.println("Idx\tNama\tAlamat\tUmur\tJK\tHobi1\tHobi2\tHobi3\tIPK");
        for (int i = 0; i < N; i++) {
            System.out.print(i + ".\t");
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
        formatBiodata[] biodataMahasiswa = new formatBiodata[15];
        ngentriData(biodataMahasiswa);
        tampilkanData(biodataMahasiswa);

        // TEST Praktik 1
        tambahDataDiTengah(biodataMahasiswa);
        tampilkanData(biodataMahasiswa);
    }
}
