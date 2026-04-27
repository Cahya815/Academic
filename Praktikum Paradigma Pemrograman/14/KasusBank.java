class RekeningBank {
    private int saldo = 1000000;

    // Method disinkronisasi agar hanya 1 orang yang bisa akses di satu waktu
    public synchronized void tarikUang(String nama, int jumlah) {
        System.out.println(nama + " mencoba menarik: Rp " + jumlah);
        
        if (saldo >= jumlah) {
            System.out.println(nama + " berhasil melakukan pengecekan saldo.");
            try {
                // Simulasi proses bank yang membutuhkan waktu
                Thread.sleep(100); 
            } catch (InterruptedException e) {}
            
            saldo -= jumlah;
            System.out.println(nama + " transaksi SUKSES. Sisa saldo: Rp " + saldo);
        } else {
            System.out.println(nama + " transaksi GAGAL. Saldo tidak cukup! Sisa: Rp " + saldo);
        }
        System.out.println("--------------------------------------");
    }
}

public class KasusBank {
    public static void main(String[] args) {
        RekeningBank akunBersama = new RekeningBank();

        // Membuat dua thread (Suami dan Istri) yang mengakses objek yang sama
        Thread suami = new Thread(() -> akunBersama.tarikUang("Suami", 700000));
        Thread istri = new Thread(() -> akunBersama.tarikUang("Istri", 700000));

        suami.start();
        istri.start();
    }
}