/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
    }

    Set<ListNode> traversed = new HashSet<>();
    ListNode temp = head;

    while (temp != null) {
        if (traversed.contains(temp)) {
            return temp;
        }
        traversed.add(temp);
        temp = temp.next;
    }
    return null;
    }
}
