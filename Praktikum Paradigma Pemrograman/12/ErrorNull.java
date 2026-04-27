public class ErrorNull {
    public static void main(String[] args) {
        String nama = "Budi"; // Berikan nilai string nyata, bukan null
        
        if (nama != null) {
            System.out.println(nama.length());
        } else {
            System.out.println("Data nama kosong.");
        }
    }
}