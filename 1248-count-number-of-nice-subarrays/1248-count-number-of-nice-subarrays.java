class Solution 
{
    public int numberOfSubarrays(int[] nums, int k) 
    {
        int temp[] = new int[nums.length];

        for(int i = 0 ; i < nums.length ; i++)
        {
            if(nums[i] % 2 == 0)
            {
                temp[i] = 0;
            }
            else
            {
                temp[i] = 1;
            }
        }

        HashMap<Integer , Integer> hm = new HashMap<>();

        int cnt = 0;
        int sum = 0;
        hm.put(0 , 1);

        for(int i = 0 ; i < temp.length ; i++)
        {
            sum += temp[i];

            int comp = sum - k;

            if(hm.containsKey(comp))
            {
                cnt += hm.get(comp);
            }

            hm.put(sum , hm.getOrDefault(sum , 0) + 1);
        }
        return cnt;
    }
}