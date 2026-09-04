class Solution 
{
    public List<Integer> majorityElement(int[] nums) 
    {
        List<Integer> res = new ArrayList<>();

        int cnt1 = 0;
        int cnt2 = 0;
        int ele1 = -1;
        int ele2 = -1;

        for(int i = 0 ; i < nums.length ; i++)
        {
            if(cnt1 == 0 && nums[i] != ele2)
            {
                cnt1 = 1;
                ele1 = nums[i];
            }
            else if(cnt2 == 0 && nums[i] != ele1)
            {
                cnt2 = 1;
                ele2 = nums[i];
            }
            else if(nums[i] == ele1)
            {
                cnt1++;
            }
            else if(nums[i] == ele2)
            {
                cnt2++;
            }
            else
            {
                cnt1--;
                cnt2--;
            }
        }
        cnt1 = 0;
        cnt2 = 0;

        for(int num : nums)
        {
            if(num == ele1)
            {
                cnt1++;
            }
            else if(num == ele2)
            {
                cnt2++;
            }
        }
        int limit = nums.length / 3;

        if(cnt1 > limit)
        {
            res.add(ele1);
        }

        if(cnt2 > limit)
        {
            res.add(ele2);
        }

        return res;
    }
}