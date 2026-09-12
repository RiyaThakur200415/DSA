class Solution 
{
    public String frequencySort(String s) 
    {
        HashMap<Character , Integer> hm = new HashMap<>();

        for(int i = 0 ; i < s.length() ; i++)
        {
            char ch = s.charAt(i);
            hm.put(ch , hm.getOrDefault(ch , 0) + 1);
        }

        //Creating a array of list of character type

        List<Character>[] arr= new List[s.length() + 1];

        for(Character key : hm.keySet())
        {
            int freq = hm.get(key);

            if(arr[freq] == null)
            {
                arr[freq] = new ArrayList<>();
            }
            arr[freq].add(key);
        }


        StringBuilder ans = new StringBuilder();
        for(int i = arr.length - 1 ; i >= 0 ; i--)
        {
            if(arr[i] != null)
            {
                for(char ch : arr[i])
                {
                    for(int j = 0 ; j < hm.get(ch) ; j++)
                    {
                        ans.append(ch);
                    }
                }
            }
        }
        return ans.toString();
    }
}