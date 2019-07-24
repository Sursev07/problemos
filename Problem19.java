public class Problem19 {
    public static void main(String args[]) {
        int start = 1901;
        int end = 2000;
       int result = countSunday(start, end);

        	System.out.println("Total of sunday =  " + result);
    }
    
     public static int countSunday(int start, int end) {
        int count = 0;
        for (int y = start; y <= end; y++) {
            for (int m = 1; m <= 12; m++) {
                if (dayInWeek(y, m, 1) == 0)  // Sunday
                count++;
            }
        }
        return count;
    }
 
 
     private static int dayInWeek(int year, int month, int day) {
      long m = mod((long)month - 3, 4800);
      long y = mod(year + m / 12, 400);
      m %= 12;
      return (int)((y + y/4 - y/100 + (13 * m + 2) / 5 + day + 2) % 7);
     }
 
 
     private static long mod(long x, long y) {
      x %= y;
      if (y > 0 && x < 0 || y < 0 && x > 0)
       x += y;
      return x;
     }
 }
