class Solution 
{
    public int findUnsortedSubarray(int[] nums) 
    {
        int l = -1;
        int r = -1;

        for(int i = 0 ; i < nums.length - 1 ; i++)
        {
            if(nums[i] > nums[i + 1])
            {
                l = i;
                break;
            }
        }
        if(l == -1)
        {
            return 0;
        }

        for(int i = nums.length - 1; i > 0 ; i--)
        {
            if(nums[i] < nums[i - 1])
            {
                r = i;
                break;
            }
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        //finding min and max
        for(int i = l ; i <= r ; i++)
        {
            min = Math.min(min , nums[i]);
            max = Math.max(max , nums[i]);
        }

        //Expanding left
        for(int i = 0 ; i < l ; i++)
        {
            if(nums[i] > min)
            {
                l = i;
                break;
            }
        }

        //Expanding right
        for(int i = nums.length - 1 ; i > r ; i--)
        {
            if(nums[i] < max)
            {
                r = i;
                break;
            }
        }
        return r - l + 1;
    }
}