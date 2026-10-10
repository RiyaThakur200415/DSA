class Solution 
{
    public boolean lemonadeChange(int[] bills) 
    {
        int rup5cnt = 0;
        int rup10cnt = 0;

        for(int i = 0 ; i < bills.length ; i++)
        {
            if(bills[i] == 5)
            {
                rup5cnt++;
            }
            else if(bills[i] == 10)
            {
                if(rup5cnt == 0)
                {
                    return false;
                }
                rup5cnt--;
                rup10cnt++;
            }
            else
            {
                if(rup10cnt > 0 && rup5cnt > 0)
                {
                    rup10cnt--;
                    rup5cnt--;
                }
                else if(rup5cnt >= 3)
                {
                    rup5cnt -= 3;
                }
                else
                {
                    return false;
                }
            }
        }
        return true;
    }
}