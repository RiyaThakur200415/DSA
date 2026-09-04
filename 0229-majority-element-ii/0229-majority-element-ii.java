class Solution {
    public List<Integer> majorityElement(int[] nums) 
    {
        int size = nums.length;

        HashMap<Integer , Integer> hm = new HashMap<>();
        for(int val : nums)
        {
            if(!hm.containsKey(val))
            {
                hm.put(val , 1);
            }
            else
            {
                hm.put(val , hm.get(val) + 1);
            }
        }

        int limit = (int)size / 3;

        List<Integer> res = new ArrayList<>();

        for(Map.Entry<Integer , Integer> entry : hm.entrySet())
        {
            if(entry.getValue() > limit)
            {
                res.add(entry.getKey());
            }
        }
        return res;
    }
}