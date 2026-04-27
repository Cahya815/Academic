import java.util.Scanner;

public class Array2 {
public static void main(String[] args) {

Scanner input = new Scanner(System.in);
System.out.print("Masukkan Jumlah Kucing : ");
int Jml = input.nextInt();
input.nextLine();

String cats[][]= new String [Jml] [3];
for (int i=0 ; i<Jml ; i++) {
System.out.print("Masukkan Nama Kucing : ");
cats [i][0] = input.nextLine();

System.out.print("Masukkan Warna Kucing : ");
cats[i][1] = input.nextLine ();
}
System.out.println("Nama Kucing\tWarna");
System.out.println("\nNama Kucing\tWarna");
        for (int i = 0; i < cats.length; i++) {
            System.out.println(cats[i][0] + "\t\t" + cats[i][1]);
}
System.out.println(" ");
}}
