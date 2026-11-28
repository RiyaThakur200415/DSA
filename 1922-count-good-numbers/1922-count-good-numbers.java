class Solution 
{
    static long M = 1000000007;
    public int countGoodNumbers(long n) 
    {
        long evenPlace = (n + 1) / 2;
        long oddPlace = n / 2;

        long res = (pow(5 , evenPlace) * pow(4 , oddPlace)) % M;
        return (int)res;
    }

    static long pow(long a , long b)
    {
        if(b == 0)
        {
            return 1;
        }

        if(b % 2 == 0)
        {
            return pow(((a * a) % M) , b / 2) % M;
        }
        else
        {
            return (a * pow(a , b - 1)) % M;
        }
    }
}