class Solution 
{
    public int minSubArrayLen(int target, int[] nums) 
    {
        int n = nums.length;
        int currSum = 0;
        int minLen = Integer.MAX_VALUE;
        int i = 0; 
        int j = 0;

        while(j < n)
        {
            currSum += nums[j];
            j++;

            while(currSum >= target)
            {
                int len = j - i;
                minLen = Math.min(minLen , len);

                currSum -= nums[i];
                i++;
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
        
    }
}