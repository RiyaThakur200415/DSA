class Solution 
{
    public int totalFruit(int[] fruits) 
    {
        HashMap<Integer , Integer> hm = new HashMap<>();
        int l = 0;
        int r = 0;
        int max = 0;

        for(r = 0 ; r < fruits.length ; r++)
        {
            hm.put(fruits[r] , hm.getOrDefault(fruits[r] , 0) + 1);
           

            while(hm.size() > 2)
            {
                int fCnt = hm.get(fruits[l]);
                if(fCnt == 1)
                {
                    hm.remove(fruits[l]);
                }
                else
                {
                    hm.put(fruits[l] , fCnt - 1);
                 
                }
                l++;
            }
            max = Math.max(max , r - l + 1);
        }
        return max;
        
    }
}