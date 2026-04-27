package universitas;

public class MainMahasiswa {
    public static void main(String[] args) {
        MahasiswaBeasiswa mhs = new MahasiswaBeasiswa();

        mhs.inputData("Irvan Maulana", "231511033");
        mhs.inputOrganisasi(2);
        mhs.inputIpk(3.75);

        System.out.println("=== Data Mahasiswa Beasiswa ===");
        mhs.tampilkanData();
        mhs.tampilkanOrganisasi();
        mhs.cekBeasiswa();
    }
}
