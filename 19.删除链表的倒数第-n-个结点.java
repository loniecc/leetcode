/*
 * @lc app=leetcode.cn id=19 lang=java
 *
 * [19] 删除链表的倒数第 N 个结点
 */

// @lc code=start
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pre = new ListNode();
        pre.next = head;
        ListNode newHead = pre;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null) {
            if (n == 0) {
                slow = slow.next;
                pre = pre.next;
            } else {
                n--;
            }
            fast = fast.next;
        }
        pre.next = slow.next;
        return newHead.next;
    }
}
// @lc code=end
