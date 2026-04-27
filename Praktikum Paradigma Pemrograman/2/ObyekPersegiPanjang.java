class PersegiPanjang {
    double panjang;
    double lebar;

    public void setNilai(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double hitungLuas() {
        return panjang * lebar;
    }

    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }

    public void tampil() {
        System.out.println("Panjang   : " + panjang);
        System.out.println("Lebar     : " + lebar);
        System.out.println("Luas      : " + hitungLuas());
        System.out.println("Keliling  : " + hitungKeliling());
    }
}

public class ObyekPersegiPanjang {
    public static void main(String[] args) {
        PersegiPanjang pp = new PersegiPanjang();
        pp.setNilai(10, 5);
        pp.tampil();
    }
}
