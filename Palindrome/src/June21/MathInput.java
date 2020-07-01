package June21;

/*
6. Write a Java program to print the sum (addition), multiply, subtract, divide
and remainder of two numbers. Go to the editor
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5

 */

import java.util.Scanner;
public class MathInput {

    public static void main(String[]args){
        System.out.println("Expected Output :");
        System.out.println("125 + 24 = " + (125 + 24) );
        System.out.println("125 - 24 = " + (125 - 24) );
        System.out.println("125 x 24 = " + (125*24));
        System.out.println("125 / 24 = " + (125 / 24));
        System.out.println("125 mod 24 = " + (125 % 24));

        Scanner scr = new Scanner (System.in);
        System.out.println("Input First Number: ");
        int firstNum= scr.nextInt();

        System.out.println("Input Second Number");
        int secondNum= scr.nextInt();

      System.out.println("Sum = " + (firstNum+secondNum));
      System.out.println("Substraction = " + (firstNum-secondNum));
      System.out.println("Multiplication = " + (firstNum*secondNum));
      System.out.println("Division = " + (firstNum/secondNum));
      System.out.println("Modulus = " + (firstNum%secondNum));
    }
}
