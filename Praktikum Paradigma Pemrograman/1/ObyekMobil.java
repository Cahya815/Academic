public class ObyekMobil {
public static void main(String[] args) {

Mobil mobil1 = new Mobil();
mobil1.setMobil("AB 3313 SY", "Biru", "Mitsubishi", 50);
System.out.println("Mobil A");
mobil1.tampil();
mobil1.akselerasi(20);
mobil1.belok("kiri");
mobil1.rem();

System.out.println();


Mobil mobil2 = new Mobil();
mobil2.setMobil("AB 1234 AT", "Merah", "Toyota", 100);
System.out.println("Mobil B ");
mobil2.tampil();
mobil2.akselerasi(30);
mobil2.belok("kanan");
mobil2.rem();
    }
}
