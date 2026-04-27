import java.util.Scanner;

class formatBiodata {
    String nama;
    String alamat;
    int umur;
    char jekel;
    String hobi[] = new String[3];
    float ipk;
}

class Tug1 {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        final int MAKS = 20;
        formatBiodata[] biodataMahasiswa = new formatBiodata[MAKS];

        int N = 0;
        char lanjut = 'Y';

        while (lanjut == 'Y' || lanjut == 'y') {
            if (N >= MAKS) {
                System.out.println("Data sudah mencapai maksimum (20).");
                break;
            }

            biodataMahasiswa[N] = new formatBiodata();
            System.out.println("\nData ke-" + (N + 1));
            System.out.print("Nama          : ");
            biodataMahasiswa[N].nama = masukan.next();
            System.out.print("Alamat        : ");
            biodataMahasiswa[N].alamat = masukan.next();
            System.out.print("Umur          : ");
            biodataMahasiswa[N].umur = masukan.nextInt();
            System.out.print("Jenis Kelamin (L/P): ");
            biodataMahasiswa[N].jekel = masukan.next().charAt(0);
            System.out.print("Hobi 1        : ");
            biodataMahasiswa[N].hobi[0] = masukan.next();
            System.out.print("Hobi 2        : ");
            biodataMahasiswa[N].hobi[1] = masukan.next();
            System.out.print("Hobi 3        : ");
            biodataMahasiswa[N].hobi[2] = masukan.next();
            System.out.print("IPK           : ");
            biodataMahasiswa[N].ipk = masukan.nextFloat();

            N++; // increment jumlah record

            System.out.print("\nIngin menambah data lagi? (Y/N): ");
            lanjut = masukan.next().charAt(0);
        }

        // --- Tampilkan semua data ---
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
