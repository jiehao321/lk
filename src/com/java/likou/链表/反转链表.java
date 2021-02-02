package com.java.likou.链表;

public class 反转链表 {

    public ListNode reverseList(ListNode head) {
        if ( head == null || head.next == null)return head;
        ListNode listNode = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return listNode;
    }

    public ListNode reverseList2(ListNode head) {
        ListNode quick = null;
        while (head!=null){
            ListNode next = head.next;
            head.next = quick;
            quick = head;
            head = next;
        }
        return quick;
    }
}
