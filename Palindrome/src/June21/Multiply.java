package June21;
/*
5. Write a Java program that takes two numbers as input and display the product of two numbers. Go to the editor
Test Data:
Input first number: 25
Input second number: 5
Expected Output :
25 x 5 = 125
 */
import java.util.Scanner;

public class Multiply {

    public static void main (String[]args){
        System.out.println("Expected Output = " + (25*5));

        Scanner scr = new Scanner(System.in);
        System.out.println("Input First Number: ");
        int firstNum= scr.nextInt();

        System.out.println("Input Second Number");
        int secondNum= scr.nextInt();

        System.out.println("Multiplication =" + firstNum * secondNum );
    }
}
