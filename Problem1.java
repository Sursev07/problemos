public class Problem1 {
    public static void main(String args[]) {
        int result = multiplies35();

        System.out.println("Sum of multiplies 3 and 5 below 1000 " + result);
    }
    /** 
    ** Get sum from all numbers that multiplies 3 and 5 below 1000
    **/
    public static int multiplies35()
    {
        int result = 0;
        for (int i = 0; i<1000; i++) {
            if (i%3 == 0 || i%5 ==0) {
                result = result + i;
            }
        }
        return result;
    }
}
