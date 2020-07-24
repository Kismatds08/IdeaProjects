package com.company;

public class Main {

    static int plusMethod(int x, int ya){
        return x + ya;
    }

    static double plusMethod( double x, double ya){
        return x + ya;
    }

    public static void main(String[] args) {
        int myNum1 = plusMethod( 8, 5);
        double myNum2 = plusMethod(4.2, 4.3);
        System.out.println("int:" + myNum1);
        System.out.println("double:" + myNum2);
    }
}
