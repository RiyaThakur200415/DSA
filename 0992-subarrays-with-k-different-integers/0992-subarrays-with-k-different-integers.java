class Solution 
{
    public int subarraysWithKDistinct(int[] nums, int k) 
    {
        return helper_fn(nums , k) - helper_fn(nums , k - 1);
    }

    static int helper_fn(int arr[] , int k)
    {
        HashMap<Integer , Integer> hm = new HashMap<>();
        int l = 0;
        int cnt = 0;

        for(int r = 0 ; r < arr.length ; r++)
        {
            hm.put(arr[r] , hm.getOrDefault(arr[r] , 0) + 1);

            while(hm.size() > k)
            {
                hm.put(arr[l] , hm.get(arr[l]) - 1);

                if(hm.get(arr[l]) == 0)
                {
                    hm.remove(arr[l]);
                }
                l++;
            }

            cnt += (r - l + 1);
        }
        return cnt;
    }
}