class Solution 
{
    public int findContentChildren(int[] g, int[] s) 
    {
        //Base Case : 1
        if(s.length == 0)
        {
            return 0;
        }

        Arrays.sort(g);
        Arrays.sort(s);

        int p1 = 0;
        int p2 = 0;
        int cnt = 0;

        while(p1 < g.length && p2 < s.length)
        {
            if(g[p1] <= s[p2])
            {
                cnt++;
                p1++;
                p2++;
            }
            else
            {
                p2++;
            }
        }
        return cnt;
    }
}