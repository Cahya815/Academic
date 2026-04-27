import java.util.Scanner;

class simpul {
    String nama;
    String alamat;
    int umur;
    char jekel;
    String hobi[] = new String[3];
    float ipk;
    simpul kiri;
    simpul kanan;
}

class senaraiGanda {
    public static simpul awal;
    public static simpul akhir;

    public static void inisialisasiSenaraiKosong() {
        awal = null;
        akhir = null;
    }

    public static void tambahDepan() {
        Scanner masukan = new Scanner(System.in);
        int bacaTombol = 0;

        System.out.println("TAMBAH DEPAN : ");
        System.out.print("Silakan masukkan nama anda : ");
        String NAMA = masukan.nextLine();
        System.out.print("Silakan masukkan alamat anda : ");
        String ALAMAT = masukan.nextLine();
        System.out.print("Silakan masukkan umur anda : ");
        int UMUR = masukan.nextInt();
        System.out.print("Silakan masukkan jenis Kelamin anda : ");
        try {
            bacaTombol = System.in.read();
        } catch (java.io.IOException e) {
        }
        char JEKEL = (char) bacaTombol;
        masukan.nextLine(); // membersihkan newline

        System.out.println("Silakan masukkan hobi (maks 3) : ");
        System.out.print("hobi ke-0 : ");
        String HOBI0 = masukan.next();
        System.out.print("hobi ke-1 : ");
        String HOBI1 = masukan.next();
        System.out.print("hobi ke-2 : ");
        String HOBI2 = masukan.next();
        System.out.print("Silakan masukkan IPK anda : ");
        float IPK = masukan.nextFloat();

        simpul baru = new simpul();
        baru.nama = NAMA;
        baru.alamat = ALAMAT;
        baru.umur = UMUR;
        baru.jekel = JEKEL;
        baru.hobi[0] = HOBI0;
        baru.hobi[1] = HOBI1;
        baru.hobi[2] = HOBI2;
        baru.ipk = IPK;

        if (awal == null) {
            awal = baru;
            akhir = baru;
            baru.kiri = null;
            baru.kanan = null;
        } else {
            baru.kanan = awal;
            awal.kiri = baru;
            awal = baru;
            awal.kiri = null;
        }
    }
    public static void tukarNilai( simpul X, simpul Y)
    { simpul sementara = new simpul();
    sementara.nama = X.nama;
    sementara.alamat = X.alamat;
    sementara.umur = X.umur;
    sementara.jekel = X.jekel;
    sementara.ipk = X.ipk;
    X.nama = Y.nama;
    X.alamat = Y.alamat;
    X.umur = Y.umur;
    X.jekel = Y.jekel;
    X.ipk = Y.ipk;
    Y.nama = sementara.nama;
Y.alamat = sementara.alamat;
Y.umur = sementara.umur;
Y.jekel = sementara.jekel;
Y.ipk = sementara.ipk;
}
//
// bisa untuk single LL dan double LL
//
public static void mengurutkanDataBubble_TeknikTukarNilai() {
    int N = hitungJumlahSimpul();
    if (N < 2) return; // Tidak perlu urut jika data <= 1

    simpul A = null;
    simpul B = null;
    simpul berhenti = null; 

    System.out.println("Banyaknya simpul = " + N);
    
    for (int i = 1; i <= N - 1; i++) {
        A = awal;
        B = awal.kanan;
        
        while (B != berhenti) {
            // MODIFIKASI: Mengurutkan berdasarkan IPK secara Descending
            // Gunakan A.ipk < B.ipk agar nilai besar bergeser ke depan
            if (A.ipk < B.ipk) {
                tukarNilai(A, B);
            }
            A = A.kanan;
            B = B.kanan;
        }
        berhenti = A; // Optimization: simpul terakhir sudah pasti paling kecil
    }
    System.out.println("=== PENGURUTAN BERDASARKAN IPK (DESCENDING) SELESAI ===");
}

