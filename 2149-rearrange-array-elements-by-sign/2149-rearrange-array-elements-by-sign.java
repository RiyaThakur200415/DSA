class Solution 
{
    public int[] rearrangeArray(int[] nums) 
    {
        int ans[] = new int[nums.length];
        int ecnt = 0;
        int ocnt = 0;

        for(int i = 0 ; i < nums.length ; i++)
        {
            if(nums[i] >= 0)
            {
                ans[ecnt * 2] = nums[i];
                ecnt++;
            }
            else
            {
                ans[ocnt * 2 + 1] = nums[i];
                ocnt++;
            }
        }
        return ans;
        
    }
}