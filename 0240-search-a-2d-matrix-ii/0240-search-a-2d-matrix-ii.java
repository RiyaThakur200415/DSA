class Solution 
{
    public boolean searchMatrix(int[][] mat, int target) 
    {
        for(int i = 0 ; i < mat.length ; i++)
        {
            if(mat[i][0] <= target && target <= mat[i][mat[i].length - 1])
            {
                boolean res = BS(mat[i] , target);
                if(res == true)
                {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean BS(int arr[] , int target)
    {
        int low = 0;
        int high = arr.length - 1;

        while(low <= high)
        {
            int mid = low + (high - low) / 2;

            if(arr[mid] == target)
            {
                return true;
            }
            else if(arr[mid] > target)
            {
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }
        return false;
    }
}