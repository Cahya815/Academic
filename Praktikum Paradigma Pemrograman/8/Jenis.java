// File: Jenis.java
public class Jenis extends Hewan { 
    private String jenis;

    // Constructor
    public Jenis(String nama, String habitat, String jenis) {
        super(nama, habitat);
        this.jenis = jenis;
    }

    
    @Override
    public void tampilInfo() {
        super.tampilInfo(); 
        System.out.println("Jenis     : " + jenis);
    }
}