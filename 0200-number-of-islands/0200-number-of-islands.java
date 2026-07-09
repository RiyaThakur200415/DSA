class Solution 
{
    public int numIslands(char[][] grid) 
    {
        int m = grid.length;
        int n = grid[0].length;
        boolean vis[][] = new boolean[m][n];
        int cnt = 0;

        for(int i = 0 ; i < m ; i++)
        {
            for(int j = 0 ; j < n ; j++)
            {
                if(vis[i][j] == false && grid[i][j] == '1')
                {
                    bfs(i , j , grid , vis);
                    cnt++;
                }
            }
        }
        return cnt;
    }

    
    class Pair
    {
        int r;
        int c;
        Pair(int r , int c)
        {
            this.r = r;
            this.c = c;
        }
    }

    void bfs(int i , int j , char grid[][] , boolean vis[][])
    {
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(i , j));

        int m = grid.length;
        int n = grid[0].length;

        while(!q.isEmpty())
        {
            Pair val = q.poll();
            int row = val.r;
            int col = val.c;
            
            //checking the posibilities of down and right
            
            //top
            if(row > 0)
            {
                if(grid[row - 1][col] == '1' && vis[row -1][col] == false)
                {
                    vis[row - 1][col] =true;
                    q.add(new Pair(row - 1 , col));
                }
            }
            //down
            if(row + 1 < m)
            {
                if(grid[row + 1][col] == '1' && vis[row + 1][col] == false)
                {
                    vis[row + 1][col] = true;
                    q.add(new Pair(row + 1 , col));
                }
                
            }

            //left
            if(col > 0)
            {
                if(grid[row][col - 1] == '1' && vis[row][col -1] == false)
                {
                    vis[row][col - 1] = true;
                    q.add(new Pair(row , col - 1));
                }
            }

            //right
            if(col + 1 < n)
            {
                if(grid[row][col + 1] == '1' && vis[row][col + 1] == false)
                {
                    vis[row][col + 1] = true;
                    q.add(new Pair(row , col + 1));
                }
            }
            
        }
    }
}