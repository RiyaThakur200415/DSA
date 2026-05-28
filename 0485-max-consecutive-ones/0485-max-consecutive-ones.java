class Solution 
{
    public int findMaxConsecutiveOnes(int[] nums) 
    {
        int cnt = 0;
        int maxCnt = 0;

        for(int i = 0 ; i < nums.length ; i++)
        {
            if(nums[i] == 1)
            {
                cnt++;
            }
            else
            {
                maxCnt = Math.max(maxCnt , cnt);
                cnt = 0;
            }
        }
        return Math.max(maxCnt , cnt);
        
    }
}