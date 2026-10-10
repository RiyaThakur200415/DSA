class Solution 
{
    public int maxScore(int[] arr, int k) 
    {
        int lsum = 0;
        int rsum = 0;
        int res = 0;

        for(int i = 0 ; i < k ; i++)
        {
            lsum += arr[i];
        }
        res = lsum;

        int l = k - 1;
        int r = arr.length - 1;

        for(int i = 0 ; i < k ; i++)
        {
            lsum -= arr[l];
            l--;
            rsum += arr[r];
            r--;

            int sum = lsum + rsum;

            res = Math.max(res , sum);
        }
        return res;
    }
}