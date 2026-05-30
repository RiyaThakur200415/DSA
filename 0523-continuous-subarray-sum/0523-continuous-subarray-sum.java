class Solution 
{
    public boolean checkSubarraySum(int[] nums, int k) 
    {
        HashMap<Integer , Integer> hm = new HashMap<>();
        hm.put(0 , -1);

        int prefix = 0;

        for(int i = 0 ; i < nums.length ; i++)
        {
            prefix = prefix + nums[i];
            int rem = prefix % k;

            if(hm.containsKey(rem))
            {
                if(i - hm.get(rem) >= 2)
                {
                    return true;
                }

            }
            else
            {
                hm.put(rem , i);
            }
        }
        return false;
        
    }
}