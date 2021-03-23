package com.java.likou.剑指offer;


import com.java.likou.链表.ListNode;

/**
 *
 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。



 示例:
null
 输入: 1->2->3->4->5->NULL
 输出: 5->4->3->2->1->NULL
 */
public class 反转链表 {

    public ListNode reverseList(ListNode head) {
        if (head==null ||head.next == null )return head;
        ListNode node = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return node;
    }
    public ListNode reverseList2(ListNode head) {
        ListNode node = null;
        while (head!=null){
            ListNode next = head.next;
            head.next = node;
            node = head;
            head = next;
        }
        return node;
    }

}
