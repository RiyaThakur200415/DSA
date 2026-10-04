class Solution 
{
    public boolean backspaceCompare(String s, String t) 
    {
        String ans1 = helper_Fn(s);
        String ans2 = helper_Fn(t);

        if(ans1.equals(ans2))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    static String helper_Fn(String s)
    {
        Stack<Character> st = new Stack<>();

        for(int i = 0 ; i < s.length() ; i++)
        {
            char ch = s.charAt(i);
            
            if(st.isEmpty() && ch == '#')
            {
                continue;
            }
            if(ch == '#')
            {
                st.pop();
            }
            else
            {
                st.push(ch);
            }
        } 

        StringBuilder ans = new StringBuilder();
        while(!st.isEmpty())
        {
            ans.append(st.pop());
        }
        return ans.toString();
    }
}