class Solution 
{
    public boolean isPalindrome(String s) 
    {
        int l = 0;
        int r = s.length() - 1;

        while(l <= r)
        {
            char lchar = s.charAt(l);
            char rchar = s.charAt(r);

            if(!Character.isLetterOrDigit(lchar))
            {
                l++;
                continue;
            }
            if(!Character.isLetterOrDigit(rchar))
            {
                r--;
                continue;
            }

            if(Character.toLowerCase(lchar) != Character.toLowerCase(rchar))
            {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}