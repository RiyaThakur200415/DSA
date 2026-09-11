class Solution 
{
    public boolean isIsomorphic(String s, String t) 
    {
        int[] st = new int[256];
        int[] ts = new int[256];

        for(int i = 0; i < s.length(); i++)
        {
            char a = s.charAt(i);
            char b = t.charAt(i);

            if(st[a] != 0 && st[a] != b)
                return false;

            if(ts[b] != 0 && ts[b] != a)
                return false;

            st[a] = b;
            ts[b] = a;
        }

        return true;
    }
}