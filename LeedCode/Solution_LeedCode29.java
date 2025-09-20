class Solution_LeedCode29{

public static void main(String [] args){
int divident = 20; 
int divisor = 12;
Solution_LeedCode29 slc = new Solution_LeedCode29();
int output = slc.divide(divident , divisor);
System.out.println(output);
}
    public int divide(int dividend, int divisor) {
         // Handle overflow case
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        
        // Determine sign of result
        boolean negative = (dividend < 0) ^ (divisor < 0);
        
        // Work with absolute values as long
        long dvd = Math.abs((long) dividend);
        long dvs = Math.abs((long) divisor);
        
        int result = 0;
        
        while (dvd >= dvs) {
            long temp = dvs;
            long multiple = 1;
            // Double temp and multiple until exceeding dvd
            while (dvd >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }
            dvd -= temp;
            result += multiple;
        }
        
        return negative ? -result : result;
        
    }
}
/**
Given two integers dividend and divisor, divide two integers without using multiplication, division, and mod operator.

The integer division should truncate toward zero, which means losing its fractional part. For example, 8.345 would be truncated to 8, and -2.7335 would be truncated to -2.

Return the quotient after dividing dividend by divisor.

Note: Assume we are dealing with an environment that could only store integers within the 32-bit signed integer range: [−231, 231 − 1]. For this problem, if the quotient is strictly greater than 231 - 1, then return 231 - 1, and if the quotient is strictly less than -231, then return -231.



**/