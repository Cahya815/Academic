import java.util.LinkedList;

public class p9 {

    LinkedList daftarMhs = new LinkedList();

    p9() {
        // Data Mahasiswa (Tipe String)
        daftarMhs.add("Agungbp");
        daftarMhs.add("Bambang");
        daftarMhs.add("Cucuk");
        daftarMhs.add("Dion");
        daftarMhs.add("Ending");
        daftarMhs.add("Fifin");
        daftarMhs.add("Gesit");
        daftarMhs.add("Heru");
        daftarMhs.add("Irma");
        daftarMhs.add("Janti");

 
        daftarMhs.add(new Integer(10));     
        daftarMhs.add(new Float(15.5f));     
        daftarMhs.add(new Long(1000000L));   
       
        System.out.println("N = " + daftarMhs.size());


        for (int i = 0; i <= daftarMhs.size() - 1; i++) {
            System.out.println(i + " " + daftarMhs.get(i));
        }

        System.out.println("");

        daftarMhs.clear();
        System.out.println("Clear selesai dijalankan... ");

        System.out.println("N = " + daftarMhs.size());

        for (int i = 0; i <= daftarMhs.size() - 1; i++) {
            System.out.println(i + " " + daftarMhs.get(i));
        }

        System.out.println("");

        if (daftarMhs.isEmpty() == true) {
            System.out.println("Linkedlist kosong");
        } else {
            System.out.println("Linkedlist isi");
        }
    }

    public static void main(String args[]) {

        new p9();
    }
}