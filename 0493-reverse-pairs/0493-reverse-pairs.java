class Solution 
{
    public int reversePairs(int[] nums) 
    {
        return mergeSort(nums, 0, nums.length - 1);
    }

    int mergeSort(int arr[], int low, int high)
    {
        // Base Case
        if(low >= high)
        {
            return 0;
        }

        int mid = low + (high - low) / 2;

        int cnt = 0;

        cnt += mergeSort(arr, low, mid);
        cnt += mergeSort(arr, mid + 1, high);

        cnt += merge(arr, low, mid, high);

        return cnt;
    }

    int merge(int arr[], int low, int mid, int high)
    {
        int cnt = 0;

        // Count Reverse Pairs
        int j = mid + 1;

        for(int i = low; i <= mid; i++)
        {
            while(j <= high && (long)arr[i] > 2L * arr[j])
            {
                j++;
            }

            cnt += j - (mid + 1);
        }

        // Normal Merge
        int temp[] = new int[high - low + 1];

        int i = low;
        j = mid + 1;
        int k = 0;

        while(i <= mid && j <= high)
        {
            if(arr[i] <= arr[j])
            {
                temp[k++] = arr[i++];
            }
            else
            {
                temp[k++] = arr[j++];
            }
        }

        while(i <= mid)
        {
            temp[k++] = arr[i++];
        }

        while(j <= high)
        {
            temp[k++] = arr[j++];
        }

        for(int x = 0; x < temp.length; x++)
        {
            arr[low + x] = temp[x];
        }

        return cnt;
    }
}