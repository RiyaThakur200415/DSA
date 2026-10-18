class Solution 
{
    public int[][] insert(int[][] intervals, int[] newInterval) 
    {
        List<int[]> res = new ArrayList<>();
        
        int i = 0;
        int n = intervals.length;

        //To put all the smaller range 
        while(i < n && intervals[i][1] < newInterval[0])
        {
            res.add(intervals[i]);
            i++;
        }
        
        //To put the overlapping part
        while(i < n && intervals[i][0] <= newInterval[1])
        {
            newInterval[0] = Math.min(intervals[i][0] , newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1] , newInterval[1]);
            i++;
        }

        res.add(newInterval);

        //To put the ranges that are greater
        while(i < n)
        {
            res.add(intervals[i]);
            i++;
        }
        return res.toArray(new int[res.size()][]);
    }
}