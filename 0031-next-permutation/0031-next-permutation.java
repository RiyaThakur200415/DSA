class Solution 
{
    public void nextPermutation(int[] nums) 
    {
        int n = nums.length;
        int idx = -1;
        //Step 1: Finding the break point

        for(int i = n - 2 ; i >= 0 ; i--)
        {
            if(nums[i] < nums[i + 1])
            {
                idx = i;
                break;
            }
        }

        //Base Case: If there exists no break point
        if(idx == -1)
        {
            reverse(nums , 0 , n - 1);
            System.out.println(Arrays.toString(nums));
            return;
        }

        //Step 2: Find the the next element and swaping it

        for(int i = n - 1 ; i > idx ; i--)
        {
            if(nums[i] > nums[idx])
            {
                int temp = nums[i];
                nums[i] = nums[idx];
                nums[idx] = temp;
                break;
            }
        }

        //Step 3: Sorting the rest section

        reverse(nums , idx + 1 , n - 1);
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