package june.Methods.src;

import java.util.Scanner;

public class MyClass {
    static void checkAge(int age) {
        if (age < 21)
            System.out.println("Access Denied to this Bar!");
        else {
            System.out.println("Enjoyyy");
        }
    }
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("ENTER AGE");
        int age = scr.nextInt();
        checkAge(age);
    }
}