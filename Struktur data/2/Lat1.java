import java.util.Scanner;

class formatBiodata {
    String nama;
    String alamat;
    int umur;
    char jekel;
    String hobi[] = new String[3];
    float ipk;
}

class Lat1 {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        final int MAKS = 15;
        formatBiodata[] biodataMahasiswa = new formatBiodata[MAKS];

        System.out.print("Masukkan jumlah data mahasiswa (maks 15): ");
        int N = masukan.nextInt();
        if (N > MAKS) {
            System.out.println("Jumlah terlalu banyak! Otomatis dibatasi 15.");
            N = MAKS;
        }

        // --- Entri Data Dinamis ---
        for (int i = 0; i < N; i++) {
            biodataMahasiswa[i] = new formatBiodata();
            System.out.println("\nData ke-" + (i + 1));
            System.out.print("Nama          : ");
            biodataMahasiswa[i].nama = masukan.next();
            System.out.print("Alamat        : ");
            biodataMahasiswa[i].alamat = masukan.next();
            System.out.print("Umur          : ");
            biodataMahasiswa[i].umur = masukan.nextInt();
            System.out.print("Jenis Kelamin (L/P): ");
            biodataMahasiswa[i].jekel = masukan.next().charAt(0);
            System.out.print("Hobi 1        : ");
            biodataMahasiswa[i].hobi[0] = masukan.next();
            System.out.print("Hobi 2        : ");
            biodataMahasiswa[i].hobi[1] = masukan.next();
            System.out.print("Hobi 3        : ");
            biodataMahasiswa[i].hobi[2] = masukan.next();
            System.out.print("IPK           : ");
            biodataMahasiswa[i].ipk = masukan.nextFloat();
        }

        // --- Tampilkan Data ---
        System.out.println("\n===============================================================");
        System.out.println("NAMA\tALAMAT\tUMUR\tJEKEL\tHOBI1\tHOBI2\tHOBI3\tIPK");
        System.out.println("===============================================================");
        for (int i = 0; i < N; i++) {
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
}
