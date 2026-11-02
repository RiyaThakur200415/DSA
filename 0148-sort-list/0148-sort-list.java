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
        //Base Case
        if(head == null || head.next == null)
        {
            return head;
        }

        ListNode middle = findMid(head);
        ListNode leftHead = head;
        ListNode rightHead = middle.next;
        middle.next = null;

        leftHead = sortList(leftHead);
        rightHead = sortList(rightHead);

        return merge(leftHead , rightHead);
    }

    static ListNode findMid(ListNode head)
    {
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    static ListNode merge(ListNode lis1 , ListNode lis2)
    {
        ListNode temp1 = lis1;
        ListNode temp2 = lis2;
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        
        while(temp1 != null && temp2 != null)
        {
            if(temp1.val <= temp2.val)
            {
                temp.next = temp1;
                temp1 = temp1.next;
            }
            else
            {
                temp.next = temp2;
                temp2 = temp2.next;
            }
            temp = temp.next;
        }

        while(temp1 != null)
        {
            temp.next = temp1;
            temp = temp.next;
            temp1 = temp1.next;
        }

        while(temp2 != null)
        {
            temp.next = temp2;
            temp = temp.next;
            temp2 = temp2.next;
        }
        return dummy.next;
    }
}