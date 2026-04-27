import java.util.Scanner;

public class NilaiMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama, nim, jurusan;
        int jumlahMatkul;

        System.out.println("==================================");
        System.out.println("  Menghitung Nilai Mahasiswa");
        System.out.println("==================================");

        System.out.print("  Masukan Jumlah Mata Kuliah: ");
        jumlahMatkul = input.nextInt();
        input.nextLine(); // Membersihkan newline

        System.out.println("==================================");
        System.out.print("Nama     : ");
        nama = input.nextLine();
        System.out.print("NIM      : ");
        nim = input.nextLine();
        System.out.print("Jurusan  : ");
        jurusan = input.nextLine();
        System.out.println("==================================");

        String[] namaMatkul = new String[jumlahMatkul];
        double[] nilaiUTS = new double[jumlahMatkul];
        double[] nilaiUAS = new double[jumlahMatkul];
        double[] nilaiAkhir = new double[jumlahMatkul];
        char[] grade = new char[jumlahMatkul];

        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.println("");
            System.out.println("Mata kuliah ke-" + (i + 1) + " : ");
            System.out.print("Nama Mata Kuliah : ");
            namaMatkul[i] = input.nextLine();
            System.out.print("Nilai UTS : ");
            nilaiUTS[i] = input.nextDouble();
            System.out.print("Nilai UAS : ");
            nilaiUAS[i] = input.nextDouble();
            input.nextLine(); // Membersihkan newline

            nilaiAkhir[i] = (nilaiUTS[i] + nilaiUAS[i]) / 2;

            if (nilaiAkhir[i] >= 80) {
                grade[i] = 'A';
            } else {
                grade[i] = 'B';
            }
        }

        System.out.println("==================================");
        System.out.println("Nama : " + nama + "        NIM : " + nim);
        System.out.println("==================================");
        System.out.println("Mata Kuliah           Nilai           Grade");
        System.out.println("==================================");

        for (int i = 0; i < jumlahMatkul; i++) {
            System.out.printf("%-20s %.1f             %c\n", namaMatkul[i], nilaiAkhir[i], grade[i]);
        }

        System.out.println("");
    }
}