class Solution 
{
    public int findKthPositive(int[] arr, int k) 
    {
        HashSet<Integer> hs = new HashSet<>();

        for(int i = 0 ; i < arr.length ; i++)
        {
            hs.add(arr[i]);
        }

        int limit = 0;
        for(int i = 0 ; i < arr.length ; i++)
        {
            limit = Math.max(limit , arr[i]);
        }
        limit += k;

        int cnt = 0;

        for(int i = 1 ; i <= limit ; i++)
        {
            if(!hs.contains(i))
            {
                cnt++;
            }
            if(cnt == k)
            {
                return i;
            }
        }
        return -1;
    }
}