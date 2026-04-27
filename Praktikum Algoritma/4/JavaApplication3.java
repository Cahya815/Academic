import java.util.Scanner;

public class JavaApplication3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mhs, banyakTes = 3;
        int[][] nilai;
        float[] rata, jumlah;
        int[] ntt, ntr;
        float rtt, rtr;
        String[] nama, nim, jurusan;

        System.out.print("Masukkan Jumlah Mahasiswa : ");
        mhs = input.nextInt();
        input.nextLine();

        nilai = new int[mhs][banyakTes];
        jumlah = new float[mhs];
        rata = new float[mhs];
        ntt = new int[banyakTes];
        ntr = new int[banyakTes];
        nama = new String[mhs];
        nim = new String[mhs];
        jurusan = new String[mhs];
        System.out.println();

        for (int h = 0; h < mhs; h++) {
            System.out.println("Data Mahasiswa ke-" + (h + 1));
            System.out.print("Nama    : ");
            nama[h] = input.nextLine();
            System.out.print("NIM     : ");
            nim[h] = input.nextLine();
            System.out.print("Jurusan : ");
            jurusan[h] = input.nextLine();

            System.out.println("Masukkan Nilai:");
            for (int i = 0; i < banyakTes; i++) {
                System.out.print("Nilai Tes " + (i + 1) + " : ");
                nilai[h][i] = input.nextInt();
                jumlah[h] += nilai[h][i];
            }
            rata[h] = jumlah[h] / banyakTes;
            input.nextLine();
            System.out.println();
        }

        for (int i = 0; i < banyakTes; i++) {
            ntt[i] = nilai[0][i];
            ntr[i] = nilai[0][i];
        }
        rtt = rata[0];
        rtr = rata[0];

        for (int i = 0; i < banyakTes; i++) {
            for (int j = 0; j < mhs; j++) {
                if (ntt[i] < nilai[j][i]) {
                    ntt[i] = nilai[j][i];
                }
                if (ntr[i] > nilai[j][i]) {
                    ntr[i] = nilai[j][i];
                }}}

        for (int i = 0; i < mhs; i++) {
            if (rtt < rata[i]) rtt = rata[i];
            if (rtr > rata[i]) rtr = rata[i];
        }

        System.out.println("---------------------------");
        System.out.println("Daftar Nilai Mahasiswa : ");
        System.out.println("---------------------------\n");
        System.out.println("Nama\t\tNIM\t\tJurusan\t\tTest1\tTest2\tTest3\tRata-rata");
        for (int j = 0; j < mhs; j++) {
            System.out.print(nama[j] + "\t" + nim[j] + "\t" + jurusan[j] + "\t");
            for (int k = 0; k < banyakTes; k++) {
                System.out.print(nilai[j][k] + "\t");
            }
            System.out.println(rata[j]);
        }
        System.out.print("\nNilai Tertinggi\t");
        for (int j = 0; j < banyakTes; j++) {
            System.out.print(ntt[j] + "\t");
        }
        System.out.println(rtt);

        System.out.print("Nilai Terendah\t");
        for (int j = 0; j < banyakTes; j++) {
            System.out.print(ntr[j] + "\t");
        }
        System.out.println(rtr);
    }}
