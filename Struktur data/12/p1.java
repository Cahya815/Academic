import java.util.LinkedList;
public class p1
{
LinkedList daftarMhs = new LinkedList();
p1()
{
if (daftarMhs.isEmpty()==true)
{ System.out.println("Linkedlist kosong");
}
else
{ System.out.println("Linkedlist isi");
}
}
public static void main(String args[])
{
new p1();
}
}