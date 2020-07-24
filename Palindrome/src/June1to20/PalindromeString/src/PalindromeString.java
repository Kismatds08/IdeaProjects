import java.util.Scanner;
class PalindromeString {
    public static void main(String[] args)
    {
        String reverse = "";
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the string or int. input");
        String original = scr.nextLine();

        for (int i = original.length() - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }
        if (original.equals(reverse))
            System.out.println("Given word or number is a Palindrome");

     else
                System.out.println("Given word or number is not a Palindrome");


        }
    }

