public class PalindromeCheck {
    public static int [] isPalindrome(String str){
        StringBuilder sb =new StringBuilder(str);
        sb.reverse();
        String rev=sb.toString();

        if (str.equals(rev)){
            return new int [] { 1,2,3};

        }
        else {
            return new int []{4,3,1};
        }

    }

}
