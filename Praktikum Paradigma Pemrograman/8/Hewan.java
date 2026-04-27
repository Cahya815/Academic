// File: Hewan.java
public class Hewan {

    private String nama;
    private String habitat;

    
    public Hewan(String nama, String habitat) {
        this.nama = nama;
        this.habitat = habitat;
    }

    
    public void tampilInfo() {
        System.out.println("Nama Hewan: " + nama);
        System.out.println("Habitat   : " + habitat);
    }
}