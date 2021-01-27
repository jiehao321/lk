package com.java.likou.链表;


/**
 * 请判断一个链表是否为回文链表。
 *
 * 示例 1:
 *
 * 输入: 1->2
 * 输出: false
 * 示例 2:
 *
 * 输入: 1->2->2->1
 * 输出: true
 */
public class 回文链表 {
    public boolean isPalindrome(ListNode head) {
        ListNode quick=head, low=head;
        while (quick!=null&&quick.next!=null){
            quick = quick.next.next;
            low = low.next;
        }
        if (quick!=null){
            low = low.next;
        }
        // 链表反转
        low = reversion(low);
        quick = head;
        while (low!=null){
            if (quick.val != low.val)return false;
            quick = quick.next;
            low = low.next;
        }
        return true;
    }

    private ListNode reversion(ListNode low) {
        ListNode prv=null;
        while (low!=null){
            ListNode next = low.next;
            low.next = prv;
            prv = low;
            low = next;
        }
        return prv;
    }
}
