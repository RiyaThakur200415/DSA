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
    public ListNode reverseKGroup(ListNode head, int k) 
    {
        ListNode temp = head;
        ListNode kthNode = null;
        ListNode prevNode = null;
        ListNode nextNode = null;

        while(temp != null)
        {
            kthNode = fingKthNode(temp , k);
            
            if(kthNode == null)
            {
                if(prevNode != null)
                {
                    prevNode.next = temp;
                    break;
                }
            }

            nextNode = kthNode.next;
            kthNode.next = null;

            ListNode newHead = reverse(temp);

            if(temp == head)
            {
                head = newHead;
            }
            else
            {
                prevNode.next = newHead;
            }
        
            prevNode = temp;
            temp = nextNode;
        }
        return head;
    }

    static ListNode fingKthNode(ListNode head , int k)
    {
        ListNode temp = head;

        for(int i = 1 ; i < k && temp != null ; i++)
        {
            temp = temp.next;
        }
        return temp;
    }

    static ListNode reverse(ListNode head)
    {
        if(head == null || head.next == null)
        {
            return head;
        }

        ListNode newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        
       return newHead;
    }
}