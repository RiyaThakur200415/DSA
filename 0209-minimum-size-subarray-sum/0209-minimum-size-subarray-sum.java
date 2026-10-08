class Solution 
{
    public int minSubArrayLen(int target, int[] nums) 
    {
        int l = 0;
        int minLen = nums.length + 1;
        int sum = 0;

        for(int r = 0 ; r < nums.length ; r++)
        {
            sum += nums[r];

            while(sum >= target)
            {
                int cnt = r - l + 1;
                sum -= nums[l];
                l++;
                minLen = Math.min(minLen , cnt);
            }
        }
        
        return minLen == nums.length + 1 ? 0 : minLen;
    }
}