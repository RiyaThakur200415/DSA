class Solution 
{
    public int maxSubarraySumCircular(int[] nums) 
    {
        int curMin = nums[0];
        int minSum = nums[0];

        int curMax = nums[0];
        int maxSum = nums[0];

        int totalSum = nums[0];

        for(int i = 1 ; i < nums.length ; i++)
        {
            curMin = Math.min((curMin + nums[i]) , nums[i]);
            minSum = Math.min(minSum , curMin);

            curMax = Math.max((curMax + nums[i]) , nums[i]);
            maxSum = Math.max(maxSum , curMax);

            totalSum += nums[i];
        }

        //Base case
        if(maxSum < 0)
        {
            return maxSum;
        }

        return Math.max(maxSum , totalSum - minSum);
    }
}