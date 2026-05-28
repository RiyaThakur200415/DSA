import java.util.*;
class Solution 
{
    public static int[] twoSum(int[] nums, int target) 
    {
        int n=nums.length;
        int result[]=new int[2];
        for(int i=0;i<n;i++)
        {
            for(int j=1+i;j<n;j++)
            {
                int sum=nums[i]+nums[j];
                if(sum==target)
                {
                    int fidx=i;
                    int sidx=j;
                    result[0]=fidx;
                    result[1]=sidx;
                }
            }
        }
        
        return result;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        System.out.println(twoSum(nums,target));
    }
}