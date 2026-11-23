class Solution 
{
    public int[][] generateMatrix(int n) 
    {
        int mat[][] = new int[n][n];
        int val = 1;
        int left = 0;
        int right = n - 1;
        int top = 0;
        int bottom = n - 1;

        while(left <= right && top <= bottom)
        {
            //left to right
            for(int i = left  ; i <= right ; i++)
            {
                mat[top][i] = val++;
            }
            top++;

            //top to bottom
            if(top <= bottom && left <= right)
            {
                for(int i = top ; i <= bottom ; i++)
                {
                    mat[i][right] = val++;
                }
            }
            right--;

            //right to left
            if(left <= right && top <= bottom)
            {
                for(int i = right ; i >= left ; i--)
                {
                    mat[bottom][i] = val++;
                }
            }
            bottom--;

            //bottom to top
            if(left <= right && top <= bottom)
            {
                for(int i = bottom ; i >= top ; i--)
                {
                    mat[i][left] = val++;
                }
            }
            left++;
        }
        return mat;
    }
}