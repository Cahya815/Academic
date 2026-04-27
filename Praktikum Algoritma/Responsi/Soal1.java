public class Soal1 {

public static void genap(int n) {
if (n > 10) {
return;
}
System.out.println(n);
genap(n + 2);
}
public static void main(String[] args) {
System.out.println("Deret Bilangan Genap");
genap(0);
}}
