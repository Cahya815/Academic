package universitas;

public class MahasiswaBeasiswa extends MahasiswaAktif {
    private double ipk;

    public void inputIpk(double ipk) {
        this.ipk = ipk;
    }

    public void cekBeasiswa() {
        if (ipk >= 3.5 && jumlahOrganisasi >= 1) {
            System.out.println("Status: Berhak mendapat beasiswa 🎓");
        } else {
            System.out.println("Status: Tidak berhak mendapat beasiswa");
        }
    }
}
