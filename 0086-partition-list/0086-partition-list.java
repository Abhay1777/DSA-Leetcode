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
    public ListNode partition(ListNode head, int x) 
    {
        ListNode dummyS = new ListNode(0);
        ListNode dummyB = new ListNode(0);

ListNode curr = head;
        ListNode small = dummyS;
        ListNode big = dummyB;
        while(curr!=null)
        {
            if(curr.val<x)
            {
              small.next = curr;
                small = small.next;
            }
            else{
                    big.next = curr;
                    big = big.next;
            }
            curr = curr.next;
        }
        big.next= null;
        small.next = dummyB.next;
        
        return dummyS.next;
    }
}