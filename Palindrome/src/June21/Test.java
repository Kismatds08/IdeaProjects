package June21;

import java.util.Scanner;
public class Test {

    public static void main(String[] args) {
        int input;
        Scanner scr = new Scanner(System.in);
        System.out.println("ENTER WHOLE NUMBER");
        int userNum = scr.nextInt();

        for (int i = 2; i <= userNum / 2; i++) {
            input = userNum % i;
            System.out.println(i);
            }
        }
    }
