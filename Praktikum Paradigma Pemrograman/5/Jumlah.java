import java.util.Scanner;
public class Jumlah
{
public static void main(String args[])
{
Scanner masuk = new Scanner(System.in);
int gajiPokok,tunjangan, jumlahGaji;
String nama;
System.out.print("Nama : ");
nama = masuk.nextLine();
System.out.print("Gaji pokok : ");
gajiPokok = masuk.nextInt();
System.out.print("tunjangna : ");
tunjangan = masuk.nextInt();
jumlahGaji = gajiPokok + tunjangan;
System.out.println("nama = "+nama);
System.out.println("Jumlah gaji = " + jumlahGaji);
}
}