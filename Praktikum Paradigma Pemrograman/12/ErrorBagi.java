public class ErrorBagi {
    public static void main(String[] args) {
        int a = 10;
        int b = 0; // Ubah nilai ini atau gunakan pengecekan
        
        if (b != 0) {
            int hasil = a / b;
            System.out.println(hasil);
        } else {
            System.out.println("Kesalahan: Tidak dapat membagi dengan nol!");
        }
    }
}