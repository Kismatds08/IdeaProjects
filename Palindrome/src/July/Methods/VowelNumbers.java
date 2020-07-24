package July.Methods;
/*
4. Write a Java method to count all vowels in a string.
Test Data:
Input the string: w3resource
Expected Output:

Number of  Vowels in the string: 4
 */

import java.util.Scanner;
public class VowelNumbers {

    public static void vowelCounter(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == ' ') {
                count++;
            }
        }

        System.out.println("Number of vowels in the string " + count);
    }

    public static void main(String args[]) {

        System.out.println("Enter string :");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        vowelCounter(word);
    }
}
