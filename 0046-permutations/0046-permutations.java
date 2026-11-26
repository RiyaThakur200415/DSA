class Solution 
{
    public List<List<Integer>> permute(int[] nums) 
    {
        List<List<Integer>> res = new ArrayList<>();
        boolean vis[] = new boolean[nums.length];
        helper_fn(nums , vis , new ArrayList<>() , res);
        return res;
    }

    static void helper_fn(int arr[] , boolean vis[] , List<Integer> lis , List<List<Integer>> res)
    {
        //Base Case
        if(lis.size() == arr.length)
        {
            res.add(new ArrayList<>(lis));
            return;
        }

        for(int i = 0 ; i < arr.length ; i++)
        {
            if(!vis[i])
            {
                vis[i] = true;
                lis.add(arr[i]);
                helper_fn(arr , vis , lis , res);
                lis.remove(lis.size() - 1);
                vis[i] = false;
            }
        }
    }
}