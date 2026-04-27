import java.util.Scanner;
public class Array2Dimensi3 {
    public static void main(String[] args){
        int b=3; int d=3; // matriks 3 baris 3 kolom
        int[][] matrix1 = new int[b][d];
        int[][] matrix2 = new int[b][d];
        int[][] hasil = new int[b][d];

        System.out.println("Masukan Nilai Matrix 1:");
        for(int i=0;i<b;i++){
            for(int j=0;j<d;j++){
                matrix1[i][j]=input();
            }}
        System.out.println("Masukan Nilai Matrix 2:");
        for(int i=0;i<b;i++){
            for(int j=0;j<d;j++){
                matrix2[i][j]=input();
            }}
            for(int j=0;j<d;j++){
                hasil[i][j] = 0;
                for(int k=0;k<d;k++){
                    hasil[i][j] += matrix1[i][k] * matrix2[k][j];
		}}}
        for(int i=0;i<b;i++){
            for(int j=0;j<d;j++){
                System.out.print(hasil[i][j]+" ");
            }
            System.out.println();
        }}
    static int input(){
        Scanner a=new Scanner(System.in);
        int b=a.nextInt();
        return b;
    }}
