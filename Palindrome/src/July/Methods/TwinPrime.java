package July.Methods;
/*
Write a Java method to find all twin prime numbers less than 100.
Expected Output:
(3, 5)
(5, 7)
(11, 13)
(17, 19)
(29, 31)
(41, 43)
(59, 61)
(71, 73)

Twin primes are those with difference 2
Only one composite number between them

 */

public class TwinPrime {

    public static void main(String args[]) {

        System.out.println("Twin Primes are:");

        String primeNo = " ";
        int j = 0;
        int LastPrime = 1;
        for (int i = 1; i < 100; i++) {
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (i == j) {
                primeNo += i + " ";
                if ((i - LastPrime) == 2) {
                    System.out.println("(" + (i - 2) + "," + i + ")");
                }
                LastPrime = i;
            }
        }
    }
}

