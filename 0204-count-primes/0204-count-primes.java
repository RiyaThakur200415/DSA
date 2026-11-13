class Solution 
{
    public int countPrimes(int n) 
    {
        //Base Case
        if(n <= 2)
        {
            return 0;
        }
        
        boolean vis[] = new boolean[n];
        Arrays.fill(vis , true);
        vis[0] = false;
        vis[1] = false;

        for(int i = 2 ; i * i <= n ; i++)
        {
            if(vis[i])
            {
                for(int j = i * i ; j < n ; j += i)
                {
                    vis[j] = false;
                }
            }
        }

        int cnt = 0;
        for(int i = 0 ; i < n ; i++)
        {
            if(vis[i] == true)
            {
                cnt++;
            }
        }
        return cnt;
        
    }
}