class Solution 
{
    public boolean search(int[] nums, int target) 
    {
        int low = 0;
        int high = nums.length - 1;

        while(low <= high)
        {
            int mid = low + (high - low) / 2;

            if(nums[mid] == target)
            {
                return true;
            }

            if(nums[low] == nums[mid] && nums[mid] == nums[high])
            {
                low = low + 1;
                high = high - 1;
                continue;
            }

            //If left part is sorted
            if(nums[low] <= nums[mid])
            {
                if(nums[low] <= target && target < nums[mid])
                {
                    high = mid - 1;
                }
                else
                {
                    low = mid + 1;
                }
            }
            
            //For right part
            else
            {
                if(nums[mid] < target && target <= nums[high])
                {
                    low = mid + 1;
                }
                else 
                {
                    high = high - 1;
                }
            }
        }
        return false;
    }
}