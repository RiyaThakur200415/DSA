class Solution 
{
    public List<String> generateParenthesis(int n) 
    {
        List<String> res = new ArrayList<>();
        helper_fn(n , 0 , 0 , new StringBuilder() , res);
        return res;
    }

    static void helper_fn(int n , int open , int close , StringBuilder temp , List<String> res)
    {
        //Base Case
        if(temp.length() == n * 2)
        {
            res.add(temp.toString());
            return;
        }

        if(open < n)
        {
        temp.append('(');
        helper_fn(n , open + 1 , close , temp , res);
        temp.deleteCharAt(temp.length() - 1);
        }

        if(close < open)
        {
            temp.append(')');
            helper_fn(n , open , close + 1 , temp , res);
            temp.deleteCharAt(temp.length() - 1);
        }
    }
}