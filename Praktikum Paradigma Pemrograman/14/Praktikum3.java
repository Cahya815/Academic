import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Praktikum3 {
    public static void main(String[] args) {
        // Membuat pool dengan 3 pekerja (thread)
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 10; i++) {
            int idTugas = i;
            executor.execute(() -> {
                System.out.println("Tugas " + idTugas + " dikerjakan oleh " + Thread.currentThread().getName());
                try { Thread.sleep(1000); } catch (Exception e) {}
            });
        }
        executor.shutdown(); // Berhenti menerima tugas baru
        }}
