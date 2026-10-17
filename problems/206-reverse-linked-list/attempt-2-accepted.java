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
    public ListNode reverseList(ListNode head) {
        if(head == null) {
            return null;
        }

        if (head.next == null) {
            return head;
        }

        ListNode currentNode = head;
        ListNode prevNode = null;

        while(currentNode != null) {
            ListNode newNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = newNode;
        }

        head = prevNode;

        return head;
    }
}