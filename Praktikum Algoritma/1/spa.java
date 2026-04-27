import java.util.Scanner;

public class spa {
public static void main (String args[]){
Scanner input = new Scanner (System.in);
int gel;
String jur;

System.out.print("masukkan gelombang (1/2) : ");
gel=input.nextInt();
System.out.print("masukkan Jurusan (TK, BD, MR, IF, SI ) : ");
jur=input.next();

if ( gel == 1 ) {
if (jur.equals("TK") || jur.equals("BD")) {
System.out.println("SPA gel "+gel+" : Rp. 8.000.000 ");
	}
}

}}
