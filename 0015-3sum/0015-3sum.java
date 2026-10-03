class Solution 
{
    public List<List<Integer>> threeSum(int[] arr) 
    {
        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(arr);

        for(int i = 0; i < arr.length - 2; i++)
        {
            // Skip duplicate first elements
            if(i > 0 && arr[i] == arr[i - 1])
            {
                continue;
            }

            int l = i + 1;
            int r = arr.length - 1;

            while(l < r)
            {
                int sum = arr[i] + arr[l] + arr[r];

                if(sum == 0)
                {
                    List<Integer> lis = new ArrayList<>();

                    lis.add(arr[i]);
                    lis.add(arr[l]);
                    lis.add(arr[r]);

                    res.add(lis);

                    // Skip duplicate left values
                    while(l < r && arr[l] == arr[l + 1])
                    {
                        l++;
                    }

                    // Skip duplicate right values
                    while(l < r && arr[r] == arr[r - 1])
                    {
                        r--;
                    }

                    l++;
                    r--;
                }
                else if(sum < 0)
                {
                    l++;
                }
                else
                {
                    r--;
                }
            }
        }

        return res;
    }
}