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

    public static void mengurutkanDataBubble_TeknikTukarHeap()
    {
    int N = hitungJumlahSimpul();
    simpul bantu = awal;
    System.out.println ("Banyaknya simpul = " + hitungJumlahSimpul());
    for (int i=1; i<= hitungJumlahSimpul(); i++)
    {
    //khusus menguji simpul pertama dgn sebelahnya
    if (awal.nama.compareTo(awal.kanan.nama)> 0)
    {
    bantu = awal.kanan;
    awal.kanan = bantu.kanan;
    bantu.kanan.kiri = awal;
    bantu.kanan = awal;
    bantu.kiri = null;
    awal.kiri = bantu;
    awal = bantu;
    }
    
    bantu = awal;
while (bantu.kanan != akhir)
{ simpul A = bantu.kanan;
simpul B = bantu.kanan.kanan;
if (A.nama.compareTo(B.nama)>0)
{
//tukarkan simpul A dan simpul B
A.kanan = B.kanan;
if (B!=akhir) A.kanan.kiri = A;
B.kanan.kiri = A;
B.kanan = A;
A.kiri = B;
bantu.kanan = B;
B.kiri = bantu;
if (B==akhir) akhir = A;
}
bantu = bantu.kanan;
}
System.out.println ("");
}
System.out.println("===PROSES PENGURUTAN BUBBLE SELESAI=====");
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


    public static void p3(String[] args) {
        inisialisasiSenaraiKosong();
        tambahDepan();
        tambahBelakang();
        tambahTengah();
        System.out.println("CETAK MAJU");
        cetakSenaraiMaju();
        mengurutkanDataBubble_TeknikTukarHeap();
        System.out.println(" ");
        System.out.println("CETAK MAJU");
        cetakSenaraiMaju();
   
    }
}