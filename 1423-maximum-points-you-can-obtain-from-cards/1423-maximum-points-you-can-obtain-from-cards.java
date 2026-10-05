class Solution 
{
    public int maxScore(int[] arr, int k) 
    {
        int n = arr.length;
        int windowSize = n - k;

        int total = 0;

        for(int num : arr)
        {
            total += num;
        }

        int windowSum = 0;

        for(int i = 0; i < windowSize; i++)
        {
            windowSum += arr[i];
        }

        int minWindow = windowSum;

        for(int i = windowSize; i < n; i++)
        {
            windowSum += arr[i];
            windowSum -= arr[i - windowSize];

            minWindow = Math.min(minWindow, windowSum);
        }

        return total - minWindow;
    }
}