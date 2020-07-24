public class PalindromeMethod {

    static void palindromeMethod(){

        String reverse = "";
        String original = "Yes";

        for (int i = original.length() - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }
        if (original.equals(reverse))
            System.out.println("Given name/number is a Palindrome - True");

        else
            System.out.println("Given name/number is not a Palindrome - False");
    }

    public static void main(String[] args) {
        palindromeMethod();

    }
}
