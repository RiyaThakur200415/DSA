class Solution 
{
    public boolean validPath(int n, int[][] edges, int source, int destination) 
    {
        if(source == destination)
        {
            return true;
        }
        int len = edges.length;
        boolean vis[] = new boolean[n];
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0 ; i < n ; i++)
        {
            ArrayList<Integer> lis = new ArrayList<>();
            adj.add(new ArrayList<>());
        }

        for(int i = 0 ; i  < edges.length ; i++)
        {
            int a = edges[i][0];
            int b = edges[i][1];

            adj.get(a).add(b);
            adj.get(b).add(a);
        }
        return bfs(source , n , adj , destination , vis);
        
    }

    static boolean bfs(int src , int n , ArrayList<ArrayList<Integer>> adj , int dest , boolean vis[])
    {
        vis[src] = true;
        Queue<Integer> q = new LinkedList<>();
        q.add(src);

        while(!q.isEmpty())
        {
            int val = q.poll();
            
                for(int i : adj.get(val))
                {
                    if(!vis[i])
                    {
                        vis[i] = true;
                        q.add(i);
                    }
                }
            
        }

        return vis[dest];
    }
}