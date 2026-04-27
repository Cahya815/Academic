public class Latihan2 {
    private String nim, nama;

    // Mutator
    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Accessor
    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    // Tambahan: method tampilkanData
    public void tampilkanData() {
        System.out.println("== Data Latihan2 ==");
        System.out.println("NIM  : " + getNim());
        System.out.println("Nama : " + getNama());
    }

    public static void main(String[] args) {
        Latihan2 obj = new Latihan2();
        obj.setNim("175410001");
        obj.setNama("Azkiya");
        obj.tampilkanData();
    }
}
