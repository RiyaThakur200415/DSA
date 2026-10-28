class Solution 
{
    public int minDays(int[] arr, int m, int k) 
    {
        //Base Case
        if((long)m * k > arr.length)
        {
            return -1;
        }

        int low = 1;
        int high = 0;
        for(int i = 0 ; i < arr.length ; i++)
        {
            high = Math.max(arr[i] , high);
        }

        int ans = high;

        while(low <= high)
        {
            int mid = low + (high - low) / 2;

            boolean val = canMake(arr , mid , m , k);
            if(val == true)
            {
                ans = mid;
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }
        return ans;
    }

    static boolean canMake(int arr[] , int day , int m , int k)
    {
        int cnt = 0;
        int bou = 0;

        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i] <= day)
            {
                cnt++;
                if(cnt == k)
                {
                    bou++;
                    cnt = 0;
                }
            }
            else
            {
                cnt = 0;
            }
        }
        if(bou >= m)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}