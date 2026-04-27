class belajarPointer2 {
    public static void main(String[] args) {
        tipePointer2 P = new tipePointer2();
        P.namaKota = "Yogyakarta";
        tipePointer2 Q = new tipePointer2();
        Q.namaKota = "Klaten";
        tipePointer2 R = new tipePointer2();
        R.namaKota = "Solo";
        tipePointer2 S = new tipePointer2();
        S.namaKota = "Sragen";
        tipePointer2 T = new tipePointer2();
        T.namaKota = "Ngawi";

        System.out.println("Elemen namaKota untuk pointer P,Q,R,S,T adalah :");
        System.out.println("");
        System.out.println("Nilai P.namaKota adalah = " + P.namaKota);
        System.out.println("Nilai Q.namaKota adalah = " + Q.namaKota);
        System.out.println("Nilai R.namaKota adalah = " + R.namaKota);
        System.out.println("Nilai S.namaKota adalah = " + S.namaKota);
        System.out.println("Nilai T.namaKota adalah = " + T.namaKota);

        P.kanan = Q;
        Q.kanan = R;
        R.kanan = S;
        S.kanan = T;
        T.kanan = null;
        
        System.out.println("Elemen namaKota untuk pointer P,Q,R,S,T adalah :"); 
System.out.println("------------------------------------------------"); 
System.out.println("Nilai P.namaKota adalah = " + P.namaKota); 
System.out.println("Nilai Q.namaKota adalah = " + P.kanan.namaKota); 
System.out.println("Nilai R.namaKota adalah = " + 
P.kanan.kanan.namaKota); 
System.out.println("Nilai S.namaKota adalah = " + 
P.kanan.kanan.kanan.namaKota); 
System.out.print("Nilai T.namaKota adalah= " + 
P.kanan.kanan.kanan.kanan.namaKota); 

        System.out.println("\n--- Traversing list ---");
        tipePointer2 BANTU;
        BANTU = P;
        while (BANTU != null) {
            System.out.println("Nilai BANTU.namaKota adalah = " + BANTU.namaKota);
            BANTU = BANTU.kanan;
        }
    }
}
