import java.util.Scanner;

public class ContohMethod2 {
    // Method tanpa parameter dan tanpa return
    public void cetakPesan() {
        System.out.println("Halo, ini contoh method tanpa parameter dan tanpa return!");
    }

    // Method dengan parameter
    public void cetakNama(String nama) {
        System.out.println("Halo, " + nama + "!");
    }

    // Method dengan return
    public String getPesan() {
        return "Halo, ini contoh method dengan return!";
    }

    // Method dengan parameter dan return
    public int tambah(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        ContohMethod contoh = new ContohMethod();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih menu:");
        System.out.println("1. Cetak pesan");
        System.out.println("2. Cetak nama");
        System.out.println("3. Get pesan");
        System.out.println("4. Tambah dua bilangan");
        System.out.print("Masukkan pilihan: ");
        int pilihan = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        switch (pilihan) {
         case 1:
            contoh.cetakPesan();
                break;
         case 2:
                System.out.print("Masukkan nama: ");w
                String nama = scanner.nextLine();
                contoh.cetakNama(nama);
                break;
         case 3:
                System.out.println(contoh.getPesan());
                break;
         case 4:
            System.out.print("Masukkan bilangan pertama: ");
                int a = scanner.nextInt();
             System.out.print("Masukkan bilangan kedua: ");
                int b = scanner.nextInt();
                int hasil = contoh.tambah(a, b);
              System.out.println("Hasil tambah: " + hasil);
                break;
            default:
                System.out.println("Pilihan tidak valid");
        }
        scanner.close();
    }
}
