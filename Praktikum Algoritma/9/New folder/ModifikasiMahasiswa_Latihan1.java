class ModifikasiMahasiswa_Latihan1 {
String nim;
String nama;
String prodi;
double ipk;

public void setMhs(String nim, String nama, String prodi, double ipk) {
this.nim = nim;
this.nama = nama;
this.prodi = prodi;
this.ipk = ipk;
}
public void tampil() {
System.out.println("NIM: " + nim);
System.out.println("Nama: " + nama);
System.out.println("Program Studi: " + prodi);
System.out.println("IPK: " + ipk);
}
public static void main(String[] args) {
ModifikasiMahasiswa_Latihan1 mhs = new ModifikasiMahasiswa_Latihan1();
mhs.setMhs("245410030", "Eggy", "Informatika", 3.80);
mhs.tampil();
}
}