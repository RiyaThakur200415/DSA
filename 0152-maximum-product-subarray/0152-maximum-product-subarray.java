class Solution 
{
    public int maxProduct(int[] nums) 
    {
        int preProduct = 1;
        int sufProduct = 1;

        int l = 0;
        int r = nums.length - 1;
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(preProduct == 0)
            {
                preProduct = 1;
            }
            if(sufProduct == 0)
            {
                sufProduct = 1;
            }
            preProduct *= nums[i];
            sufProduct *= nums[nums.length - 1 - i];
            max = Math.max(max , Math.max(preProduct , sufProduct));
        }
        return max;
    }
}