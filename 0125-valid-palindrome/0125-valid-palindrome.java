class Solution 
{
    public boolean isPalindrome(String s) 
    {
        StringBuilder ans = new StringBuilder();

        for(int i = 0 ; i < s.length() ; i++)
        {
            char ch = s.charAt(i);
            if((ch >= 97 && ch <= 122) || (ch >=65 && ch <= 90) || (ch >= 48 && ch <= 57))
            {
                ans.append(ch);
            }
        }

        String res = ans.toString().toLowerCase();

        int l = 0 ; 
        int r = res.length() - 1;

        while(l <= r)
        {
            if(res.charAt(l) != res.charAt(r))
            {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}