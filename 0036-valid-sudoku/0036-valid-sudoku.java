class Solution 
{
    public boolean isValidSudoku(char[][] board) 
    {
        for(int i = 0 ; i < 9 ; i++)
        {
            for(int j = 0 ; j < 9 ; j++)
            {
                if(board[i][j] != '.')
                {
                    if(!isSafe(board , i , j))
                    {
                        return false;
                    }
                    
                }
            }
        }
       return true;
    }

    static boolean isSafe(char[][] board , int row , int col)
    {
        int r = row;
        int c = col;
        char val = board[r][c];

        //Row 
        for(int i = 0 ; i < 9 ; i++)
        {
            if(i == c)
            {
                continue;
            }
            if(board[r][i] == val)
            {
                return false;
            }
        }

        //Column
        for(int i = 0 ; i < 9 ; i++)
        {
            if(i == r)
            {
                continue;
            }
            if(board[i][c] == val)
            {
                return false;
            }
        }

        //Grid
        for(int i = 0 ; i < 9 ; i++)
        {
            int newRow = 3 * (row / 3) + i / 3;
            int newCol = 3 * (col / 3) + i % 3;

            if(newRow == r && newCol == c)
            {
                continue;
            }
            if(board[newRow][newCol] == val)
            {
                return false;
            }
        }
        return true;
    }
}