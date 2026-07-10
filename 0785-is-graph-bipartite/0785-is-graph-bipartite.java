class Solution 
{
    static boolean ans;
    public boolean isBipartite(int[][] graph) 
    {
        ans = true;
        int n = graph.length;
        int vis[] = new int[n];
        Arrays.fill(vis , -1);
        

        for(int i = 0 ; i < n ; i++)
        {
            if(ans == false)
            {
                return ans;
            }
            if(vis[i] == -1)
            {
                bfs(i , graph , vis);
            }
        }
        return ans;
    }

    public void bfs(int i , int graph[][] , int vis[])
    {
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        vis[i] = 0;
        while(!q.isEmpty())
        {
            int val = q.poll();
            int color = vis[val];
            for(int ele : graph[val])
            {
                if(vis[ele] == vis[val])
                {
                    ans = false;
                    return;
                }

                if(vis[ele] == -1)
                {
                    vis[ele] = 1 - color;
                    q.add(ele);
                }
            }
        }
    }
}