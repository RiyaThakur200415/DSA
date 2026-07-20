class Solution 
{
    public boolean checkIfPangram(String str) 
    {
        int hash[] = new int[26];

        for(int i = 0 ; i < str.length() ; i++)
        {
            char ch = str.charAt(i);
            hash[ch - 'a']++;
        }
        
        for(int i = 0 ; i < 26 ; i++)
        {
            if(hash[i] == 0)
            {
                return false;
            }
        }
        return true;
    }
}