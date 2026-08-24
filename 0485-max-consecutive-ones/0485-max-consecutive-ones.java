class Solution 
{
    public int findMaxConsecutiveOnes(int[] nums) 
    {
        int curCnt = 0;
        int maxCnt = 0;

        for(int i = 0 ; i < nums.length ; i++)
        {
            if(nums[i] == 1)
            {
                curCnt++;
            }
            else
            {
                maxCnt = Math.max(maxCnt , curCnt);
                curCnt = 0;
            }
        }
        maxCnt = Math.max(maxCnt , curCnt);
        return maxCnt;
    }
}