public class Lataihan2{

    // Rekursif: reverse char array print
    public static void stringReverseRekursif(char[] arr, int index) {
        if (index >= 0) {
            System.out.print(arr[index]);
            stringReverseRekursif(arr, index - 1);
        }
    }

    // Iterasi: reverse string print
    public static void stringReverseIteratif(String str) {
        char[] arr = str.toCharArray();
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
        String kata = "Praktikum";

        System.out.print("Rekursif: ");
        stringReverseRekursif(kata.toCharArray(), kata.length() - 1);
        System.out.println();

        System.out.print("Iteratif: ");
        stringReverseIteratif(kata);
        System.out.println();
    }
}
