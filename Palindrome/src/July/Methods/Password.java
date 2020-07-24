package July.Methods;
/*
11. Write a Java method to check whether a string is a valid password.
Password rules:
A password must have at least ten characters.
A password consists of only letters and digits.
A password must contain at least two digits.
Expected Output:
1. A password must have at least eight characters.
2. A password consists of only letters and digits.
3. A password must contain at least two digits
Input a password (You are agreeing to the above Terms and Conditions.): abcd1234
Password is valid: abcd1234
 */
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Password {
    int secondsPassed =0;
    Timer thisTimer = new Timer();
    TimerTask task = new TimerTask() {
        public void run() {
            secondsPassed++;
            System.out.println("Seconds Passed: " + secondsPassed);
        }
    };
    public void start() {
        thisTimer.scheduleAtFixedRate(task,1000,1000 );
            }

    public static void main(String[]args) {
        boolean start = true;
        int counter =3;

        while (start) {
            Scanner scr = new Scanner(System.in);
            System.out.println("1.A password must contain at least eight characters.");
            System.out.println("2.A password consists of only letters and digits.");
            System.out.println("3.A password must contain at least two digits.");
            String s = scr.nextLine();

            if (isValid(s)) {
                System.out.println("Password is valid: " + s);
                break;
            } else {
                System.out.println("Invalid Password: " + s);
            }
            counter--;
            if (counter==0){
                start=false;
            }
        }
        Password password=new Password();
        password.start();

    }

    public static boolean isValid(String pw){

        if (pw.length()<8) return false;
        int alphabetCount = 0;
        int numCount =0;
        for (int i=0; i<pw.length();i++){

            char c = pw.charAt(i);

            if (isNumber(c)) numCount++;
            else if (isAlphabet(c)) alphabetCount++;
            else return false;
        }
        return (alphabetCount>=2&&numCount>=2);
    }
    public static boolean isAlphabet(char c){
        c= Character.toUpperCase(c);
        return(c>='A'&& c<='Z');
        // or return Character.isLetter(ch);
    }
    public static boolean isNumber(char c){
        return (c>='0'&& c<='9');
    }
}