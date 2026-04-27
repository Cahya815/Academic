import java.util.Scanner;

// Interface
interface Crud {
    void tambah();
    void tampil();
    void ubah();
    void hapus();
}

// Implementasi CRUD dengan array
class CrudArray implements Crud {

    String[] data = new String[10];
    int jumlah = 0;
    Scanner in = new Scanner(System.in);

    public void tambah() {
        if (jumlah >= data.length) {
            System.out.println("Array penuh!\n");
            return;
        }
        System.out.print("Masukkan data: ");
        data[jumlah] = in.nextLine();
        jumlah++;
        System.out.println("Ditambah.\n");
    }

    public void tampil() {
        if (jumlah == 0) {
            System.out.println("Data kosong.\n");
            return;
        }
        System.out.println("=== Data ===");
        for (int i = 0; i < jumlah; i++) {
            System.out.println((i+1) + ". " + data[i]);
        }
        System.out.println();
    }

    public void ubah() {
        tampil();
        if (jumlah == 0) return;

        System.out.print("Pilih nomor: ");
        int idx = in.nextInt();
        in.nextLine();

        System.out.print("Masukkan data baru: ");
        data[idx - 1] = in.nextLine();
        System.out.println("Diubah.\n");
    }

    public void hapus() {
        tampil();
        if (jumlah == 0) return;

        System.out.print("Pilih nomor: ");
        int idx = in.nextInt();
        in.nextLine();

        // Geser elemen ke kiri
        for (int i = idx - 1; i < jumlah - 1; i++) {
            data[i] = data[i + 1];
        }

        jumlah--;
        System.out.println("Dihapus.\n");
    }
}

// MAIN
public class Buku {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        CrudArray crud = new CrudArray();

        while (true) {
            System.out.println("1. Tambah");
            System.out.println("2. Tampil");
            System.out.println("3. Ubah");
            System.out.println("4. Hapus");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");

            int p = in.nextInt();
            in.nextLine();

            switch (p) {
                case 1: crud.tambah(); break;
                case 2: crud.tampil(); break;
                case 3: crud.ubah(); break;
                case 4: crud.hapus(); break;
                case 5: return;
                default: System.out.println("Pilihan salah!\n");
            }
        }
    }
}
