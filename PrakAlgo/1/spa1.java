import java.util.Scanner;
public class spa1{
public static void main (String arg[]){
Scanner in=new Scanner(System.in);
int gel;
String jen,jur;
System.out.print("masukkan gelombang (1/2) : ");
gel=in.nextInt();
System.out.print("masukkan Fakultas (FMB / TI) : ");
jen=in.next();
System.out.print("masukkan jurusan (TK, BD, MR, IF, SI ): ");
jur=in.next();
 if (gel == 1) {
            if (jen.equalsIgnoreCase("TI")) {
                if (jur.equalsIgnoreCase("IF")) {
                    System.out.println("SPA gel " + gel + " : Rp. 13.400.000 ");
                } else if (jur.equalsIgnoreCase("SI")) {
                    System.out.println("SPA gel " + gel + " : Rp. 12.400.000 ");
                }
            } else if (jen.equalsIgnoreCase("FMB")) {
                if (jur.equalsIgnoreCase("TK") || jur.equalsIgnoreCase("BD") || jur.equalsIgnoreCase("MR")) {
                    System.out.println("SPA gel " + gel + " : Rp. 8.000.000 ");
                }
            }
        } else if (gel == 2) {
            if (jen.equalsIgnoreCase("TI")) {
                if (jur.equalsIgnoreCase("IF")) {
                    System.out.println("SPA gel " + gel + " : Rp. 13.900.000 ");
                } else if (jur.equalsIgnoreCase("SI")) {
                    System.out.println("SPA gel " + gel + " : Rp. 12.900.000 ");
                }
            } else if (jen.equalsIgnoreCase("FMB")) {
                if (jur.equalsIgnoreCase("TK") || jur.equalsIgnoreCase("BD") || jur.equalsIgnoreCase("MR")) {
                    System.out.println("SPA gel " + gel + " : Rp. 8.500.000 ");
                }
            }
        } else {
            System.out.println("Salah masukkan gelombang");
        }}}