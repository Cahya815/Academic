import java.util.Scanner;

public class CekPassword {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("password  nya apa ya: ");
        String password = input.nextLine();


        if (password.equals("AKAKOM")) {
            System.out.println("Yesss you are so sigma ");
        } else {
            System.out.println("worng get out of here");
        }


    }
}
