import java.util.Scanner;
public class lapar



{
public static void main (String [] args)
{
Scanner in = new Scanner(System.in);
        final int MAKS = 2;

        System.out.print("Masukkan jumlah data angka(maks 2): ");
        int N = in.nextInt();

int angka[] = new int[N];

for(int i=0;i<N;i++){
	angka[i] = in.nextInt();
	System.out.println(angka[i]);
	}
	for(int i=0;i<4;i++){
		angka[i] = in.nextInt();
	}


}}