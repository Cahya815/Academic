// File: Ciri.java
public class Ciri extends Jenis { 
    private String makanan;
    private String caraBergerak;

    // Constructor
    public Ciri(String nama, String habitat, String jenis, String makanan, String caraBergerak) { // [cite: 33]
        super(nama, habitat, jenis);
        this.makanan = makanan;
        this.caraBergerak = caraBergerak;
    }

    @Override
    public void tampilInfo() {
        super.tampilInfo(); 
        System.out.println("Makanan   : " + makanan);
        System.out.println("Bergerak  : " + caraBergerak);
    }
}