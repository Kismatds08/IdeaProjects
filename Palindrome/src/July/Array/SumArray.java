//2. Write a Java program to sum values of an array.
package July.Array;

public class SumArray {
    public static void main (String[]args) {
        int[] add1 = {1, 2, 3, 4, 5};
        int sum  = 0;

        for(int i=0;i<add1.length;i++)
            sum+= add1[i];

      System.out.println("Sum of the give array: " + sum);
    }
}
