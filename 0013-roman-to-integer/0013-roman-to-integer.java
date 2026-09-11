class Solution 
{
    public int romanToInt(String s) 
    {
        HashMap<Character , Integer> hm = new HashMap<>();
        hm.put('I' , 1);
        hm.put('V' , 5);
        hm.put('X' , 10);
        hm.put('L' , 50);
        hm.put('C' , 100);
        hm.put('D' , 500);
        hm.put('M' , 1000);

        int ans = 0;
        char ch = s.charAt(s.length() - 1);
        int val = hm.get(ch);
        ans = val;

        for(int i = s.length() - 2 ; i >= 0 ; i--)
        {
            char alpha = s.charAt(i);
            int value = hm.get(alpha);
            if(val > value)
            {
                ans -= value;
            }
            else
            {
                ans += value;
            }
            val = value;
        }
        return ans;
    }
}