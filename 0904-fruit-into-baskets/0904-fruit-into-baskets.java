class Solution 
{
    public int totalFruit(int[] fruits) 
    {
        HashMap<Integer , Integer> hm = new HashMap<>();
        int l = 0;
        int cnt = 0;

        for(int r = 0 ; r < fruits.length ; r++)
        {
            int val = fruits[r];;
            hm.put(val , hm.getOrDefault(val , 0) + 1);

            while(hm.size() > 2)
            {
                int lval = fruits[l];

                hm.put(lval , hm.get(lval) - 1);

                if(hm.get(lval) == 0)
                {
                    hm.remove(lval);
                }
                l++;
            }

            if(hm.size() <= 2)
            {
                cnt = Math.max(cnt , r - l + 1);
            }
        }
        return cnt;
    }
}