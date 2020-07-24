package June1to20;
import java.util.Scanner;

public class June12 {
    public static void main(String[] args) {

/*
        if(validatePin(getPin()) {
            printMenu();
            while(true) { //loop forever
                int input = getUserSelection();
                if(input == 1) {
                    handleDeposit();
                    break;
                }
                else if(input == 2) {
                    handleWithdrawal();
                    break;
                }
                else if(input == 3) {
                    handleRepresentative();
                    break;
                }
                else {
                    handleInputError();
                }
    else {
                    handlePinError();
                }


 */

        Scanner scr = new Scanner(System.in);
        System.out.println("ENTER PIN");
        int pin = 9876;
        pin = scr.nextInt();

        if (pin == 9876) {
            System.out.println("Welcome To XYZ Bank's ATM! Choose your options for today!");
            System.out.println("To Deposit                                      Press 1");
            System.out.println("To Withdraw                                    Press 2");
            System.out.println("To Talk To a Representative            Press 3");
        } else {
            System.out.println("Incorrect Pin") ;
        }
        {
            int enter1 = 1;
            enter1 = scr.nextInt();

            if (enter1 == 1) {
                System.out.println("Deposit");
            } else if (enter1 == 2)
                System.out.println("Enter Withdrawal Amount");

            else if (enter1 == 3)
                System.out.println("Hello! My name is Kismat. How may I help you today?");
            else
                System.out.println("Error. Please Enter Correct Code");
        }
        int withdraw = scr.nextInt();
        int creditBalance=1000;
        if (withdraw<=1000){
            System.out.println("Cashing Out");
        }else if(withdraw<=1200){
            System.out.println("Insufficient Funds. Overdraft Charges Will Apply If You Proceed - (For upto $200 above Credit Balance in Checking Account)");
        }else{
            System.out.println("Insufficient Funds. Transaction Incomplete.");
        }

    }

}
