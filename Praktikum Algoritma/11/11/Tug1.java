public class Tug1 {

    public static boolean testPalindrome(String s) {
        // Normalisasi string: hilangkan non-huruf dan ubah ke lowercase
        s = s.replaceAll("[^a-zA-Z]", "").toLowerCase();

        return isPalindrome(s, 0, s.length() - 1);
    }

    // Method rekursif untuk mengecek palindrome
    public static boolean isPalindrome(String s, int left, int right) {
        if (left >= right)
            return true;  // Basis: satu huruf atau sudah menyilang, berarti palindrome
        if (s.charAt(left) != s.charAt(right))
            return false; // Jika huruf tidak sama, bukan palindrome
        return isPalindrome(s, left + 1, right - 1); // Rekursi
    }

    public static void main(String[] args) {
        String kalimat1 = "kasur rusak";
        String kalimat2 = "watashi";
        String kalimat3 = "vt,  tv, ";

        System.out.println("\"" + kalimat1 + "\" palindrome? " + testPalindrome(kalimat1)); // true
        System.out.println("\"" + kalimat2 + "\" palindrome? " + testPalindrome(kalimat2)); // false
        System.out.println("\"" + kalimat3 + "\" palindrome? " + testPalindrome(kalimat3)); // true
    }
}
