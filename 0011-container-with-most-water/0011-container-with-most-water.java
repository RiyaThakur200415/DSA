class Solution 
{
    public int maxArea(int[] height) 
    {
        int l = 0;
        int h = height.length - 1;

        int water = 0;

        while(l < h)
        {
            int sum = Math.min(height[l] , height[h]) * (h - l);

            if(height[l] <= height[h])
            {
                l++;
            }
            else
            {
                h--;
            }
            water = Math.max(water , sum);
        }
        return water;
    }
}