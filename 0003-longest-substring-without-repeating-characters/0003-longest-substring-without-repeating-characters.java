class Solution 
{
    public int lengthOfLongestSubstring(String s) 
    {
        HashMap<Character , Integer> hm = new HashMap<>();

        int idx = 0;
        int cnt = 0;

        for(int i = 0 ; i < s.length() ; i++)
        {
            char ch = s.charAt(i);

            if(hm.containsKey(ch))
            {
                idx = Math.max(idx , hm.get(ch) + 1);
            }

            hm.put(ch , i);

            cnt = Math.max(cnt , i - idx + 1);
        }
        return cnt;
    }
}