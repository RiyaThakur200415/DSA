class Solution 
{
    public boolean canVisitAllRooms(List<List<Integer>> rooms) 
    {
        int n = rooms.size();
        boolean vis[] = new boolean[n];
        boolean res = bfs(rooms , vis , 0);
        if(res == true)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    static boolean bfs(List<List<Integer>> rooms , boolean vis[] , int src)
    {
        Queue<Integer> q = new LinkedList<>();
        vis[src] = true;
        q.add(src);

        while(!q.isEmpty())
        {
            int val = q.poll();
            for(int i : rooms.get(val))
            {
                if(!vis[i])
                {
                    q.add(i);
                    vis[i] = true;
                }
            }
        }

        for(int i = 0 ; i < rooms.size() ; i++)
        {
            if(vis[i] == false)
            {
                return false;
            }
        }
        return true;
    }
}