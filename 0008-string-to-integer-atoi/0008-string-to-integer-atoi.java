class Solution 
{
    public int myAtoi(String s) 
    {
        long ans = 0;
        int i = 0;
        int sign = 1;
        int n = s.length();
        //Skip the extra front spaces
        while(i < n && s.charAt(i) == ' ')
        {
            i++;
        }

        // Finding the sign at the front

        if(i < n && (s.charAt(i) == '-' || s.charAt(i) == '+'))
        {
            if(s.charAt(i) == '-')
            {
                sign = -1;
            }
            i++;
        }

        // Next

        while(i < n && Character.isDigit(s.charAt(i)))
        {
            int digit = s.charAt(i) - '0';
            ans = ans * 10 + digit;

            //Checking overflow
            if(sign * ans > Integer.MAX_VALUE)
            {
                return Integer.MAX_VALUE;
            }

            if(sign * ans < Integer.MIN_VALUE)
            {
                return Integer.MIN_VALUE;
            }

            i++;
        }
        return (int)(sign * ans);
    }
}