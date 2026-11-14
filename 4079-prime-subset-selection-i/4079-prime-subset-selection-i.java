class Solution 
{
    public List<Integer> maxPrimes(int n, int s) 
    {
        List<Integer> res = new ArrayList<>();
        if(s <= 1 || n < 2)
        {
            return res;
        }

        //Finding the prime numbers less than or equal to n
        boolean vis[] = new boolean[n + 1];
        Arrays.fill(vis , true);
        vis[0] = false;
        vis[1] = false;

        for(int i = 2 ; i * i <= n ; i++)
        {
            if(vis[i])
            {
                for(int j = i * i ; j <= n ; j += i)
                {
                    vis[j] = false;
                }
            }
        }

        int sum = 0;
        for(int i = 2 ; i <= n ; i++)
        {
            if(vis[i])
            {
                if((sum + i) <= s)
                {
                    sum += i;
                    res.add(i);
                }
                else
                {
                    break;
                }
            }
        }
        return res;
    }
}