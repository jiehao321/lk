package com.java.likou.链表;


/**
 * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 *
 * 进阶：你能尝试使用一趟扫描实现吗？
 *
 *  
 *
 * 示例 1：
 *
 *
 * 输入：head = [1,2,3,4,5], n = 2
 * 输出：[1,2,3,5]
 * 示例 2：
 *
 * 输入：head = [1], n = 1
 * 输出：[]
 * 示例 3：
 *
 * 输入：head = [1,2], n = 1
 * 输出：[1]
 */
public class 删除链表的倒数第N个结点 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null)return null;
        ListNode listNode = new ListNode(0);
        listNode.next = head;
        ListNode quick, low;
        quick = low = listNode;
        for (int i = 0; i < n; i++) quick = quick.next;
        while (quick!=null&& quick.next!=null){
            quick = quick.next;
            low = low.next;
        }
        low.next = low.next.next;
        return listNode.next;
    }
}
