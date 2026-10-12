class Solution 
{
    public int maximumUnits(int[][] arr, int truckSize) 
    {
        int total = 0;

        Arrays.sort(arr , (a , b) -> Integer.compare(b[1] , a[1]));

        for(int i = 0 ; i < arr.length ; i++)
        {
            int size = arr[i][0]; 
            int val = arr[i][1];

            if(size < truckSize)
            {
                total += (val * size);
                truckSize -= size;
            }
            else
            {
                total += (val * truckSize);
                break;
            }
        }
        return total;
    }
}