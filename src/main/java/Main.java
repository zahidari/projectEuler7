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
 *       At the end the iteration is finished and we are going to find the n'th Prime number.
 */
public class Main {
    
 /** @brief:   is the number x prime ?
    *   return: if the number is prime than returns true, else false
    */
    static boolean isItPrime(int x) 
    { 
        for (int i = 2; i <= x / 2; ++i){
            if (x % i == 0){return false;}
        }  
        return true;
    }

    public static void main(String[] args) {
        
        //number to iterate and find each primes b.
        int num = 2;
        
        //the number you are looking for
        int nThPrime = 10001;
       
        
       
        while(true){
            
            //is the num a prime number,
            //than each time  the nThPrime is decreasing
           if(isItPrime(num))
               nThPrime -=1;
           
           //control of the 
           if(nThPrime == 0)
               break;
           
           num++;
           
           
        }
        System.out.println("the n'th prime is: "+num);
 
    }// end of main   
}

