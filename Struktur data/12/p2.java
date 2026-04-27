import java.util.ArrayList;

public class p2
{
    ArrayList<String> daftarMhs = new ArrayList<>();
    p2()
    {
        if (daftarMhs.isEmpty()) { 
            System.out.println("ArrayList kosong");
        }
        else
        { 
            System.out.println("ArrayList isi");
        }

        daftarMhs.add("Agungbp");
        daftarMhs.add("Bambang");
        if (daftarMhs.isEmpty()) { 
            System.out.println("ArrayList kosong");
        }   
        else { 
            System.out.println("ArrayList isi");
        }
    }

    public static void main(String args[])
    {
        new p2();
    }
}

