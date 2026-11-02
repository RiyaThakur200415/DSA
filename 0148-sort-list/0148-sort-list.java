/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution 
{
    public ListNode sortList(ListNode head) 
    {
        // Calculating the size of the LL
        int size = 0;
        ListNode temp = head;

        while(temp != null)
        {
            size++;
            temp = temp.next;
        }
        
        //Creation and inserting the values in a array 
        
        temp = head;
        int arr[] = new int[size];
        for(int i = 0 ; i < size ; i++)
        {
            arr[i] = temp.val;
            temp = temp.next;
        }

        //Sorting the array

        Arrays.sort(arr);

        //Replacing the values of the given LL in sorted order

        temp = head;
        int idx = 0;
        while(temp != null)
        {
            int value = arr[idx];
            temp.val = value;
            idx++;
            temp = temp.next;
        }
        return head;
    }
}