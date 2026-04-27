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

class single {

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
            System.out.println("Senarai kosong.");
            return;
        }

        simpul bantu = awal;
        int i = 1;
        while (bantu != null) {
            System.out.println("Data ke-" + i);
            System.out.println("Nama   : " + bantu.nama);
            System.out.println("Alamat : " + bantu.alamat);
            System.out.println("Umur   : " + bantu.umur);
            System.out.println("JK     : " + bantu.jekel);
            System.out.println("Hobi   : " +
                    bantu.hobi[0] + ", " +
                    bantu.hobi[1] + ", " +
                    bantu.hobi[2]);
            System.out.println("IPK    : " + bantu.ipk);
            System.out.println("-----------------------------");
            bantu = bantu.kanan;
            i++;
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
        tambahDepan();
        tambahDepan();
        tambahDepan();
        tambahBelakang();
        tambahBelakang();
        tambahBelakang();
        tambahBelakang();
        tambahBelakang();
        tambahTengah();
        cetakSenarai();
    }
}