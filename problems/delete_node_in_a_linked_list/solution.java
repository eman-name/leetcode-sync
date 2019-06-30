/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode cur = node;
        ListNode next = node.next;
        
        while(true) {
            cur.val = next.val;
            if(next.next == null) {cur.next = null; break;}
            cur = next;
            next = next.next;
        }
    }
}