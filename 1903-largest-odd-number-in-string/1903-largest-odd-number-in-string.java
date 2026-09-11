class Solution 
{
    public String largestOddNumber(String num) 
    {
        StringBuilder ans = new StringBuilder();
        int i = num.length() - 1;
        int idx = Integer.MIN_VALUE;
        while(i >= 0)
        {
            char ch = num.charAt(i);
            long val = (long)ch;
            if(val % 2 != 0)
            {
                idx = i;
                break;
            }
            else
            {
                i--;
            }
        }
        
        if(idx == Integer.MIN_VALUE)
        {
            return "";
        }
        else
        {
            ans.append(num , 0 , idx + 1);
            return ans.toString();
        }
    }
}