class Solution 
{
    public int eraseOverlapIntervals(int[][] intervals) 
    {
        Arrays.sort(intervals , (a , b) -> Integer.compare(a[1] , b[1]));

        int cnt = 0;
        int ed = Integer.MIN_VALUE;

        int n = intervals.length;

        for(int i = 0 ; i < n ; i++)
        {
            if(intervals[i][0] < ed)
            {
                cnt++;
            }
            else
            {
                ed = intervals[i][1];
            }
        }
        return cnt;
    }
}