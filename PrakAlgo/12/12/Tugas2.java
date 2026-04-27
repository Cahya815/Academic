public class Tugas2 {

    public static boolean isPalindrome(char[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Lewati karakter bukan huruf/angka di kiri
            while (left < right && !Character.isLetterOrDigit(arr[left])) {
                left++;
            }
            // Lewati karakter bukan huruf/angka di kanan
            while (left < right && !Character.isLetterOrDigit(arr[right])) {
                right--;
            }

            if (Character.toLowerCase(arr[left]) != Character.toLowerCase(arr[right])) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String kalimat = "kasur ini rusak";

        char[] arr = kalimat.toCharArray();
        System.out.println("Apakah palindrome? " + isPalindrome(arr));
    }
}
