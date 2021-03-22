package com.java.likou.链表;


/**
 * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 1->1->2
 * 输出: 1->2
 * 示例 2:
 * 111
 * 输入: 1->1->2->3->3
 * 输出: 1->2->3
 */
public class 删除排序链表中的重复元素 {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode node = new ListNode(0);
        node.next = head;
        while (head != null && head.next != null) {
            if (head.val == head.next.val) {
                head.next = head.next.next;
            } else
                head = head.next;
        }
        return node.next;
    }


}
