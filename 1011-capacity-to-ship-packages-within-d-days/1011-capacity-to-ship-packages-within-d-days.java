class Solution 
{
    public int shipWithinDays(int[] weights, int days) 
    {
        //Base Case
        if(weights.length == 0)
        {
            return -1;
        }

        int low = 0;
        int high = 0;
        for(int i = 0 ; i < weights.length ; i++)
        {
            high += weights[i];
            low = Math.max(low , weights[i]);
        }
        
        int ans = high;

        while(low <= high)
        {
            int mid = low + (high - low) / 2;

            boolean val = helper_fn(weights , mid , days);

            if(val == true)
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

    static boolean helper_fn(int arr[] , int limit , int day)
    {
        int cnt = 1;
        int sum = 0;

        for(int i = 0 ; i < arr.length ; i++)
        {
            if(sum + arr[i] > limit)
            {
                cnt++;
                sum = arr[i];
            }
            else
            {
                sum += arr[i];
            }

            if(cnt > day)
            {
                return false;
            }
        }
        return true;
    }
}