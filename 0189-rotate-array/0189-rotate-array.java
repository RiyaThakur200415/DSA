class Solution 
{
    public void rotate(int[] nums, int k) 
    {
        k = k % nums.length;
        reverse(nums , 0 , nums.length - 1);
        reverse(nums , 0 , k - 1);
        reverse(nums , k , nums.length - 1);
        
        System.out.println(Arrays.toString(nums));
    }

    static int[] reverse(int arr[] , int l , int r)
    {
        while(l <= r)
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