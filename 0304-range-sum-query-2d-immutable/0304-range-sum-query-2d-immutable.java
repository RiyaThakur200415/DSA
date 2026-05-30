class NumMatrix 
{
    public int mat[][];
    public NumMatrix(int[][] matrix) 
    {
        int r = matrix.length;
        int c = matrix[0].length;
        mat = new int[r][c];

        for(int i = 0 ; i < r ; i++)
        {
            for(int j = 0 ; j < c ; j++)
            {
                int top = (i > 0) ? mat[i-1][j]:0;
                int left = (j > 0) ? mat[i][j-1]:0;
                int topleft = (i >0 && j > 0) ? mat[i-1][j-1] : 0;
                mat[i][j] = matrix[i][j] + top + left - topleft;
            }
        }
        
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) 
    {
        int top = (row1 > 0) ? mat[row1-1][col2] :0;
        int left = (col1 > 0) ? mat[row2][col1-1] : 0;
        int topleft = (row1 > 0 && col1 > 0) ? mat[row1 -1][col1 - 1] : 0;
        return mat[row2][col2] - top - left + topleft;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */