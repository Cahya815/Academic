import java.util.Scanner;

class Komputer {
    private String merek;
    private String tipe;
    private int ram;
    private int ssd;
    private String processor;

    // Konstruktor
    public Komputer(String merek, String tipe, int ram, int ssd, String processor) {
        this.merek = merek;
        this.tipe = tipe;
        this.ram = ram;
        this.ssd = ssd;
        this.processor = processor;
    }

    // Method untuk menampilkan informasi komputer
    public void tampilkanInfo() {
        System.out.println("Merek      : " + merek);
        System.out.println("Tipe       : " + tipe);
        System.out.println("RAM        : " + ram + " GB");
        System.out.println("SSD        : " + ssd + " GB");
        System.out.println("Processor  : " + processor);
    }

    // Getter dan Setter
    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getSsd() {
        return ssd;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }
}

public class Data_Komputer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input data komputer
        System.out.print("Masukkan merek komputer: ");
        String merek = scanner.nextLine();

        System.out.print("Masukkan tipe komputer: ");
        String tipe = scanner.nextLine();

        System.out.print("Masukkan kapasitas RAM (GB): ");
        int ram = scanner.nextInt();

        System.out.print("Masukkan kapasitas SSD (GB): ");
        int ssd = scanner.nextInt();
        scanner.nextLine(); // untuk konsumsi newline

        System.out.print("Masukkan jenis processor: ");
        String processor = scanner.nextLine();

        // Membuat objek komputer
        Komputer komputer = new Komputer(merek, tipe, ram, ssd, processor);

        // Menampilkan informasi komputer
        System.out.println("\nInformasi Komputer:");
        komputer.tampilkanInfo();
    }
}
