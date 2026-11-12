class Solution 
{
    public int minBitFlips(int start, int goal) 
    {
        int val = start ^ goal;
        String valBin ="";
        StringBuilder sb = new StringBuilder();

        while(val > 0)
        {
            int rem = val % 2;
            sb.append(rem);
            val = val / 2;
        }

        sb.reverse();

        int cnt = 0;
        for(int i = 0 ; i < sb.length() ; i++)
        {
            if(sb.charAt(i) == '1')
            {
                cnt++;
            }
        }
        return cnt;
    }
}