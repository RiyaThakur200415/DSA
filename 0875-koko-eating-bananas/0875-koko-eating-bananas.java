class Solution 
{
    public int minEatingSpeed(int[] piles, int h) 
    {
        int high = Integer.MIN_VALUE;
        for(int val : piles)
        {
            if(high < val)
            {
                high = val;
            }
        }
        int low = 1;
        int minVal = high;
        while(low <= high)
        {
            int mid = low + (high - low) / 2;
            
            if(possible(piles , mid) <= h)
            {
                minVal = mid;
                high = mid - 1;
                
            }
            else
            {
                low = mid + 1;
            }
        }

        return minVal;
    }

    static long possible(int piles[] , int k)
    {
        long total = 0;
        for(int val : piles)
        {
            total += (val + k - 1) / k;
        }
        return total;
    }
}