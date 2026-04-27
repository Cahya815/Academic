import java.util.Scanner;

public class LaluLintas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan warna lampu (Hijau, Kuning, Merah): ");
        String warnaLampu = input.nextLine();

        System.out.print("Apakah ada pejalan kaki (ya/tidak): ");
        String pejalanKaki = input.nextLine();

        String tindakan = tentukanTindakan(warnaLampu, pejalanKaki);

        System.out.println("Tindakan: " + tindakan);

        input.close();
    }

    public static String tentukanTindakan(String warnaLampu, String pejalanKaki) {
        warnaLampu = warnaLampu.toLowerCase();
        pejalanKaki = pejalanKaki.toLowerCase();

        if (warnaLampu.equals("hijau")) {
            if (pejalanKaki.equals("ya")) {
                return "Pelan-pelan";
            } else {
                return "Berkendara";
            }
        } else if (warnaLampu.equals("kuning")) {
            return "Bersiap untuk berhenti";
        } else if (warnaLampu.equals("merah")) {
            return "Berhenti";
        } else {
            return "Warna lampu tidak valid";
        }
    }
}