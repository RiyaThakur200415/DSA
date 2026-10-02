class Solution 
{
    public int[] twoSum(int[] numbers, int target) 
    {
        int idx1 = 0;
        int idx2 = 0;
        HashMap<Integer , Integer> hm = new HashMap<>();

        for(int i = 0 ; i < numbers.length ; i++)
        {
            hm.put(numbers[i] , i + 1 );
        }

        for(int i = 0 ; i < numbers.length ; i++)
        {
            int comp = target - numbers[i];

            if(hm.containsKey(comp))
            {
                idx2 = hm.get(comp);
                if (idx2 != i + 1) {
                return new int[]{i + 1, idx2};
                }
            }
        }

        return new int[]{};
        
    }
}