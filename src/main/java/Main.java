/**
 *
 * @author github.com/zahidari
 * 
 *       By listing the first six prime numbers: 2,3,5,7,11 and 13, 
 *       we can see that the 6 th prime is 13.
 *
 *       What is the 10 001 st prime number?
 */
public class Main {
    


    public static void main(String[] args) {
        
       int prime = 2;
       int nThPrime = 6;
       int countTheNth = 0; 
       
       for(int i = 0;  i < nThPrime;)

 
    }//end of main
    
    
    
       /** @brief:   is the number x prime ?
        *   return: if prime than true, else false
        */
        boolean isItPrime(int x) { 

            for (int i = 2; i <= x / 2; ++i)
                if (x % i == 0)
                return false;
            return true;

        }
        
}

