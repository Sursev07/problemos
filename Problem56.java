import java.math.*;

public class Problem56 {
	public static void main(String [] args){
		
		int result = maxDigitSum(99, 95);
		System.out.println("Result: " + result);
	}
	
	public static int maxDigitSum(int a, int b) {
	    int res = 0;
	    BigInteger base = BigInteger.valueOf(a);
		BigInteger result = base.pow(b);
		String s = result.toString();
		String [] str = s.split("");
		for (int i = 0 ; i <s.length(); i++){
			res += Integer.parseInt(str[i]);
		}
		return res;
	}
}
