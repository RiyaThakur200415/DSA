class Solution 
{
    public String removeOuterParentheses(String s) 
    {
        //((()))(())

        String res = "";
        int cnt = 0;

        for(int i = 0 ; i < s.length() - 1 ; i++)
        {
            if(s.charAt(i) == '(')
            {
                cnt++;
                if(cnt > 1)
                {
                    res = res + s.charAt(i);
                }
            }
            else
            {
                cnt--;
                if(cnt > 0)
                {
                    res = res + s.charAt(i);
                }
            }
        }
        return res;
    }
}