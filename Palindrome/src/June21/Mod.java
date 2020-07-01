package June21;
import java.util.Scanner;

public class Mod {

    public static void main(String[]args){

        Scanner scr = new Scanner(System.in);
        System.out.println("Enter Num");
        int x = scr.nextInt();

        System.out.println("Enter Second Num");
        int y =scr.nextInt();

        System.out.println("Modulus =" + (x%y));

    }

}
