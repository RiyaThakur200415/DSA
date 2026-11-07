
class Solution 
{
    public int divide(int dividend, int divisor) 
    {
        if(dividend == Integer.MIN_VALUE && divisor == -1)
        {
            return Integer.MAX_VALUE;
        }

        boolean sign = (dividend < 0) ^ (divisor < 0);

        long number = Math.abs((long) dividend);
        long d = Math.abs((long) divisor);

        long ans = 0;

        while(number >= d)
        {
            int cnt = 0;

            while(number >= (d << (cnt + 1)))
            {
                cnt++;
            }

            ans += (1L << cnt);

            number -= (d << cnt);
        }

        if(sign)
        {
            ans = -ans;
        }

        return (int) ans;
    }
}
