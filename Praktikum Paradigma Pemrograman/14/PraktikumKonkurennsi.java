class TugasCetak implements Runnable {
    private String nama;
    public TugasCetak(String nama) {
        this.nama = nama;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            // Thread.currentThread().getName() mengambil nama sistem thread
            System.out.println("[" + nama + "] mencetak angka: " + i);
            try {
                // Memberi jeda 500ms agar perpindahan thread terlihat jelas
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                System.out.println(nama + " terinterupsi.");
            }        }
    }}
public class PraktikumKonkurennsi {
    public static void main(String[] args) {
        System.out.println("=== Memulai Program Multi-threading ===");
        // 1. Membuat objek Runnable
        TugasCetak tugasA = new TugasCetak("Thread A");
        TugasCetak tugasB = new TugasCetak("Thread B");
        // 2. Membuat objek Thread asli dari Java
        Thread t1 = new Thread(tugasA);
        Thread t2 = new Thread(tugasB);
        // 3. Menjalankan Thread
        t1.start(); 
        t2.start();
        try {
            // 4. Menunggu t1 dan t2 selesai sebelum lanjut ke baris bawahnya
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }    
        System.out.println("=== Semua Thread Selesai, Main Program Keluar ===");
    }}
