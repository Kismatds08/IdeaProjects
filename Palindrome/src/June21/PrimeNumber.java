package June21;
// A natural number greater than 1 that is not a product of two smaller natural numbers is prime number  eg 5 X 1 or 1 X 5 i e 5 prime
// The positive integer whole numbers are natural numbers eg 1,2,3,4
//A natural number greater than 1 that is not prime number is called composite number    eg 2 X 2 = 4 i e 4 composite
/*To prove whether a number is prime number or not first divide by 2
and see if you get whole number. If you do its not prime number, if not try by 3, 5, 7, 11 and so on.
*/
// Prime numbers are the numbers that can be divided by itself or 1.

import java.util.Scanner;
public class PrimeNumber {

    public static void main (String[]args){
        int input;
        boolean isPrime=true;
        Scanner scr = new Scanner(System.in);
        System.out.println("ENTER WHOLE NUMBER");
        int userNum = scr.nextInt();

        if (userNum<=1){
           isPrime=false;
        }else{

            for (int i = 2; i <= userNum / 2; i++) {
                input = userNum % i;
                System.out.println("Thinking if " + i + " is a multiple " + "of " + userNum);

                if (input == 0) {
                    System.out.println("YES MULTIPLE FOUND= " + i);
                    isPrime = false;
                    break;
                }
            }
        }
         if (isPrime)
             System.out.println("Yes! " + userNum + " is a Prime Number!");
          else
              System.out.println("Not Prime number! "+ userNum + " is a Composite Number!");
    }
}
