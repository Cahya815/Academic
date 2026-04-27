import java.util.Scanner;

public class Soal2 {

static String nama, jurusan;
static double ipk;
static int jmlOrganisasi;

public static void biodata() {
Scanner input = new Scanner(System.in);
System.out.print("Nama = ");
nama = input.nextLine();
System.out.print("Jurusan = ");
jurusan = input.nextLine();
System.out.print("ipk = ");
ipk = input.nextDouble();
System.out.print("jumlah organisasi = ");
jmlOrganisasi = input.nextInt();
}
public static void organisasi() {
if (ipk >= 3.5 && jmlOrganisasi >= 2) {
System.out.println("Anda Dapat Beasiswa");
} else {
System.out.println("Anda Tidak Dapat Beasiswa");
}
}
public static void main(String[] args) {
biodata();
organisasi();
}}
