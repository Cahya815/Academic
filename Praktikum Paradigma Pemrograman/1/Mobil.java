class Mobil {
String noPlat;
String warna;
String manufaktur;
int kecepatan;


public void setMobil(String noPlat, String warna, String manufaktur, int kecepatan) {
this.noPlat = noPlat;
this.warna = warna;
this.manufaktur = manufaktur;
this.kecepatan = kecepatan;
    }


public void tampil() {
System.out.println("Nomor Plat   : " + noPlat);
System.out.println("Warna        : " + warna);
System.out.println("Manufaktur   : " + manufaktur);
System.out.println("Kecepatan    : " + kecepatan + " km/h");
    }


public void akselerasi(int tambah) {
kecepatan += tambah;
System.out.println("Mobil dipercepat, kecepatan sekarang: " + kecepatan + " km/h");
    }

public void belok(String arah) {
System.out.println("Mobil belok ke " + arah);
    }

public void rem() {
kecepatan = 0;
System.out.println("Mobil direm, kecepatan sekarang: " + kecepatan + " km/h");
    }
}
