class Solution 
{
    public List<List<Integer>> subsets(int[] nums) 
    {
        List<List<Integer>> res = new ArrayList<>();

        int n = 1 << nums.length;

        for(int i = 0 ; i < n ; i++)
        {
            List<Integer> lis = new ArrayList<>();
            for(int j = 0 ; j < nums.length ; j++)
            {
                if((i & (1 << j)) != 0)
                {
                    lis.add(nums[j]);
                }
            }
            res.add(lis);
        }
        return res;
    }
}