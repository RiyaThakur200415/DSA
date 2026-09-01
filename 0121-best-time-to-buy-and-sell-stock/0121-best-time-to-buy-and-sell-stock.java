class Solution 
{
    public int maxProfit(int[] prices) 
    {
        int i = 0;
        int j = 0;
        int maxDiff = Integer.MIN_VALUE;
        while(j < prices.length)
        {
            if(prices[i] > prices[j])
            {
                i = j;
                j++;
            }
            else
            {
                int currDiff = prices[j] - prices[i];
                maxDiff = Math.max(maxDiff , currDiff);
                j++;
            }
        }
        return maxDiff;
    }
}