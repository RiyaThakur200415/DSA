class Solution 
{
    public int[] findPeakGrid(int[][] mat) 
    {
        int low = 0;
        int high = mat[0].length - 1;

        while(low <= high)
        {
            int mid = low + (high - low) / 2;

            int max[] = findMax(mat , mid);

            int val = check(mat , max);

            if(val == 0)
            {
                return max;
            }
            else if(val == 1)
            {
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }
        return new int[]{-1 , -1};
    }

    static int[] findMax(int mat[][] , int mid)
    {
        int row = mat.length;
        int res[] = new int[2];
        int max = 0;
        int idx = 0;

        for(int i = 0 ; i < row ; i++)
        {
            if(max < mat[i][mid])
            {
                max = mat[i][mid];
                idx = i;
            }
        }
        res[0] = idx;
        res[1] = mid;
        return res;
    }

    static int check(int mat[][] , int max[])
    {
        int X = max[0];
        int Y = max[1];

        if((Y == 0 || mat[X][Y] > mat[X][Y - 1]) && (Y == mat[0].length - 1 || mat[X][Y] > mat[X][Y + 1]))
        {
            return 0;
        }
        else if(Y > 0 && mat[X][Y] < mat[X][Y - 1])
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }
}