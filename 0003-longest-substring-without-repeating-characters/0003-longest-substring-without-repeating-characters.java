class Solution 
{
    public int lengthOfLongestSubstring(String s) 
    {
        HashMap<Character , Integer> hm = new HashMap<>();
        int l = 0;
        int cnt = 0;

        for(int r = 0 ; r < s.length() ; r++)
        {
            char ch = s.charAt(r);

            if(hm.containsKey(ch))
            {
                l = Math.max(l , hm.get(ch) + 1);
            }

            hm.put(ch , r);

            cnt = Math.max(cnt , r - l + 1);
        }
        return cnt;
    }
}