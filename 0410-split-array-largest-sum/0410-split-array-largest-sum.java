class Solution 
{
    public int splitArray(int[] nums, int k) 
    {
        //Base Case
        if(nums.length < k)
        {
            return -1;
        }

        int low = 0;
        int high = 0;

        for(int i = 0 ; i < nums.length ; i++)
        {
            low = Math.max(low , nums[i]);
            high += nums[i];
        }

        int ans = high;

        while(low <= high)
        {
            int mid = low + (high - low) / 2;

            boolean val = canTake(nums , mid , k);

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

    static boolean canTake(int arr[] , int limit , int num)
    {
        int cnt = 1;
        int sum = 0;

        for(int i = 0 ; i < arr.length ; i++)
        {
            if(sum + arr[i] <= limit)
            {
                sum += arr[i];
            }
            else
            {
                cnt++;
                sum = arr[i];
            }
        }

        if(cnt <= num)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}