import java.util.Scanner;
class Buku {
    private String judul;
    private String penulis;
    private int tahunTerbit;
    // Konstruktor
    public Buku(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
    }
    // Method untuk menampilkan informasi buku
    public void tampilkanInfo() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Tahun Terbit: " + tahunTerbit);
    }
    // Getter dan Setter
    public String getJudul() {
        return judul;
    }
   public void setJudul(String judul) {
        this.judul 	= judul;
    }
    public String getPenulis() {
        return penulis;
    }
    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }
    public int getTahunTerbit() {
        return tahunTerbit;
    }
    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }}
public class Data_Buku {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan judul buku: ");
        String judul = scanner.nextLine();
        System.out.print("Masukkan penulis buku: ");
        String penulis = scanner.nextLine();
        System.out.print("Masukkan tahun terbit buku: ");
        int tahunTerbit = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        // Membuat objek buku
        Buku buku = new Buku(judul, penulis, tahunTerbit);

        // Menampilkan informasi buku
        System.out.println("\nInformasi Buku:");
        buku.tampilkanInfo();
    }}