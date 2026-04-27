public class Pegawai
{
String NamaPegawai;
int IdPegawai;
String PosisiPegawai;
Pegawai (String nama,int Id, String posisi) // konstruktor
{
NamaPegawai = nama;
IdPegawai = Id;
PosisiPegawai = posisi;
}
Pegawai () //konstruktor
{
NamaPegawai = "Azkiya";
IdPegawai = 2514;
PosisiPegawai = "Staf pengajar";
}
void Show()
{
System.out.println("Informasi Pegawai");
System.out.println("Nama : "+NamaPegawai);
System.out.println("Id : "+IdPegawai);
System.out.println("Posisi : "+PosisiPegawai);
}
public static void main(String args[])
{
Pegawai pegawai1 = new Pegawai();
Pegawai pegawai2 = new Pegawai("Zahwa",3313,"Staf Akademik");
pegawai1.Show();
pegawai2.Show();
}
}