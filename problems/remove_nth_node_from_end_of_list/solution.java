/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        Map<Integer, ListNode> m = new HashMap<Integer, ListNode>();
        
        int position = 0;
        ListNode node = head;
        
        while(node != null) { // create an index map of the list: O(N)
            position += 1;
            m.put(position, node);
            node = node.next;
        }
        
        return remove(m, n); // update the links and return current head: 0(1)
    }
    
    private ListNode remove(Map<Integer, ListNode> m, int n) {

        int indexToRemove = m.size()-n+1;
                
        if(indexToRemove==1) // if head was removed, return new head
            return m.get(2); 
        if(indexToRemove==m.size()) // if tail removed, update new tail 
            m.get(indexToRemove-1).next = null;
        else // otherwise update intermediatelink 
            m.get(indexToRemove-1).next = m.get(indexToRemove+1);
        
        return m.get(1);
    }
    
}