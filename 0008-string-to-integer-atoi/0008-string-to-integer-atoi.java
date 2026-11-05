class Solution 
{
    public int myAtoi(String s) 
    {
        int i = 0;
        int n = s.length();
        //Skipping empty spaces
        while(i < n && s.charAt(i) == ' ')
        {
            i++;
        }

        //Dealing with the sign;
        int sign = 1;
        if(i < n && (s.charAt(i) == '-' || s.charAt(i) == '+'))
        {
            if(s.charAt(i) == '-')
            {
                sign = -1;
            }
            i++;
        } 
       

        //Dealing with the digits
        long sum = 0;
        while(i < n && Character.isDigit(s.charAt(i)))
        {
            int num = s.charAt(i) - '0';
            sum = sum * 10 + num;

            if(sum * sign > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;

            if(sum * sign < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;

            i++;
        }
       
        return (int)(sum * sign);
    }
}