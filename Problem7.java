import static java.lang.Math.pow;

public class Problem7 {

    public static void main(String[] args) {
        long result = primeAt(10001);
        System.out.println("10001st prime = " + result );
    }
    
    /* returns nth prime number */
    public static long primeAt(long n) {
        int numberOfPrimes = 0;
        long prime = 1;
        
        while (numberOfPrimes < n) {
            prime++;
            if (isPrime(prime)) {
                numberOfPrimes++;
            }
        }
        return prime;
    }
    
   /**
    * check if the number is prime
    * if is prime return true
    * */
    public static boolean isPrime(long numb) {
        if (numb <2) {
            return false;
        } else if (numb == 2) {
            return true;
        }
        for (int i =2; i< Math.pow(numb, 0.5) +1; i++) {
            if (numb % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}
