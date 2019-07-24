
import java.math.BigInteger;

public class Problem16 {
    public static void main(String args[]) {
        int num1 = 2;
		int pow1 = 1000;
        int result = powerSum(num1, pow1);

        	System.out.println("Sum of the number that result of 2^1000 =  " + result);
    }
    
    public static int powerSum(int num1, int pow1)
    {
        int result = 0;
        int temp = 0;
        BigInteger number = new BigInteger(String.valueOf(num1));
        BigInteger power = number.pow(pow1);
        String powerInString = String.valueOf(power);

        int length = powerInString.length();
        for (int i = 0; i < length; i++) {
          temp = powerInString.charAt(i) - 48; // ascii 0
          result += temp;
        }
        return result;
    }
 }
