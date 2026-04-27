import java.util.Scanner;

class simpul
{   // bagian deklarasi struktur record ----------------------------
    String nama;
    String alamat;
    int    umur;
    char   jekel;
    String hobi[] = new String[3];
    float  ipk;
    simpul kanan;
}

class p4 {

    public static simpul awal;
    public static simpul akhir;

    // Menginisialisasi senarai kosong
    public static void inisialisasiSenaraiKosong() {
        awal  = null;
        akhir = null;
    }

    // Fungsi bantu untuk membaca karakter dengan Scanner
    public static char readChar(Scanner scanner) {
        String input = scanner.nextLine().trim();
        if (input.length() > 0) {
            return input.charAt(0);
        }
        return 'L'; // default value
    }

    // Menambah simpul di depan
    public static void tambahDepan() {
        Scanner masukan = new Scanner(System.in);

        String NAMA, ALAMAT;
        int UMUR;
        char JEKEL;
        String HOBI[] = new String[3];
        float IPK;

        System.out.println("TAMBAH DEPAN : ");
        System.out.print("Silakan masukkan nama anda : ");
        NAMA = masukan.nextLine();

        System.out.print("Silakan masukkan alamat anda : ");
        ALAMAT = masukan.nextLine();

        System.out.print("Silakan masukkan umur anda : ");
        UMUR = masukan.nextInt();
        masukan.nextLine(); // Membersihkan newline setelah nextInt()

        System.out.print("Silakan masukkan Jenis Kelamin anda : ");
        JEKEL = readChar(masukan);

        System.out.println("Silakan masukkan hobi (maks 3)");
        System.out.print("hobi ke-0 : ");
        HOBI[0] = masukan.nextLine();
        System.out.print("hobi ke-1 : ");
        HOBI[1] = masukan.nextLine();
        System.out.print("hobi ke-2 : ");
        HOBI[2] = masukan.nextLine();

        System.out.print("Silakan masukkan IPK anda : ");
        IPK = masukan.nextFloat();
        masukan.nextLine(); // Membersihkan newline setelah nextFloat()

        // buat simpul baru
        simpul baru = new simpul();
        baru.nama   = NAMA;
        baru.alamat = ALAMAT;
        baru.umur   = UMUR;
        baru.jekel  = JEKEL;
        baru.hobi[0] = HOBI[0];
        baru.hobi[1] = HOBI[1];
        baru.hobi[2] = HOBI[2];
        baru.ipk    = IPK;

        // sisipkan di depan
        if (awal == null) {          // list masih kosong
            baru.kanan = null;
            awal  = baru;
            akhir = baru;
        } else {
            baru.kanan = awal;
            awal = baru;
        }
    }

    public static void cariLinear()
{
if (awal==null) // jika senarai masih kosong
System.out.print("....MAAF SENARAI KOSONG....");
else // jika senarai tidak kosong
{
Scanner masukan = new Scanner(System.in);
System.out.print("Silakan masukkan nama yang anda cari : ");
String NAMACARI = masukan.nextLine();boolean statusKetemu = false;
int i = 0;
int posisiKetemu=-1;
simpul bantu;
bantu = awal;
while (bantu != null)
{
if (NAMACARI.equals(bantu.nama))
{ statusKetemu = true;
posisiKetemu = i;
}
bantu = bantu.kanan;
i++;
}
System.out.println("Status Ketemu = "+statusKetemu +" di posisike "+posisiKetemu);
}
}




    // Menambah simpul di belakang
    public static void tambahBelakang() {
        Scanner masukan = new Scanner(System.in);

        String NAMA, ALAMAT;
        int UMUR;
        char JEKEL;
        String HOBI[] = new String[3];
        float IPK;

        System.out.println("TAMBAH BELAKANG : ");
        System.out.print("Silakan masukkan nama anda : ");
        NAMA = masukan.nextLine();

        System.out.print("Silakan masukkan alamat anda : ");
        ALAMAT = masukan.nextLine();

        System.out.print("Silakan masukkan umur anda : ");
        UMUR = masukan.nextInt();
        masukan.nextLine(); // Membersihkan newline setelah nextInt()

        System.out.print("Silakan masukkan Jenis Kelamin anda : ");
        JEKEL = readChar(masukan);

        System.out.println("Silakan masukkan hobi (maks 3)");
        System.out.print("hobi ke-0 : ");
        HOBI[0] = masukan.nextLine();
        System.out.print("hobi ke-1 : ");
        HOBI[1] = masukan.nextLine();
        System.out.print("hobi ke-2 : ");
        HOBI[2] = masukan.nextLine();

        System.out.print("Silakan masukkan IPK anda : ");
        IPK = masukan.nextFloat();
        masukan.nextLine(); // Membersihkan newline setelah nextFloat()

        // buat simpul baru
        simpul baru = new simpul();
        baru.nama   = NAMA;
        baru.alamat = ALAMAT;
        baru.umur   = UMUR;
        baru.jekel  = JEKEL;
        baru.hobi[0] = HOBI[0];
        baru.hobi[1] = HOBI[1];
        baru.hobi[2] = HOBI[2];
        baru.ipk    = IPK;
        baru.kanan  = null;

        // sisip di belakang
        if (awal == null) {        // list kosong
            awal  = baru;
            akhir = baru;
        } else {
            akhir.kanan = baru;
            akhir = baru;
        }
    }

