package com.java.likou.剑指offer;


import com.java.likou.链表.ListNode;

/**
 * 输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的。
 *
 * 示例1：
 *
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 * 1134  24
 *
 */
public class 合并两个排序的链表 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null)return l2;
        if (l2 == null)return l1;
        ListNode node = new ListNode(0);
        ListNode pre = node;
        while (l1!=null && l2!=null){
            if (l1.val <=l2.val){
                pre.next = l1;
                l1 = l1.next;
            }else {
                pre.next = l2;
                l2 = l2.next;
            }
            pre = pre.next;
        }
        pre.next = l1!=null?l1:l2;
        return node.next;
    }
}
