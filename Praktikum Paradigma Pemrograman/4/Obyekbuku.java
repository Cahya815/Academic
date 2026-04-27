// Class Buku dengan Konstruktor
class Buku {
    String judul;
    int harga;
    int halaman;

    public Buku(String judul, int harga, int halaman) {
        this.judul = judul;
        this.harga = harga;
        this.halaman = halaman;
    }

    public void tampil() {
        System.out.println("Judul buku   : " + judul);
        System.out.println("Harga buku   : " + harga);
        System.out.println("Jumlah halaman : " + halaman);
        System.out.println();
    }
}

// Class ObyekBuku (Main)
public class Obyekbuku {
    public static void main(String[] args) {
        Buku buku1 = new Buku("PBO", 75000, 200);
        Buku buku2 = new Buku("10 Dosa Besar Sahroni", 60000, 150);
        Buku buku3 = new Buku("Budidaya Lele di Rumah", 80000, 300);

        buku1.tampil();
        buku2.tampil();
        buku3.tampil();
    }
}
