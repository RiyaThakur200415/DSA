class Solution 
{
    public List<Integer> spiralOrder(int[][] matrix) 
    {
        int r = matrix.length;
        int c = matrix[0].length;
        ArrayList<Integer> res = new ArrayList<>();

        int left = 0;
        int right = c - 1;
        int top = 0;
        int bottom = r - 1;

        while(top <= bottom && left <= right)
        {
            //left to right
            for(int i = left ; i <= right ; i++)
            {
                res.add(matrix[top][i]);
            }
            top++;

            //top to bottom
            if(top <= bottom)
            {
            for(int i = top ; i <= bottom ; i++)
            {
                res.add(matrix[i][right]);
            }
            right--;
            }

            //right to left
            if(left <= right && top <= bottom)
            {
                for(int i = right ; i >= left ; i--)
                {
                    res.add(matrix[bottom][i]);
                }
                bottom--;
            }
            
            //bottom to top
            if(top <= bottom && left <= right)
            {
                for(int i = bottom ; i >= top ; i--)
                {
                    res.add(matrix[i][left]);
                }
                left++;
            }
        }
        return res;
    }
}