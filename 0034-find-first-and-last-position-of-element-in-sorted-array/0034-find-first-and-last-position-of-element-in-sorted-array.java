class Solution 
{
    public int[] searchRange(int[] nums, int target) 
    {
        int res[] = new int[2];

        int first = firstOcc(nums , target);
        int last = lastOcc(nums , target);

        if(first == nums.length || nums[first] != target || nums.length == 0)
        {
            res[0] = -1;
            res[1] = -1;
        }
        else
        {
            res[0] = first;
            res[1] = last;
        }
        return res;
    }

    static int firstOcc(int nums[] , int target)
    {
        int low = 0;
        int high = nums.length - 1;
        int ans = nums.length;

        while(low <= high)
        {
            int mid = low + (high - low) / 2;

            if(nums[mid] >= target)
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

    static int lastOcc(int nums[] , int target)
    {
        int low = 0;
        int high = nums.length - 1;
        int ans = nums.length;

        while(low <= high)
        {
            int mid = low + (high - low) / 2;

            if(nums[mid] > target)
            {
                high = mid - 1;
            }
            else
            {
                ans = mid;
                low = mid + 1;
            }
        }
        return ans;
    }
}