class Solution 
{
    public void solveSudoku(char[][] board) 
    {
        solveSudoko(board);
    }

    boolean solveSudoko(char board[][])
    {
        for(int i = 0 ; i < 9 ; i++)
        {
            for(int j = 0 ; j < 9 ; j++)
            {
                if(board[i][j] == '.')
                {
                    for(char c = '1' ; c <= '9' ; c++)
                    {
                        if(isSafe(board , i , j , c))
                        {
                            board[i][j] = c;
                            if(solveSudoko(board))
                            {
                                return true;
                            }
                            else
                            {
                                board[i][j] = '.';
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    static boolean isSafe(char board[][] , int row , int col , char ch)
    {
        int r = row;
        int c = col;

        for(int i = 0 ; i < 9 ; i++)
        {
            //row
            if(board[r][i] == ch)
            {
                return false;
            }

            //column
            if(board[i][c] == ch)
            {
                return false;
            }

            //grid
            if(board[3 * (r / 3) + i / 3][3 * (c / 3) + i % 3] == ch)
            {
                return false;
            }
        }
        return true;
    }
}