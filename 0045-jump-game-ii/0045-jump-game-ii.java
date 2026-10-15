class Solution 
{
    public int jump(int[] nums) 
    {
        int cnt = 0;
        int l = 0;
        int r = 0;

        while(r < nums.length - 1)
        {
            int fartest = 0;
            for(int i = l ; i <= r ; i++)
            {
                fartest = Math.max(fartest , i + nums[i]);
            }
            l = r + 1;
            r = fartest;
            cnt++;
        }
        return cnt;
    }
}