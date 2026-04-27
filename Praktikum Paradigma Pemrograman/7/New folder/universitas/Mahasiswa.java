package universitas;

public class Mahasiswa {
    protected String nama;
    protected String nim;

    public void inputData(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public void tampilkanData() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM : " + nim);
    }
}
