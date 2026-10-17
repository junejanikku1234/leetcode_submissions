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
import java.util.*;
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
        return false;
    }

    Set<ListNode> traversed = new HashSet<>();
    ListNode temp = head;

    while (temp != null) {
        if (traversed.contains(temp)) {
            return true;
        }
        traversed.add(temp);
        temp = temp.next;
    }
    return false;
    }
}