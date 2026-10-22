class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
        int l = 0;
        int r = nums.length - 1;
        int sum = 0;
        int res[] = new int[2];

        while(l < r)
        {
            sum = nums[l] + nums[r];

            if(sum == target)
            {
                res[0] = l + 1;
                res[1] = r + 1;
            }

            if(sum < target)
            {
                l++;
            }
            else
            {
                r--;
            }
        }
        return res;
    }
}