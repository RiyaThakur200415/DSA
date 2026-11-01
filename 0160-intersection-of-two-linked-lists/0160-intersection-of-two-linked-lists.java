/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution 
{
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) 
    {
        ListNode tempA = headA;
        ListNode tempB = headB;

        int lengthA = 0;
        while(tempA != null)
        {
            lengthA++;
            tempA = tempA.next;
        }

        int lengthB = 0;
        while(tempB != null)
        {
            lengthB++;
            tempB = tempB.next;
        }

        tempA = headA;
        tempB = headB;

        int lim = 0;
        if(lengthA > lengthB)
        {
            lim = lengthA - lengthB;

            for(int i = 1 ; i <= lim ; i++)
            {
                tempA = tempA.next;
            }
        }
        else
        {
            lim = lengthB - lengthA;

            for(int i = 1 ; i <= lim ; i++)
            {
                tempB = tempB.next;
            } 
        }

        while(tempA != null && tempB != null)
        {
            if(tempA == tempB)
            {
                return tempA;
            }
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return null;
    }
}