    // Mencetak seluruh senarai
    public static void cetakSenarai() {
        if (awal == null) {
            System.out.println("...MAAF SENARAI KOSONG....");
        } else {
            System.out.println("NO NAMA ALAMAT UMUR JEKEL HOBI[0] HOBI[1] HOBI[2] IPK");
            simpul bantu = awal;
            while (bantu != null) {
                System.out.print(bantu.nama + "\t");
                System.out.print(bantu.alamat + "\t");
                System.out.print(bantu.umur + "\t");
                System.out.print(bantu.jekel + "\t");
                System.out.print(bantu.hobi[0] + "\t");
                System.out.print(bantu.hobi[1] + "\t");
                System.out.print(bantu.hobi[2] + "\t");
                System.out.println(bantu.ipk);
                bantu = bantu.kanan;
            }
        }
    }

    // Menghitung jumlah simpul
    public static int hitungJumlahSimpul() {
        int N = 0;
        simpul bantu;
        bantu = awal;
        while (bantu != null) {
            N++;
            bantu = bantu.kanan;
        }
        return (N);
    }

    // Menambah simpul di tengah
    public static void tambahTengah() {

        Scanner masukan = new Scanner(System.in);
        System.out.println("Tentukan Lokasi Insertion Data");
        int LOKASI = masukan.nextInt();
        masukan.nextLine(); // Membersihkan newline setelah nextInt()

        int jumlahSimpulYangAda = hitungJumlahSimpul();
        if (LOKASI == 1) {
            System.out.println("Lakukan penambahan di depan");
        } else if (LOKASI > jumlahSimpulYangAda) {
            System.out.println("Lakukan penambahan di belakang");
        } else {   
            // --------- bagian entri data dari keyboard ----------
            String NAMA, ALAMAT;
            int UMUR;
            char JEKEL;
            String HOBI[] = new String[3];
            float IPK;

            System.out.println("TAMBAH TENGAH ( " + LOKASI + " )");
            System.out.print("Silakan masukkan nama anda : ");
            NAMA = masukan.nextLine();
            System.out.print("Silakan masukkan alamat anda : ");
            ALAMAT = masukan.nextLine();
            System.out.print("Silakan masukkan umur anda : ");
            UMUR = masukan.nextInt();
            masukan.nextLine(); // Membersihkan newline setelah nextInt()

            System.out.print("Silakan masukkan Jenis Kelamin anda : ");
            JEKEL = readChar(masukan);

            System.out.println("Silakan masukkan hobi (maks 3)");
            System.out.print("hobi ke-0 : ");
            HOBI[0] = masukan.nextLine();
            System.out.print("hobi ke-1 : ");
            HOBI[1] = masukan.nextLine();
            System.out.print("hobi ke-2 : ");
            HOBI[2] = masukan.nextLine();

            System.out.print("Silakan masukkan IPK anda : ");
            IPK = masukan.nextFloat();
            masukan.nextLine(); // Membersihkan newline setelah nextFloat()

            // ------ bagian menemukan posisi yang dikehendaki -----
            simpul bantu;
            bantu = awal;
            int N = 1;
            while ( (N < (LOKASI-1)) && (bantu != akhir) ) {
                bantu = bantu.kanan;
                N++;
            }

            // ------ bagian menciptakan & mengisi simpul baru -----
            simpul baru = new simpul();
            baru.nama   = NAMA;
            baru.alamat = ALAMAT;
            baru.umur   = UMUR;
            baru.jekel  = JEKEL;
            baru.hobi[0] = HOBI[0];
            baru.hobi[1] = HOBI[1];
            baru.hobi[2] = HOBI[2];
            baru.ipk    = IPK;

            // ------ bagian mencangkokkan simpul baru ke linkedlist lama
            baru.kanan   = bantu.kanan;
            bantu.kanan  = baru;
        }
    }

   

    // Program utama
    public static void main(String[] args) {

        inisialisasiSenaraiKosong();
        tambahDepan();
        tambahBelakang();
        tambahTengah();
        // hapus();
        cetakSenarai();
        cariLinear();
        cetakSenarai();
    }
}