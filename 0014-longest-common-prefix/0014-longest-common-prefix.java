class Solution 
{
    public String longestCommonPrefix(String[] strs) 
    {
        Arrays.sort(strs);

        String first = strs[0];
        String last = strs[strs.length - 1];

        int limit = Math.min(first.length() , last.length());

        String ans = "";

        for(int i = 0 ; i < limit ; i++)
        {
            if(first.charAt(i) != last.charAt(i))
            {
                break;
            }
            else
            {
                ans += first.charAt(i);
            }
        }
        return ans;
    }
}