    public static void tambahBelakang() {
        Scanner masukan = new Scanner(System.in);
        int bacaTombol = 0;

        System.out.println("TAMBAH BELAKANG : ");
        System.out.print("Silakan masukkan nama anda : ");
        String NAMA = masukan.nextLine();
        System.out.print("Silakan masukkan alamat anda : ");
        String ALAMAT = masukan.nextLine();
        System.out.print("Silakan masukkan umur anda : ");
        int UMUR = masukan.nextInt();
        System.out.print("Silakan masukkan Jenis Kelamin anda : ");
        try {
            bacaTombol = System.in.read();
        } catch (java.io.IOException e) {
        }
        char JEKEL = (char) bacaTombol;
        masukan.nextLine();

        System.out.println("Silakan masukkan hobi (maks 3) : ");
        System.out.print("hobi ke-0 : ");
        String HOBI0 = masukan.next();
        System.out.print("hobi ke-1 : ");
        String HOBI1 = masukan.next();
        System.out.print("hobi ke-2 : ");
        String HOBI2 = masukan.next();
        System.out.print("Silakan masukkan IPK anda : ");
        float IPK = masukan.nextFloat();

        simpul baru = new simpul();
        baru.nama = NAMA;
        baru.alamat = ALAMAT;
        baru.umur = UMUR;
        baru.jekel = JEKEL;
        baru.hobi[0] = HOBI0;
        baru.hobi[1] = HOBI1;
        baru.hobi[2] = HOBI2;
        baru.ipk = IPK;

        if (awal == null) {
            awal = baru;
            akhir = baru;
            baru.kiri = null;
            baru.kanan = null;
        } else {
            baru.kiri = akhir;
            akhir.kanan = baru;
            akhir = baru;
            akhir.kanan = null;
        }
    }

    public static int hitungJumlahSimpul() {
        int N = 0;
        simpul bantu = awal;
        while (bantu != null) {
            N++;
            bantu = bantu.kanan;
        }
        return N;
    }

    public static void tambahTengah() {
        Scanner masukan = new Scanner(System.in);
        System.out.println("Tentukan Lokasi Penambahan Data");
        int LOKASI = masukan.nextInt();
        masukan.nextLine();

        int jumlahSimpulYangAda = hitungJumlahSimpul();
        if (LOKASI == 1) {
            System.out.println("Lakukan penambahan di depan");
        } else if (LOKASI > jumlahSimpulYangAda) {
            System.out.println("Lakukan penambahan di belakang");
        } else {
            System.out.println("TAMBAH TENGAH : ");
            System.out.print("Silakan masukkan nama anda : ");
            String NAMA = masukan.nextLine();
            System.out.print("Silakan masukkan alamat anda : ");
            String ALAMAT = masukan.nextLine();
            System.out.print("Silakan masukkan umur anda : ");
            int UMUR = masukan.nextInt();
            System.out.print("Silakan masukkan Jenis Kelamin anda : ");
            int bacaTombol = 0;
            try {
                bacaTombol = System.in.read();
            } catch (java.io.IOException e) {
            }
            char JEKEL = (char) bacaTombol;
            masukan.nextLine();

            System.out.println("Silakan masukkan hobi (maks 3) : ");
            System.out.print("hobi ke-0 : ");
            String HOBI0 = masukan.next();
            System.out.print("hobi ke-1 : ");
            String HOBI1 = masukan.next();
            System.out.print("hobi ke-2 : ");
            String HOBI2 = masukan.next();
            System.out.print("Silakan masukkan IPK anda : ");
            float IPK = masukan.nextFloat();

            simpul bantu = awal;
            int i = 1;
            while (i < LOKASI && bantu != akhir) {
                bantu = bantu.kanan;
                i++;
            }

            simpul baru = new simpul();
            baru.nama = NAMA;
            baru.alamat = ALAMAT;
            baru.umur = UMUR;
            baru.jekel = JEKEL;
            baru.hobi[0] = HOBI0;
            baru.hobi[1] = HOBI1;
            baru.hobi[2] = HOBI2;
            baru.ipk = IPK;

            baru.kiri = bantu.kiri;
            baru.kiri.kanan = baru;
            baru.kanan = bantu;
            bantu.kiri = baru;
        }
    }


    public static void cetakSenaraiMaju() {
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


    public static void main(String[] args) {
        inisialisasiSenaraiKosong();
        tambahDepan();
        tambahBelakang();
        tambahTengah();
        System.out.println(" ");
        System.out.println("CETAK MAJU");
        cetakSenaraiMaju();
        tukarNilai(awal, akhir);
        mengurutkanDataBubble_TeknikTukarNilai();
        System.out.println(" ");
        System.out.println("CETAK MAJU");
        cetakSenaraiMaju();
        // tambahBelakang();
        // tambahBelakang();
        // tambahTengah();
        // System.out.println("HAPUS DATA");
        // hapus();
       
        // System.out.println(" ");
        // System.out.println("CETAK MUNDUR");
        // cetakSenaraiMundur();    
    }
}