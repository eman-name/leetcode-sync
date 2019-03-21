/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int carry = 0;
        ListNode head = new ListNode(0), cur = head;
        
        while(l1 != null || l2 != null) {
            if(l1 != null) carry += l1.val;
            if(l2 != null) carry += l2.val;
            
            cur.next = new ListNode(carry % 10); // keep 1s place
            cur = cur.next;
            carry = carry / 10; // carry the 10s place
            
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }
        
        if(carry > 0) {
            cur.next = new ListNode(carry);
        }
        
        return head.next;   
    }
    
}