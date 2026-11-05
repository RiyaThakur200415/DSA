
class Solution 
{
    public double myPow(double x, int n) 
    {
        if(n == 0)
        {
            return 1.0;
        }

        long binForm = n;
        boolean negative = false;

        if(binForm < 0)
        {
            negative = true;
            binForm = -binForm;
        }

        double ans = 1.0;

        while(binForm > 0)
        {
            if(binForm % 2 == 1)
            {
                ans *= x;
            }

            x *= x;
            binForm /= 2;
        }

        if(negative)
        {
            ans = 1.0 / ans;
        }

        return ans;
    }
}