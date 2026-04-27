import java.util.Scanner;
class tipePointer3
{ String namaKota;
tipePointer3 kiri;
tipePointer3 kanan;
}
class belajarPointer3
{ public static void main(String[] args)
{
tipePointer3 P;
P = new tipePointer3();
P.namaKota = "Yogyakarta";
tipePointer3 Q;
Q = new tipePointer3();
Q.namaKota = "Klaten";
tipePointer3 R;
R = new tipePointer3();
R.namaKota = "Solo";
tipePointer3 S;
S = new tipePointer3();
S.namaKota = "Sragen";
tipePointer3 T;
T = new tipePointer3();
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
P.kiri = null;
Q.kiri = P;
R.kiri = R;
S.kiri = R;
T.kiri = S;

System.out.println("Elemen namaKota untuk pointer P adalah :");
System.out.println(" ");
System.out.println(P.namaKota);
System.out.println(P.kanan.kiri.namaKota);
System.out.println(P.kanan.kanan.kiri.kiri.namaKota);

tipePointer3 BANTU;
BANTU = T;
while (BANTU!=null)
{ System.out.println("Nilai BANTU.namaKota adalah = " + BANTU.namaKota);
BANTU = BANTU.kiri;
}
}
}