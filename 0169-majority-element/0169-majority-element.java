class Solution {
    public int majorityElement(int[] nums) 
    {
        int cnt = 0;
        int ele = 0;

        for(int i = 0 ; i < nums.length ; i++)
        {
            if(cnt == 0)
            {
                cnt++;
                ele = nums[i];
            }
            else if(ele == nums[i])
            {
                cnt++;
            }
            else
            {
                cnt--;
            }
        }
        if(cnt > 0)
        {
            return ele;
        }
        else
        {
            return -1;
        }  
    }
}