package July.Methods;
/*
Write a Java method to check whether a year (integer) entered by the user is a leap year or not.
Expected Output:
Input a year: 2017
false
 */
//A common year has 365 days leap year has 366 days
//These extra days occur in each year which is an integer multiple of 4
//Except for year evenly divisible by 100 which are not leap years
// unless evenly divided by 400)
//Modulo formula (A-A / B * B = Ans)
import java.util.Scanner;
public class LeapYear {

        public static void main(String[] args)
        {
            Scanner scr = new Scanner(System.in);
            System.out.print("Input Year");
            int year = scr.nextInt();

            System.out.println(yesLeapYear(year));
        }

        public static boolean yesLeapYear(int i)
        {
            boolean multiple4 = (i % 4) == 0;
            boolean notMultiple100 = (i % 100) != 0;
            boolean multiple400 = ((i % 100 == 0) && (i % 400 == 0));
            return multiple4 && (notMultiple100 || multiple400);
        }
    }

