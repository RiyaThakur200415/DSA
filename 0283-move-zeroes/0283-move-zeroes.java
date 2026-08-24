class Solution 
{
    public void moveZeroes(int[] nums) 
    {
        int n = nums.length;
        int res[] = new int[n];
        int cnt = 0;
        for(int i = 0 ; i < n ; i++)
        {
            if(nums[i] == 0)
            {
                cnt++;
            }
        }
        int k =0;
        for(int i = 0 ; i < n ; i++)
        {
            if(nums[i] != 0)
            {
                res[k] = nums[i];
                k++;
            }
        }

        for(int i = 0 ; i < cnt ; i++)
        {
            res[k++] = 0;
        }
        
        for(int i = 0 ; i < n ; i++)
        {
            nums[i] = res[i];
        }
        System.out.println(Arrays.toString(nums));
    }
}