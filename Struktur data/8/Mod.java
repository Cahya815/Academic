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

public class Mod {
    static Barang[] tambahData(Barang[] arr, Barang[] depan, Barang[] belakang) {
        Barang[] hasil = new Barang[arr.length + depan.length + belakang.length];
        int idx = 0;

        // Tambah data di depan
        for (Barang d : depan) {
            hasil[idx++] = d;
        }
        // Copy data lama
        for (Barang a : arr) {
            hasil[idx++] = a;
        }
        // Tambah data di belakang
        for (Barang b : belakang) {
            hasil[idx++] = b;
        }
        return hasil;
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

        Barang[] depan = {
            new Barang("B010", "Spidol", 60),
            new Barang("B011", "Crayon", 15)
        };

        Barang[] belakang = {
            new Barang("B020", "Bolpoin", 40),
            new Barang("B021", "Penggaris", 25)
        };

        Barang[] hasil = tambahData(data, depan, belakang);

        System.out.println("Data setelah ditambah:");
        tampil(hasil);
    }
}

