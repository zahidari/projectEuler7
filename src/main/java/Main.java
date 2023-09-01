/**
 *
 * @author github.com/zahidari
 * 
 *       By listing the first six prime numbers: 2,3,5,7,11 and 13, 
 *       we can see that the 6 th prime is 13.
 *
 *       What is the 10 001 st prime number?
 *       
 *       We are decresing every time the n'th prime integer by 1 if we find a prime number.
 *       at the end we are gi,ongto find the n'th Prime number.
 */
public class Main {
    
 /** @brief:   is the number x prime ?
    *   return: if the number is prime than returns true, else false
    */
    boolean isItPrime(int x) 
    { 
        for (int i = 2; i <= x / 2; ++i){
            if (x % i == 0){return false;}
        }  
        return true;
    }

    public static void main(String[] args) {
        
        //number to iterate and find the primes.
        int num = 2;
        int nThPrime = 6;
       
        
       
        while(nThPrime != 0){
           if(isItPrime(num))
               nThPrime -=1;
           num++;
           
           
        }
        System.out.println("the n'th prime is: "+num);
 
    }// end of main   
}

