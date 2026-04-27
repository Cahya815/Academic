public class ContohMethod {
    // Method tanpa parameter dan tanpa return
    public void cetakPesan() {
        System.out.println("Halo, ini contoh method tanpa parameter dan tanpa return!");
    }

    // Method dengan parameter
    public void cetakNama(String nama) {
        System.out.println("Halo, " + nama + "!");
    }

    // Method dengan return
    public String getPesan() {
        return "Halo, ini contoh method dengan return!";
    }

    // Method dengan parameter dan return
    public int tambah(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        ContohMethod contoh = new ContohMethod();
        contoh.cetakPesan(); // Memanggil method tanpa parameter dan tanpa return
        contoh.cetakNama("UTDI"); // Memanggil method dengan parameter
 System.out.println(contoh.getPesan()); // Memanggil method dengan return
        int hasil = contoh.tambah(5, 3); // Memanggil method dengan parameter dan return
        System.out.println("Hasil tambah: " + hasil);
    }
}
