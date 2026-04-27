public class latihanPrak3{

    // Rekursif: cari minimum
    public static int recursiveMinimum(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        }
        int minRest = recursiveMinimum(arr, index + 1);
        return Math.min(arr[index], minRest);
    }

    // Iterasi: cari minimum
    public static int minimumIteratif(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] angka = {15, 3, 27, 9, 2, 18};

        System.out.println("Minimum Rekursif: " + recursiveMinimum(angka, 0));
        System.out.println("Minimum Iteratif: " + minimumIteratif(angka));
    }
}
