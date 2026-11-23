class Solution 
{
    public List<String> removeAnagrams(String[] words) 
    {
        List<String> res = new ArrayList<>();
        String comp = "";

        for(String str : words)
        {
            char ch[] = str.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            
            if(!comp.equals(key))
            {
                res.add(str);
                comp = key;
            }
        }
        return res;
    }
}