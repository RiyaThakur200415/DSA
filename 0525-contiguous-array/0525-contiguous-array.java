class Solution 
{
    public int findMaxLength(int[] nums) 
    {
        HashMap<Integer , Integer> hm = new HashMap<>();
        int sum = 0;
        int maxLen = 0;
        int len = 0;
        hm.put(0 , -1);

        for(int i = 0 ; i < nums.length ; i++)
        {
            if(nums[i] == 0)
            {
                sum -= 1;
            }
            else
            {
                sum += 1;
            }


            if(hm.containsKey(sum))
            {
                len = i - hm.get(sum);
                maxLen = Math.max(maxLen , len); 
            }

            else
            {
                hm.put(sum , i);
            }
        }
        return maxLen;
    }
}