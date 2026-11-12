class Solution 
{
    public int minBitFlips(int start, int goal) 
    {
        int val = start ^ goal;
        
        return Integer.bitCount(val);
    }
}