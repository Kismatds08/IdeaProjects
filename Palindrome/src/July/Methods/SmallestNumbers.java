package July.Methods;
/*
1. Write a Java method to find the smallest number among three numbers. Go to the editor
Test Data:
Input the first number: 25
Input the Second number: 37
Input the third number: 29
Expected Output:

The smallest value is 25.0
 */

import java.util.Scanner;

public class SmallestNumbers {
    public static void smallestNumber(int a, int b, int c) {
        if (a < b && a < c) {
            System.out.println("The smallest value is " + a);
        } else if (b < a && b < c)
            System.out.println("The smallest value is " + b);
        else {
            System.out.println("The smallest value is " + c);
        }
    }

    public static void main(String[] args) {
        Scanner firstNum = new Scanner(System.in);
        System.out.println("Input the first number");
        int a = firstNum.nextInt();

        Scanner secondNum = new Scanner(System.in);
        System.out.println("Input the second number");
        int b = secondNum.nextInt();

        Scanner thirdNum = new Scanner(System.in);
        System.out.println("Input the third number");
        int c = thirdNum.nextInt();
        smallestNumber(a,b,c);
    }
}

