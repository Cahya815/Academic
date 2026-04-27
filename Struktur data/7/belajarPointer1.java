class tipePointer1 {
    String namaKota;
    tipePointer1 kanan;
}

class belajarPointer1 {
    public static void main(String[] args) {
        tipePointer1 P;
        P = new tipePointer1();
        P.namaKota = "Yogyakarta";

        tipePointer1 Q;
        Q = new tipePointer1();
        Q.namaKota = "Klaten";

        tipePointer1 R;
        R = new tipePointer1();
        R.namaKota = "Solo";

        tipePointer1 S;
        S = new tipePointer1();
        S.namaKota = "Sragen";

        tipePointer1 T;
        T = new tipePointer1();
        T.namaKota = "Ngawi";

        System.out.println("Nilai P,Q,R,S,T adalah :");
        System.out.println("------------------------------");
        System.out.println("Nilai P.namaKota adalah = " + P.namaKota);
        System.out.println("Nilai Q.namaKota adalah = " + Q.namaKota);
        System.out.println("Nilai R.namaKota adalah = " + R.namaKota);
        System.out.println("Nilai S.namaKota adalah = " + S.namaKota);
        System.out.println("Nilai T.namaKota adalah = " + T.namaKota);
        System.out.println("------------------------------");

        P.kanan = Q;
        Q.kanan = R;
        R.kanan = S;
        S.kanan = T;
        T.kanan = null;

        System.out.println("Nilai-nilai yang dapat diakses dari pointer P adalah :");
        System.out.println(" ");
        System.out.println(P.namaKota);
        System.out.println(P.kanan.namaKota);
        System.out.println(P.kanan.kanan.namaKota);
        System.out.println(P.kanan.kanan.kanan.namaKota);
        System.out.println(P.kanan.kanan.kanan.kanan.namaKota);
        System.out.println(R.namaKota);
P.kanan.kanan.namaKota = ("Surakarta");
System.out.println(R.namaKota);
    }
    
}
