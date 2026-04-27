import java.util.*;

class formatBiodata {
    String nama;
    String alamat;
    int umur;
    char jekel;
    String hobi[] = new String[3];
    float ipk;
}

class pertemuan4 {
    public static int N = 10;

    // --- Fungsi untuk mengisi data secara statis ---
    public static void isiData(formatBiodata[] biodataMahasiswa) {
        String[] nama = {
            "Andi", "Budi", "Citra", "Dewi", "Eko",
            "Fani", "Gilang", "Hana", "Indra", "Joko"
        };
        String[] alamat = {
            "Jakarta", "Bandung", "Surabaya", "Malang", "Semarang",
            "Yogyakarta", "Medan", "Padang", "Denpasar", "Bogor"
        };
        int[] umur = {20, 21, 19, 22, 20, 21, 23, 20, 19, 22};
        char[] jekel = {'L','L','P','P','L','P','L','P','L','L'};
        float[] ipk = {3.5f, 3.2f, 3.7f, 3.8f, 3.1f, 3.6f, 3.9f, 3.4f, 3.3f, 3.0f};

        String[][] hobi = {
            {"Membaca", "Olahraga", "Musik"},
            {"Game", "Sepakbola", "Makan"},
            {"Menulis", "Traveling", "Film"},
            {"Memasak", "Menyanyi", "Belanja"},
            {"Basket", "Renang", "Musik"},
            {"Film", "Traveling", "Membaca"},
            {"Coding", "Game", "Ngopi"},
            {"Tidur", "Belanja", "Musik"},
            {"Fotografi", "Game", "Desain"},
            {"Ngoding", "Olahraga", "Tidur"}
        };

        for (int i = 0; i < N; i++) {
            biodataMahasiswa[i] = new formatBiodata();
            biodataMahasiswa[i].nama = nama[i];
            biodataMahasiswa[i].alamat = alamat[i];
            biodataMahasiswa[i].umur = umur[i];
            biodataMahasiswa[i].jekel = jekel[i];
            biodataMahasiswa[i].ipk = ipk[i];
            for (int j = 0; j < 3; j++) {
                biodataMahasiswa[i].hobi[j] = hobi[i][j];
            }
        }
    }


    public static void tampilkanData(formatBiodata[] biodataMahasiswa) {
        System.out.println("===========================================================================");
        System.out.println("NAMA\tALAMAT\t\tUMUR\tJEKEL\tHOBI1\t\tHOBI2\t\tHOBI3\t\tIPK");
        System.out.println("===========================================================================");
        for (int i = 0; i < N; i++) {
            System.out.print(biodataMahasiswa[i].nama + "\t");
            System.out.print(biodataMahasiswa[i].alamat + "\t\t");
            System.out.print(biodataMahasiswa[i].umur + "\t");
            System.out.print(biodataMahasiswa[i].jekel + "\t");
            System.out.print(biodataMahasiswa[i].hobi[0] + "\t\t");
            System.out.print(biodataMahasiswa[i].hobi[1] + "\t\t");
            System.out.print(biodataMahasiswa[i].hobi[2] + "\t\t");
            System.out.println(biodataMahasiswa[i].ipk);
        }
        System.out.println("===========================================================================");
    }

    // --- Program utama ---
    public static void main(String[] args) {
        formatBiodata[] biodataMahasiswa = new formatBiodata[N];
        isiData(biodataMahasiswa);
        tampilkanData(biodataMahasiswa);
    }
}
