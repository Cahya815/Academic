package universitas;

public class MahasiswaAktif extends Mahasiswa {
    protected int jumlahOrganisasi;

    public void inputOrganisasi(int jumlahOrganisasi) {
        this.jumlahOrganisasi = jumlahOrganisasi;
    }

    public void tampilkanOrganisasi() {
        System.out.println("Jumlah Organisasi: " + jumlahOrganisasi);
    }
}
