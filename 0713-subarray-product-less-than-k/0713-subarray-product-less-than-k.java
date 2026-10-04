class Solution 
{
    public int numSubarrayProductLessThanK(int[] nums, int k) 
    {
        //Base Case
        if(k <= 1)
        {
            return 0;
        }

        int cnt = 0;
        int pro = 1;
        int left = 0;

        for(int right = 0 ; right < nums.length ; right++)
        {
            pro = pro * nums[right];

            while(pro >= k)
            {
                pro /= nums[left];
                left++;
            }
            cnt += (right - left + 1);
        }
        return cnt;
    }
}