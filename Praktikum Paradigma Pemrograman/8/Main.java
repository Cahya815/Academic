// File: MainHewan.java
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Informasi Hewan Lengkap ===");
        
        Ciri singa = new Ciri(
            "Singa", 
            "Darat", 
            "Mamalia", 
            "Daging (Karnivora)", 
            "Berjalan/Berlari"
        );
        
    
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