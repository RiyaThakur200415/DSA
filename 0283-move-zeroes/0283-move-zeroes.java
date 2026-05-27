class Solution 
{
    public void moveZeroes(int[] nums) 
    {
        int len = nums.length;
        int j = 0;
        int res[] = new int[len];
        for(int i = 0 ; i < len ; i++)
        {
            if(nums[i] != 0)
            {
                res[j++] = nums[i];
            }
        }
        
        for(int i = 0 ; i < len ; i++)
        {
            nums[i] = res[i];
        }
        System.out.println(Arrays.toString(nums));
        
    }
}