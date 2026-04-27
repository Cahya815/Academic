class Barang {
    String kode;
    String nama;
    int stok;

    Barang(String kode, String nama, int stok) {
        this.kode = kode;
        this.nama = nama;
        this.stok = stok;
    }

    public String toString() {
        return kode + " - " + nama + " - Stok: " + stok;
    }
}

public class Praktikum8 {
    // Insertion Sort berdasarkan stok
    static void insertionSort(Barang[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Barang key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].stok > key.stok) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    // Selection Sort berdasarkan stok
    static void selectionSort(Barang[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].stok < arr[minIdx].stok) {
                    minIdx = j;
                }
            }
            Barang temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

    static void tampil(Barang[] arr) {
        for (Barang b : arr) {
            System.out.println(b);
        }
    }

    public static void main(String[] args) {
        Barang[] data = {
            new Barang("B001", "Pensil", 50),
            new Barang("B002", "Buku", 20),
            new Barang("B003", "Penghapus", 35)
        };

        System.out.println("Data awal:");
        tampil(data);

        System.out.println("\nSetelah Insertion Sort:");
        insertionSort(data);
        tampil(data);

        System.out.println("\nSetelah Selection Sort:");
        selectionSort(data);
        tampil(data);
    }
}
