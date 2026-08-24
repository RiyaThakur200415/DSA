class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
        HashMap<Integer , Integer> hm = new HashMap<>();
        int idx1 = 0;
        int idx2 = 0;
        int res[] = new int[2];
        for(int i = 0 ; i < nums.length ; i++)
        {
            int diff = target - nums[i];
            if(!hm.containsKey(diff))
            {
                hm.put(nums[i] , i);
            }
            else
            {
                idx1 = hm.get(diff);
                idx2 = i;
            }
        }
        res[0] = idx1;
        res[1] = idx2;
        return res;
    }
}