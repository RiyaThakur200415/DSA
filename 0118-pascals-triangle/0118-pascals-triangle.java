class Solution 
{
    public List<List<Integer>> generate(int numRows) 
    {
        List<List<Integer>> res = new ArrayList<>();

        for(int i = 1 ; i <= numRows ; i++)
        {
            res.add(helper_Fn(i));
        }

        return res;
    }

    static List<Integer> helper_Fn(int r)
    {
        List<Integer> rowAns = new ArrayList<>();
        long ans = 1;

        rowAns.add(1);

        for(int i = 1 ; i < r ; i++)
        {
            ans = ans * (r - i);
            ans = ans / i;
            rowAns.add((int)ans);
        }

        return rowAns;
    }
}