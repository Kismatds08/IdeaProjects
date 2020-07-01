package june;

import java.util.Scanner;

public class Palindrome {

    static boolean palindromeFinder() {
        Scanner scr = new Scanner(System.in);
        System.out.println("ENTER name");
        String original = scr.nextLine();

        String reverse = "";
        int length = original.length();

        for (int i = original.length() - 1; i >= 0; i--)
            reverse = reverse + original.charAt(i);

        if (original.equals(reverse))
            return true;
        else
            return false;
    }

    public static void main(String[] args)
    {
        System.out.println(Palindrome.palindromeFinder());
    }
}




