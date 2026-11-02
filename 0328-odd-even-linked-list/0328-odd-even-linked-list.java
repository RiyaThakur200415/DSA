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
    public ListNode oddEvenList(ListNode head) 
    {
        ListNode evenHead = null;
        ListNode evenNext = null;
        ListNode oddHead = null;
        ListNode oddNext = null;
        ListNode temp = head;
        int i = 1;

        while(temp != null)
        {
            if(i % 2 != 0)
            {
                if(oddHead == null)
                {
                    oddHead = temp;
                    oddNext = temp;
                }
                else
                {
                    oddNext.next = temp;
                    oddNext = oddNext.next;
                }
            }
            else
            {
                if(evenHead == null)
                {
                    evenHead = temp;
                    evenNext = temp;
                }
                else
                {
                    evenNext.next = temp;
                    evenNext = evenNext.next;
                }
            }
            i++;
            temp = temp.next;
        }

        if(oddHead != null)
        {
            oddNext.next = evenHead;
        }

        if(evenHead != null)
        {
            evenNext.next = null;

        }
        return oddHead;
    }
}