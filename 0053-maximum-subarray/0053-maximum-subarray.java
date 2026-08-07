class Solution 
{
    public int maxSubArray(int[] nums) 
    {
        int prf[] = new int[nums.length];
        int maxSum = Integer.MIN_VALUE;
        //Base Case
        if(nums.length == 1)
        {
            return nums[0];
        }
        prf[0] = nums[0];
        maxSum = prf[0];
        for(int i = 1 ; i < nums.length ; i++)
        {
            prf[i] = Math.max((prf[i - 1] + nums[i]) , nums[i]);
            maxSum = Math.max(maxSum , prf[i]);
        }
        return maxSum;
    }
}