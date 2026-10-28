class Solution 
{
    public int smallestDivisor(int[] nums, int threshold) 
    {
        //base case
        if(nums.length == 0)
        {
            return -1;
        }

        int low = 1;
        int high = 0;

        for(int i = 0 ; i < nums.length ; i++)
        {
            high = Math.max(high , nums[i]);
        }

        int ans = high;

        while(low <= high)
        {
            int mid = low + (high - low) / 2;

            boolean val = helper_fn(nums , mid , threshold);

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

    static boolean helper_fn(int arr[] , int div , int k)
    {
        int sum = 0;
        for(int i = 0 ; i < arr.length ; i++)
        {
            int ceilVal = (arr[i] + div - 1) / div;
            sum += ceilVal; 

            if(sum > k)
            {
                return false;
            }
        }
        return true;
    }
}