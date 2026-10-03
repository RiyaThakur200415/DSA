class Solution 
{
    public int[] sortedSquares(int[] nums) 
    {
        int l = 0;
        int r = nums.length - 1;
        int res[] = new int[nums.length];
        int idx = nums.length - 1;

        while(l <= r)
        {
            int val1 = nums[l] * nums[l];
            int val2 = nums[r] * nums[r];
            
            if(val1 > val2)
            {
                res[idx--] = val1;
                l++;
            }
            else
            {
                res[idx--] = val2;
                r--;
            }
        }
        return res;
    }
}