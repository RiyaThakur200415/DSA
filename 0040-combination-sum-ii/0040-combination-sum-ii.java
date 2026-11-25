class Solution 
{
    public List<List<Integer>> combinationSum2(int[] arr, int target) 
    {
        Arrays.sort(arr);
        List<List<Integer>> res = new ArrayList<>();
        helper_fn(0 , arr , target , new ArrayList<>() , res);
        return res;
    }

    static void helper_fn(int idx , int arr[] , int target , List<Integer> lis , List<List<Integer>> res)
    {
        int n = arr.length;
        //Base Case
        if(target == 0)
        {
            res.add(new ArrayList<>(lis));
            return;
        }

        for(int i = idx ; i < n ; i++)
        {
            if(idx < i && arr[i] == arr[i - 1])
            {
                continue;
            }
            if(arr[i] > target)
            {
                break;
            }

            lis.add(arr[i]);
            helper_fn(i + 1 , arr , target - arr[i] , lis , res);
            lis.remove(lis.size() - 1);
        }
    }
}