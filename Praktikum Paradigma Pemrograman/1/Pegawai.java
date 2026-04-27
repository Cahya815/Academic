class Pegawai {
String nama;
String posisi;
int gaji;

public void setPegawai(String nama, String posisi, int gaji) {
this.nama = nama;
this.posisi = posisi;
this.gaji = gaji;
    }

public void tampil() {
System.out.println("Nama Pegawai : " + nama);
System.out.println("posisi      : " + posisi);
System.out.println("Gaji         : " + gaji);
    }
}
