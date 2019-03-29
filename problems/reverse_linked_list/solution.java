/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        //return inlineReverseList(head);
        return recursiveReverseList(head, null);
    }
    
    private ListNode inlineReverseList(ListNode head) {
        
        ListNode prev = null;
        ListNode cur = head;
        ListNode next = null;
        if(cur != null) next = head.next;
        
        while(cur != null) {
            cur.next = prev;
            prev = cur;
            cur = next;
            if(cur != null) next = next.next;
        }
        
        return prev;
    }

    private ListNode recursiveReverseList(ListNode cur, ListNode prev) {
        if(cur == null) return null;
        
        if(cur.next == null) { // tail -> head
            cur.next = prev;
            return cur; 
        }
        
        
        ListNode next = cur.next;
        cur.next = prev;
        return recursiveReverseList(next, cur);
        
    }
    
}