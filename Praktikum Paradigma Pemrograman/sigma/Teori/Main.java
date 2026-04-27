import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static int displayMenu(Scanner scanner) {
        System.out.println("\n===== MENU INPUT PEGAWAI =====");
        System.out.println("1. Input Dosen Tetap");
        System.out.println("2. Input Dosen Tidak Tetap");
        System.out.println("3. Input Staff Administrasi");
        System.out.println("4. Tampilkan Semua Data Gaji Pegawai");
        System.out.println("0. Keluar");
        System.out.print("Pilih Opsi (0-4): ");
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            scanner.next(); // Membersihkan input yang salah
            return -1; // Mengembalikan nilai invalid
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Menggunakan List bertipe Pegawai (Polimorfisme)
        List<Pegawai> daftarPegawai = new ArrayList<>();
        int pilihan = -1;

        while (pilihan != 0) {
            pilihan = displayMenu(scanner);
            scanner.nextLine(); // Membersihkan newline character setelah nextInt()

            try {
                switch (pilihan) {
                    case 1:
                        inputDosenTetap(scanner, daftarPegawai);
                        break;
                    case 2:
                        inputDosenTidakTetap(scanner, daftarPegawai);
                        break;
                    case 3:
                        inputStaff(scanner, daftarPegawai);
                        break;
                    case 4:
                        tampilkanSemuaGaji(daftarPegawai);
                        break;
                    case 0:
                        System.out.println("Program Selesai. Terima kasih!");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Kesalahan Input: Masukkan data yang sesuai (misal: angka untuk gaji).");
                scanner.nextLine(); // Membersihkan input yang salah
            }
        }
        scanner.close();
    }

    // --- Implementasi Fungsi Input Pegawai ---

    private static void inputDosenTetap(Scanner scanner, List<Pegawai> daftarPegawai) {
        System.out.println("\n--- INPUT DOSEN TETAP ---");
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan NIP: ");
        String nip = scanner.nextLine();
        System.out.print("Masukkan Gaji Pokok: ");
        double gajiPokok = scanner.nextDouble();
        System.out.print("Masukkan Tunjangan Tetap: ");
        double tunjangan = scanner.nextDouble();

        DosenTetap dt = new DosenTetap(nama, nip, gajiPokok, tunjangan);
        daftarPegawai.add(dt);
        System.out.println("\n✅ Dosen Tetap Berhasil Ditambahkan!");
    }

    private static void inputDosenTidakTetap(Scanner scanner, List<Pegawai> daftarPegawai) {
        System.out.println("\n--- INPUT DOSEN TIDAK TETAP ---");
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan NIP: ");
        String nip = scanner.nextLine();
        // Gaji Pokok diisi 0.0 karena tidak digunakan dalam perhitungan
        double gajiPokok = 0.0;
        System.out.print("Masukkan Jam Mengajar: ");
        int jam = scanner.nextInt();
        System.out.print("Masukkan Honor Per Jam: ");
        double honor = scanner.nextDouble();

        DosenTidakTetap dtt = new DosenTidakTetap(nama, nip, gajiPokok, jam, honor);
        daftarPegawai.add(dtt);
        System.out.println("\n✅ Dosen Tidak Tetap Berhasil Ditambahkan!");
    }

    private static void inputStaff(Scanner scanner, List<Pegawai> daftarPegawai) {
        System.out.println("\n--- INPUT STAFF ADMINISTRASI ---");
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan NIP: ");
        String nip = scanner.nextLine();
        System.out.print("Masukkan Gaji Pokok: ");
        double gajiPokok = scanner.nextDouble();
        System.out.print("Masukkan Bonus: ");
        double bonus = scanner.nextDouble();

        Staff staff = new Staff(nama, nip, gajiPokok, bonus);
        daftarPegawai.add(staff);
        System.out.println("\n✅ Staff Administrasi Berhasil Ditambahkan!");
    }

    // --- Implementasi Fungsi Tampilkan Data ---

    private static void tampilkanSemuaGaji(List<Pegawai> daftarPegawai) {
        if (daftarPegawai.isEmpty()) {
            System.out.println("\n❌ Belum ada data pegawai yang tersimpan.");
            return;
        }

        System.out.println("\n==============================================");
        System.out.println("      LAPORAN GAJI SEMUA PEGAWAI UTDI       ");
        System.out.println("==============================================");

        double totalGajiKeseluruhan = 0;

        // Iterasi dan memanfaatkan Polimorfisme:
        // Setiap objek dalam list (walaupun tipenya Pegawai) akan memanggil
        // hitungGaji() dari kelas aslinya (DosenTetap, DosenTidakTetap, atau Staff).
        for (Pegawai p : daftarPegawai) {
            String jenisPegawai = p.getClass().getSimpleName();
            double gaji = p.hitungGaji();
            totalGajiKeseluruhan += gaji;

            System.out.println("\n----------------------------------------------");
            System.out.println("Jenis Pegawai: " + jenisPegawai);
            p.tampilData(); // Memanggil tampilData() yang spesifik
            System.out.println("----------------------------------------------");
        }

        System.out.println("\n==============================================");
        System.out.printf("TOTAL GAJI KESELURUHAN: %.2f\n", totalGajiKeseluruhan);
        System.out.println("==============================================");
    }
}