public class Komputer {
    String merk;
    int ram;
    int storage;

    public Komputer(String merk, int ram, int storage) {
        this.merk = merk;
        this.ram = ram;
        this.storage = storage;
    }

    public void tampil() {
        System.out.println("Merk  : " + merk);
        System.out.println("RAM            : " + ram + " GB");
        System.out.println("Storage        : " + storage + " GB");
        System.out.println();
    }

    public static void main(String[] args) {
        Komputer Komputer1 = new Komputer("ASUS", 8, 512);
        Komputer Komputer2 = new Komputer("Lenovo", 16, 1024);
        Komputer Komputer3 = new Komputer("Acer", 4, 256);

        Komputer1.tampil();
        Komputer2.tampil();
        Komputer3.tampil();
    }
}
