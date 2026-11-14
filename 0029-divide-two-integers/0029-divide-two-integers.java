class Solution 
{
    public int divide(int dividend, int divisor) 
    {
        //Base Case 
        // Overflow case
        if(dividend == Integer.MIN_VALUE && divisor == -1)
        {
            return Integer.MAX_VALUE;
        }

        if(dividend == divisor)
        {
            return 1;
        }

        boolean sign = false;

        if(dividend <= 0 && divisor > 0)
        {
            sign = true;
        }
        if(dividend > 0 && divisor < 0)
        {
            sign = true;
        }

        long n = Math.abs((long)dividend);
        long d = Math.abs((long)divisor);

        long sum = n;
        long ans = 0;

        while(sum >= d)
        {
            long res = d;
            long mul = 1;
            while((res << 1) <= sum)
            {
                res = res << 1;
                mul = mul << 1;
            }
            ans += mul;
            sum -= res;
        }
        if(sign == true)
        {
            return -(int)ans;
        }
        else
        {
            return (int)ans;
        }
    }
}