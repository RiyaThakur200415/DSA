class Solution 
{
    public int compress(char[] chars) 
    {
        int n = chars.length;
        ArrayList<Character> lis = new ArrayList<>();
        for(int i = 0 ; i < n ; i++)
        {
            char ch = chars[i];
            int cnt = 1;
            int idx = i;
            while(idx + 1 < n && ch == chars[idx + 1])
            {
                cnt++;
                idx++;
            }
            if(cnt == 1)
            {
                lis.add(ch);
            }
            else
            {
                lis.add(ch);
                String count = String.valueOf(cnt);

                for(char c : count.toCharArray())
                {
                    lis.add(c);
                }
            }
            i = idx;
        }
        for(int j = 0; j < lis.size(); j++)
        {
            chars[j] = lis.get(j);
        }
        return lis.size();
    }
}