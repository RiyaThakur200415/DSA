class Solution 
{
    public String countAndSay(int n) 
    {
        String result = "1";
        for(int i = 2 ; i <= n ; i++)
        {
            StringBuilder next = new StringBuilder();
            int cnt = 1;

            for(int j = 1 ; j <= result.length() ; j++)
            {
                if(j < result.length() && result.charAt(j) == result.charAt(j - 1))
                {
                    cnt++;
                }
                else
                {
                    next.append(cnt);
                    next.append(result.charAt(j - 1));
                    cnt = 1;
                }
            }
            result = next.toString();
        }
        return result;
    }
}