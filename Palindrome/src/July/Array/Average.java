//Write a Java program to calculate the average value of array elements.
//sum divide by elements
package July.Array;

public class Average {
    public static void main(String[]args){

        int[] add1={ 1,2,3,4,5};
        int sum  = 0;

        for(int i=0;i<add1.length;i++)
            sum += add1[i];
        double average = sum/add1.length;
        System.out.println("Average value of the array elements is: " + average);


    }
}
