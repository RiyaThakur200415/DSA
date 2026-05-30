class Solution 
{
    public int[] productExceptSelf(int[] nums) 
    {
        int n = nums.length;
        int prefix[] = new int[nums.length];
        prefix[0] = 1;
        int sufix[] = new int[nums.length];
        sufix[nums.length - 1] = 1;
        for(int i = 1 ; i < nums.length ; i++)
        {
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }
        for(int i = n - 2 ; i >= 0 ; i--)
        {
            sufix[i] = sufix[i + 1] * nums[i + 1];
        }
        
        int res[] = new int[nums.length];
        for(int i = 0 ; i < nums.length ; i++)
        {
            res[i] = prefix[i] * sufix[i];
        }
        return res;
    }
}