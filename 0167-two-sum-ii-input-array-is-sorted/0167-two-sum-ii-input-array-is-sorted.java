class Solution 
{
    public int[] twoSum(int[] numbers, int target) 
    {
        HashMap<Integer , Integer> hm = new HashMap<>();
        int res[] = new int[2];

        for(int i = 0 ; i < numbers.length ; i++)
        {
            int comp = target - numbers[i];

            if(hm.containsKey(comp))
            {
                res[1] = i + 1;
                res[0] = hm.get(comp) + 1;
            }
            else
            {
                hm.put(numbers[i] , i);
            }
        }
        return res;
    }
}