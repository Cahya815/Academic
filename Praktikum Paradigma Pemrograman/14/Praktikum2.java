class Counter {
    int count = 0;

    // Gunakan kata kunci 'synchronized' untuk memperbaiki
    public void  increment () {
        count++;
    }
}

public class Praktikum2 {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();

        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start(); t2.start();
        t1.join(); t2.join(); // Menunggu kedua thread selesai

        System.out.println("Hasil Akhir Counter: " + c.count);
    }
}
