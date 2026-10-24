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
class Solution {
    public ListNode oddEvenList(ListNode head) 
    {
        if(head == null)
        {
            return head;
        }
        ListNode dummy = new ListNode(0);
        ListNode odd = head;
        ListNode even = head.next;
        ListNode curr = dummy;
        ListNode evenHead = even; 
        while(even!=null&&even.next!=null)
        {
           curr = odd;
           odd.next = even.next;
odd = odd.next; 
           
        
            even.next = odd.next;
            curr = even;
            even = even.next;
           

        }
        odd.next = evenHead;
        curr = curr.next;
        return head;
    }
}