class Solution 
{
    public List<List<Integer>> combinationSum(int[] arr, int target) 
    {
        List<List<Integer>> res = new ArrayList<>();
        helper_fn(0 , arr , target , new ArrayList<>() , res);
        return res;
    }

    static void helper_fn(int i , int arr[] , int target , List<Integer> lis , List<List<Integer>> res)
    {
        int n = arr.length;
        //Base Case
        if(i == n)
        {
            if(target == 0)
            {
                res.add(new ArrayList<>(lis));
            }
            return;
        }

        // To pick
        if(target >= arr[i])
        {
            lis.add(arr[i]);
            helper_fn(i , arr , target - arr[i] , lis , res);
            lis.remove(lis.size() - 1);
        }
        

        // Not pick
        helper_fn(i + 1 , arr , target , lis , res);
    }
}