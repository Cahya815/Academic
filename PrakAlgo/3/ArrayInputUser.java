import java.util.Scanner;
public class ArrayInputUser {
    public static void main(String[] args) {
        int bilangan[] = new int[4];
        int i,j;
        Scanner input = new Scanner(System.in);
        for (i=0;i<=3;i++) {
            System.out.print("Silahkan masukan bilangan : ");
            bilangan[i] = input.nextInt();
        }
        //untuk menampilkan array dan menentukan genap/ganjil
        for (j=0;j<=3;j++) {
            if(bilangan[j]%2 == 0 ) {
                System.out.println("Bilangan yang anda masukkan genap" +" "+ bilangan[j]);
            } else {
                System.out.println("Bilangan yang anda masukkan ganjil" +" "+ bilangan[j]);
            }
        }
    }
}