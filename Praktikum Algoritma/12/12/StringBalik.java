public class LatihanPrak3 {

    // === Latihan 1 ===
    // a. Menampilkan semua elemen array (rekursif)
    public static void printArrayRekursif(int[] arr, int index) {
        if (index < arr.length) {
            System.out.print(arr[index] + " ");
            printArrayRekursif(arr, index + 1);
        }
    }

    // b. Menampilkan semua elemen array (iteratif)
    public static void printArrayIteratif(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // === Latihan 2 ===
    // a. Membalik string dengan rekursif
    public static void stringReverseRekursif(char[] arr, int index) {
        if (index >= 0) {
            System.out.print(arr[index]);
            stringReverseRekursif(arr, index - 1);
        }
    }

    // b. Membalik string dengan iterasi
    public static void stringReverseIteratif(String str) {
        char[] arr = str.toCharArray();
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }

    // === Latihan 3 ===
    // a. Menentukan elemen terkecil dengan rekursif
    public static int recursiveMinimum(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        }
        int minRest = recursiveMinimum(arr, index + 1);
        return Math.min(arr[index], minRest);
    }

    // b. Menentukan elemen terkecil dengan iterasi
    public static int minimumIteratif(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    // === Main Program untuk menjalankan semua ===
    public static void main(String[] args) {
        int[] angka = {9, 4, 7, 2, 6};
        String kalimat = "Algoritma";

        System.out.println("== LATIHAN 1: Tampilkan Array ==");
        System.out.print("Rekursif: ");
        printArrayRekursif(angka, 0);
        System.out.print("\nIteratif: ");
        printArrayIteratif(angka);
        System.out.println("\n");

        System.out.println("== LATIHAN 2: Balik String ==");
        System.out.print("Rekursif: ");
        stringReverseRekursif(kalimat.toCharArray(), kalimat.length() - 1);
        System.out.print("\nIteratif: ");
        stringReverseIteratif(kalimat);
        System.out.println("\n");

        System.out.println("== LATIHAN 3: Elemen Minimum ==");
        System.out.println("Rekursif: " + recursiveMinimum(angka, 0));
        System.out.println("Iteratif: " + minimumIteratif(angka));
    }
}
