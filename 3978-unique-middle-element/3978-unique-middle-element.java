class Solution 
{
    public boolean isMiddleElementUnique(int[] nums) 
    {
        HashMap<Integer , Integer> hm = new HashMap<>();

        for(int i = 0 ; i < nums.length ; i++)
        {
            int no = nums[i];
            if(!hm.containsKey(no))
            {
                hm.put(no , 1);
            }

            else
            {
                hm.put(no , hm.get(no) + 1);
            }
        }

        int mid = nums[nums.length / 2];
        int freq = hm.get(mid);

        if(freq == 1)
        {
            return true;
        }
        else
        {
            return false;
        }
        
        
    }
}