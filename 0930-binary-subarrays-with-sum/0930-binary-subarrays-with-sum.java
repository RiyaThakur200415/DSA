class Solution 
{
    public int numSubarraysWithSum(int[] nums, int goal) 
    {
        HashMap<Integer , Integer> hm = new HashMap<>();
        int sum = 0;
        int cnt = 0;
        hm.put(0 , 1);
        for(int i = 0 ; i < nums.length ; i++)
        {
            sum += nums[i];

            int temp = sum - goal;
            
            if(hm.containsKey(temp))
            {
                cnt += hm.get(temp);
            }

            hm.put(sum , hm.getOrDefault(sum , 0) + 1);

        }
        return cnt;
    }
}