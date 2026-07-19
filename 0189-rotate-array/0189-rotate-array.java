class Solution 
{
    public void rotate(int[] nums, int k) 
    {
        
        int n = nums.length;
        k = k % n;
        reverse(0 , n - 1 , nums);
        reverse(0 , k - 1 , nums);
        reverse(k , n - 1 , nums);
        
        System.out.println(Arrays.toString(nums));
    }

    static int[] reverse(int l , int r , int arr[])
    {
        while(l < r)
        {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;        
        }
        return arr;
    }
}