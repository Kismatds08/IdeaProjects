//1. Write a Java program to sort a numeric array and a string array
//alphabetical order
//chronological
package July.Array;
import java.util.Arrays;

public class StringOrNumeric {
    public static void main(String[] args) {

        int[]arrayInt = {345,456,123,789};
        String[]arrayString = {"Drums", "Guitar", "Piano", "Bass"};

        Arrays.sort(arrayInt);
        System.out.println("Sorted numeric array: "+ Arrays.toString(arrayInt));

        Arrays.sort(arrayString);
        System.out.println("Sorted string array: " + Arrays.toString(arrayString));
    }
}
