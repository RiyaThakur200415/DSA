class Solution 
{
    public int longestOnes(int[] nums, int k) 
    {
        int zero = 0;
        int l = 0;
        int maxLen = 0;

        for(int r = 0 ; r < nums.length ; r++)
        {
            if(nums[r] == 0)
            {
                zero++;
            }
            
            while(zero > k)
            {
                if(nums[l] == 0)
                {
                    zero--;
                }
                l++;
            }

            int len = r - l + 1;
            maxLen = Math.max(maxLen , len);
        }
        return maxLen;
    }
}