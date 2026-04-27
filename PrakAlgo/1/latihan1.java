import  java.util.Scanner;

public  class  latihan1  {
public static void main(String args[]) {
Scanner input = new Scanner(System.in);
String beli;
float uang ,diskon, akhir;
System.out.print("Beli produk elektronik, pakaian ,makanan = ");
beli=input.next();
System.out.print("uang yang anda habiskan = ");
uang=input.nextFloat();

if(beli.equals("elektronik")){
	diskon=uang * 0.1f;
	akhir=uang -diskon;
	System.out.println("Diskon 10%, total belanjaan anda jadi = "+akhir);
}

else if(beli.equals("pakaian")){
	if(uang > 50000){
		diskon=uang * 0.20f;
		akhir=uang -diskon;
	    System.out.println("Diskon sebesar 20%, total belanjaan anda jadi = "+akhir);
	}
	else{
		diskon=uang * 0.15f;
		akhir =uang -diskon;
	    System.out.println("Diskon sebesar 15%, total belanjaan anda jadi = "+akhir);
	}
}

else if(beli.equals("makanan")){
	if(uang > 10000){
		diskon=uang * 0.05f;
		akhir=uang -diskon;
	    System.out.println("Diskon sebesar 5%, total belanjaan anda jadi = "+akhir);
	}
	else{
		akhir=uang;
	    System.out.println("Diskon, total belanjaan anda jadi = "+akhir);
	}
}


}}