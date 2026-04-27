class Tugas1 {
    private int angka;
    private int pangkat;

    public void setAngka(int angka) {
        this.angka = angka;
    }

    public void setTugas1(int pangkat) {
        this.pangkat = pangkat;
    }

    public int hitungTugas1() {
        int hasil = 1;
        for (int i = 1; i <= pangkat; i++) {
            hasil *= angka;
        }
        return hasil;
    }

    public void tampilkanHasil() {
        System.out.println(angka + " pangkat " + pangkat + " = " + hitungTugas1());
    }

    public static void main(String[] args) {
        Tugas1 p = new Tugas1();
        p.setAngka(3);
        p.setTugas1(4);
        p.tampilkanHasil();  // Output: 3 pangkat 4 = 81
    }
}
