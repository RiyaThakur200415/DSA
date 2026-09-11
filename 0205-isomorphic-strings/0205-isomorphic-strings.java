class Solution 
{
    public boolean isIsomorphic(String s, String t) 
    {
        //Base Case
        if(s.length() != t.length())
        {
            return false;
        }

        HashMap<Character , Character> hm = new HashMap<>();
        
        for(int i = 0 ; i < s.length() ; i++)
        {
            char schar = s.charAt(i);
            char tchar = t.charAt(i);

            if(!hm.containsKey(schar))
            {
                if(!hm.containsValue(tchar))
                {
                    hm.put(schar , tchar);
                }
                else
                {
                    return false;
                }
            }
            else
            {
                char val = hm.get(schar);
                if(val != tchar)
                {
                    return false;
                }

            }
        } 
        return true; 
    }
}