class Buku {
    String judul;
    String pengarang;
    String penerbit;
    int harga;
    int halaman;

    public void setBuku(String judul, String pengarang, String penerbit, int harga, int halaman) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.harga = harga;
        this.halaman = halaman;
    }

    public void tampil() {
        System.out.println("Judul Buku    : " + judul);
        System.out.println("Pengarang     : " + pengarang);
        System.out.println("Penerbit      : " + penerbit);
        System.out.println("Harga Buku    : " + harga);
        System.out.println("Jumlah Halaman: " + halaman);
    }
}

public class ObyekBuku {
    public static void main(String[] args) {
        Buku buku1 = new Buku();
        buku1.setBuku("PBO", "Irvan Azzam", "TeknoPress", 75000, 200);
        buku1.tampil();
    }
}
