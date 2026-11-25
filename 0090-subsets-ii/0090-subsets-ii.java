class Solution 
{
    public List<List<Integer>> subsetsWithDup(int[] arr) 
    {
        Arrays.sort(arr);
        List<List<Integer>> res = new ArrayList<>();
        helper_fn(0 , arr , new ArrayList<>() , res);
        return res;
    }

    static void helper_fn(int idx , int arr[] , List<Integer> lis , List<List<Integer>> res)
    {
        //Base Case
        if(idx == arr.length)
        {
            res.add(new ArrayList<>(lis));
            return;
        }

        lis.add(arr[idx]);
        helper_fn(idx + 1 , arr , lis , res);
        lis.remove(lis.size() - 1);

        int next = idx + 1;

        while(next < arr.length && arr[next] == arr[idx])
        {
            next++;
        }

        helper_fn(next , arr , lis , res);
    }
}