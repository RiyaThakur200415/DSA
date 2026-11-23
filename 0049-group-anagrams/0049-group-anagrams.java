class Solution 
{
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        HashMap<String , ArrayList<String>> hm = new HashMap<>();

        for(String val : strs)
        {
            char ch[] = val.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);

            hm.putIfAbsent(key , new ArrayList<>());
            hm.get(key).add(val);
        }
        List<List<String>> res = new ArrayList<>(hm.values());
        return res;
    }
}