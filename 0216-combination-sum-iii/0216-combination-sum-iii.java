class Solution 
{
    public List<List<Integer>> combinationSum3(int size, int target) 
    {
        List<List<Integer>> res = new ArrayList<>();
        helper_fn(1 , target , size , new ArrayList<>() , res);
        return res;
    }

    static void helper_fn(int idx , int target , int size , List<Integer> lis , List<List<Integer>> res)
    {
        //Base Case
        if(target == 0 && lis.size() == size)
        {
            res.add(new ArrayList<>(lis));
            return;
        }

        for(int i = idx ; i <= 9 ; i++)
        {
            if(target < i) break;
            if(lis.size() > size) break;

            lis.add(i);
            helper_fn(i + 1 , target - i , size , lis , res);
            lis.remove(lis.size() - 1);
        }
    }
}