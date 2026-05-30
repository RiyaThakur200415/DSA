class Solution 
{
    public int longestConsecutive(int[] nums) 
    {
        HashSet<Integer> hs = new HashSet<>();

        for(int i = 0 ; i < nums.length ; i++)
        {
            hs.add(nums[i]);
        }
        int longest = 0;
        for(int i : hs)
        {
            if(!hs.contains(i - 1))
            {
                int curr = i;
                int length = 1;

                while(hs.contains(curr + 1))
                {
                    curr++;
                    length++;
                }
                longest = Math.max(longest , length);
            }
        }
        
        return longest;
        
    }
}