package July.Methods;
/*5. Write a Java method to count all words in a string. Go to the editor
        Test Data:
        Input the string: The quick brown fox jumps over the lazy dog.
        Expected Output:

        Number of words in the string: 9
 */

import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the string: ");
        String str = in.nextLine();
        wordCountUsingSplit(str);
    }

    public static String wordCountUsingSplit(String str) {

        String[] wordArray = str.split("\\s+");
        int wordCount = wordArray.length;

        System.out.println("Word count is = " + wordCount);

        return str;
    }
}

