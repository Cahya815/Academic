public class Latihan1 {

    // Rekursif: print array elemen per elemen
    public static void printArrayRekursif(int[] arr, int index) {
        if (index < arr.length) {
            System.out.print(arr[index] + " ");
            printArrayRekursif(arr, index + 1);
        }
    }

    // Iterasi: print array
    public static void printArrayIteratif(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] angka = {10, 20, 30, 40, 50};

        System.out.print("Rekursif: ");
        printArrayRekursif(angka, 0);
        System.out.println();

        System.out.print("Iteratif: ");
        printArrayIteratif(angka);
        System.out.println();
    }
}
