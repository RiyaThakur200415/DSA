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
    public int pairSum(ListNode head) 
    {
        // To find the right middle
        ListNode slow = head;
        ListNode fast = head;
        ListNode temp = head;
        ListNode head2 = null;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;

            if(fast == null)
            {
                head2 = slow;
            }
        }

        // To reverse the 2nd half
        head2 = reverse(head2); 

        // To calculate the twin sum

        int max = Integer.MIN_VALUE;
        ListNode temp1 = head;
        ListNode temp2 = head2;

        while(temp2 != null)
        {
            int sum = 0;
            int val1 = temp1.val;
            int val2 = temp2.val;
            sum = val1 + val2;
            max = Math.max(max , sum);
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return max;
    }

    static ListNode reverse(ListNode head)
    {
        //Base Case
        if(head.next == null)
        {
            return head;
        }

        ListNode newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }
}