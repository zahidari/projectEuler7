/**
 * Project Euler Problem 7: 10001st Prime
 * 
 *  @author github.com/zahidari
 * 
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13,
 * we can see that the 6th prime is 13.
 *
 * What is the 10,001st prime number?
 * 
 * We iterate through integers, checking if each number is prime.
 * When we find a prime, we decrement the target count (nThPrime) until it reaches zero.
 * At the end of the iteration, we will have found the 10,001st prime number.
 */
public class Main {

    /**
     * Checks if a number x is prime.
     *
     * @param x The number to check for primality.
     * @return true if x is prime, false otherwise.
     */
    static boolean isItPrime(int x) {
        if (x <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(x); ++i) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        // Number to iterate and find each prime.
        int num = 2;

        // The nth prime you are looking for.
        int nThPrime = 10_001;

        while (true) {

            // If the num is a prime number, decrement nThPrime.
            if (isItPrime(num)) 
                nThPrime -= 1;
            

            // If we have found the 10,001st prime, exit the loop.
            if (nThPrime == 0) 
                break;
            

            num++;
        }
        
        System.out.println("The 10,001st prime is: " + num);
    }// end of main
}
