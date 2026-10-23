class Solution 
{
    public int minEatingSpeed(int[] piles, int h) 
    {
        int low = 1;

        int high = 0;
        for(int i = 0 ; i < piles.length ; i++)
        {
            high = Math.max(high , piles[i]);
        }
        int ans = high;

        while(low <= high)
        {
            int mid = low + (high - low) / 2;
            long val = helper_fn(piles , mid);

            if(val <= h)
            {
                ans = mid;
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }
        return ans;
    }

    static long helper_fn(int arr[] , int limit)
    {
        long ans = 0;

        for(int i = 0 ; i < arr.length ; i++)
        {
            ans += (arr[i] + (long)limit - 1) / limit;
        }
        return ans;
    }
}