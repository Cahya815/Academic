// File: MainHewan.java

// 1. Super Class: Hewan
class Hewan {
    // Properti
    private String nama;
    private String habitat;

    // Constructor
    public Hewan(String nama, String habitat) {
        this.nama = nama;
        this.habitat = habitat;
    }

    // Method untuk menampilkan informasi dasar
    public void tampilInfo() {
        System.out.println("Nama Hewan: " + nama);
        System.out.println("Habitat   : " + habitat);
    }
}

// 2. Kelas Turunan Pertama: Jenis (Extends Hewan)
class Jenis extends Hewan { 
    // Properti tambahan
    private String jenis;

    // Constructor
    public Jenis(String nama, String habitat, String jenis) {
        // Memanggil constructor dari kelas induk (Hewan) menggunakan super()
        super(nama, habitat); 
        this.jenis = jenis;
    }

    // Override method tampilInfo()
    @Override
    public void tampilInfo() {
        // Memanggil method tampilInfo() dari kelas induk (Hewan) menggunakan keyword super
        super.tampilInfo(); 
        System.out.println("Jenis     : " + jenis);
    }
}

// 3. Kelas Turunan Kedua: Ciri (Extends Jenis)
class Ciri extends Jenis { 
    // Properti tambahan
    private String makanan;
    private String caraBergerak;

    // Constructor
    public Ciri(String nama, String habitat, String jenis, String makanan, String caraBergerak) {
        // Memanggil constructor dari kelas induk (Jenis) menggunakan super()
        super(nama, habitat, jenis); 
        this.makanan = makanan;
        this.caraBergerak = caraBergerak;
    }

    // Override method tampilInfo()
    @Override
    public void tampilInfo() {
        // Memanggil method tampilInfo() dari kelas induk (Jenis) menggunakan keyword super
        super.tampilInfo(); 
        System.out.println("Makanan   : " + makanan);
        System.out.println("Bergerak  : " + caraBergerak);
    }
}

// 4. Kelas Utama (Main) untuk Pengujian
public class MainHewan {
    public static void main(String[] args) {
        System.out.println("=== Informasi Hewan Lengkap ===");
        
        // Membuat objek dari kelas Ciri
        Ciri singa = new Ciri(
            "Singa", 
            "Darat", 
            "Mamalia", 
            "Daging (Karnivora)", 
            "Berjalan/Berlari"
        );
        
        // Memanggil method tampilInfo()
        singa.tampilInfo();
        
        System.out.println("\n=== Informasi Hewan Lain ===");
        Ciri elang = new Ciri(
            "Elang", 
            "Udara/Pohon", 
            "Aves", 
            "Daging (Karnivora)", 
            "Terbang"
        );
        
        elang.tampilInfo();
    }
}