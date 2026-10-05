class Solution 
{
    public int characterReplacement(String s, int k) 
    {
        int freq[] = new int[26];
        int l = 0;
        int maxWindow = 0;
        int maxFreq = 0;

        for(int i = 0 ; i < s.length() ; i++)
        {
            char ch = s.charAt(i);

            //Update the Hash Table
            freq[ch - 'A']++;

            //Find the Maximum Frequency
            maxFreq = Math.max(maxFreq , freq[ch - 'A']);

            //Finding the Window Size
            int windowSize = i - l + 1;

            // Checking the replacement condition
            if((windowSize - maxFreq) > k)
            {
                freq[s.charAt(l) - 'A']--;
                l++;
            }

            windowSize = i - l + 1;
            maxWindow = Math.max(maxWindow , windowSize);
        }
        return maxWindow;
    }
}