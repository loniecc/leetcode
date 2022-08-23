/*
 * @lc app=leetcode.cn id=203 lang=java
 *
 * [203] 移除链表元素
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
    public ListNode removeElements(ListNode head, int val) {
        if(null == head){
            return head;
        }
        ListNode preHead = new ListNode(-1);
        preHead.next = head;
        ListNode tmp = head;
        ListNode pointer = preHead;
        while(tmp != null){
            if(val == tmp.val){
                pointer.next = tmp.next;
            }else{
                pointer = tmp;
            }
            tmp = tmp.next;
        }
        return preHead.next;
    }
}
// @lc code=end

