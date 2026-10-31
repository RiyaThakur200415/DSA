class Solution 
{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        int len = nums1.length + nums2.length;

        int idx1 = (len / 2) - 1;
        int idx2 = len / 2;

        int cnt = 0;
        int ele = 0;
        int val1 = 0;
        int val2 = 0;
        int p1 = 0;
        int p2 = 0;

        while(cnt <= idx2)
        {
            if(p1 < nums1.length && (p2 >= nums2.length || nums1[p1] <= nums2[p2]))
            {
                ele = nums1[p1];
                p1++;
            }
            else
            {
                ele = nums2[p2];
                p2++;
            }

            if(cnt == idx1)
            {
                val1 = ele;
            }
            if(cnt == idx2)
            {
                val2 = ele;
            }
            cnt++;
        }

        if(len % 2 == 0)
        {
            return (double)(val1 + val2) / 2;
        }
        else
        {
            return val2;
        }
    }
}