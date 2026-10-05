class Solution 
{
    public int findUnsortedSubarray(int[] nums) 
    {
        int temp[] = new int[nums.length];
        for(int i = 0 ; i < nums.length ; i++)
        {
            temp[i] = nums[i];
        }

        Arrays.sort(nums);

        int idx1 = -1;
        int idx2 = -1;

        for(int i = 0 ; i < nums.length ; i++)
        {
            if(nums[i] != temp[i])
            {
                idx1 = i;
                break;
            }
        }

        for(int i = nums.length - 1 ; i >= 0 ; i--)
        {
            if(nums[i] != temp[i])
            {
                idx2 = i;
                break;
            }
        }
        if(idx1 != -1 || idx2 != -1)
        {
            return idx2 - idx1 + 1;
        }
        else
        {
            return 0;
        }
    }
}