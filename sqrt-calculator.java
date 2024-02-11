/**This code includes a method which finds square roots of non-negative integers. 
*If square root is not an integer, it will be rounded down to nearest integer.
*@author Melike Kara
*/
public class solution {
    public static int mySqrt(int x) {
        int start = 0;
        int end = x;
        int sqrt = 1;
        int mid = 0;
        if(x == 0 || x == 1) {return x;}
        while(start <= end)
        {
            mid = start + ((end - start) / 2);
            if(mid * mid == x)
            {
                return mid;
            }
            else if((long)mid*mid < (long)x)
            {
                start = mid + 1;
            }
            else if((long)mid*(long)mid > x)
            {
                end = mid -1;
            }
        }
        return Math.round(end);
    }
}
