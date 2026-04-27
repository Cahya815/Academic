class Mahasiswa {
    String nama;
    String nim;
    String jurusan;
    double ipk;
    int angkatan;

    public void setData(String nama, String nim, String jurusan, double ipk, int angkatan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.ipk = ipk;
        this.angkatan = angkatan;
    }

    public void tampil() {
        System.out.println("Nama      : " + nama);
        System.out.println("NIM       : " + nim);
        System.out.println("Jurusan   : " + jurusan);
        System.out.println("IPK       : " + ipk);
        System.out.println("Angkatan  : " + angkatan);
    }
}

public class ObyekMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.setData("Irvan Azzam", "231234567", "Teknik Informatika", 3.85, 2023);
        mhs1.tampil();
    }
}
