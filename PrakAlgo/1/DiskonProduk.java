import  java.util.Scanner;
public  class  DiskonProduk  {
public static void main(String args[]) {
Scanner in = new Scanner(System.in);
String beli;
float uang ,diskon, total;
System.out.print("Beli produk elektronik, pakaian ,makanan = ");
beli=in.next();
System.out.print("Total belanja anda = ");
uang=in.nextFloat();

if(beli.equals("elektronik")){
	diskon = uang * 0.1f;
	total = uang -diskon;
	System.out.println("Anda mendapatkan diskon sebesar 10% = "+total);
}

else if(beli.equals("pakaian")){
	if(uang > 50000){
		diskon=uang * 0.20f;
		total =uang -diskon;
	    System.out.println("Anda mendapatkan diskon sebesar 20% = "+total);
	}
	else{
		diskon=uang * 0.15f;
		total =uang -diskon;
	    System.out.println("Anda mendapatkan diskon sebesar 15% = "+total);
	}}

else if(beli.equals("makanan")){
	if(uang > 10000){
		diskon=uang * 0.05f;
		total =uang -diskon;
	    System.out.println("Anda mendapatkan diskon sebesar 5% = "+total);
	}
	}else{
		total =uang;
	    System.out.println("Anda tidak mendapatkan diskon = "+total);
	}}}