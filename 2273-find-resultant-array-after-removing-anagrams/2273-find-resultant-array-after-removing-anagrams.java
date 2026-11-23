class Solution 
{
    public List<String> removeAnagrams(String[] words) 
    {
        List<String> res = new ArrayList<>();

        res.add(words[0]);
        char temp[] = words[0].toCharArray();
        Arrays.sort(temp);
        String comp = new String(temp);

        for(int i = 1 ; i < words.length ; i++)
        {
            String str = words[i];
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