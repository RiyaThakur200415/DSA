class Solution 
{
    public int[][] merge(int[][] intervals) 
    {
        List<int[]> res = new ArrayList<>();
        Arrays.sort(intervals , (a , b) -> Integer.compare(a[0] , b[0]));

        int n = intervals.length;

        int st = intervals[0][0];
        int ed = intervals[0][1];

        if(n == 0)
        {
            return new int[0][2];
        }

        for(int i = 1 ; i < n ; i++)
        {
            if(intervals[i][0] <= ed)
            {
                ed = Math.max(ed , intervals[i][1]);
            }
            else
            {
                res.add(new int[]{st , ed});
                st = intervals[i][0];
                ed = intervals[i][1];
            }
        }
        res.add(new int[]{st, ed});

        return res.toArray(new int[res.size()][]);
    }
}