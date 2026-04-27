class Buku {
    private String judul;
    private int harga;
    private int halaman;

    // Setter methods
    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setHalaman(int halaman) {
        this.halaman = halaman;
    }

    // Getter methods
    public String getJudul() {
        return judul;
    }

    public int getHarga() {
        return harga;
    }

    public int getHalaman() {
        return halaman;
    }

    // Combined setter for convenience
    public void setBuku(String judul, int harga, int halaman) {
        this.judul = judul;
        this.harga = harga;
        this.halaman = halaman;
    }

    public void tampil() {
        System.out.println("Judul buku : " + judul);
        System.out.println("Harga buku : " + "Rp " + harga);
        System.out.println("Jumlah halaman : " + halaman + " Halaman");
        System.out.println();
    }
}
