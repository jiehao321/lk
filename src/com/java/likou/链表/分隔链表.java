package com.java.likou.链表;

import java.util.ArrayList;

/**
 * 给你一个链表的头节点 head 和一个特定值 x ，请你对链表进行分隔，使得所有 小于 x 的节点都出现在 大于或等于 x 的节点之前。
 *
 * 你应当 保留 两个分区中每个节点的初始相对位置。
 *
 *  
 *
 * 示例 1：
 *
 *
 * 输入：head = [1,4,3,2,5,2], x = 3
 * 输出：[1,2,2,4,3,5]
 * 示例 2：
 *
 * 输入：head = [2,1], x = 2
 * 输出：[1,2]
 */
public class 分隔链表 {
    public ListNode partition(ListNode head, int x) {
        if (head ==null || head.next == null)return head;
        ListNode node_l = new ListNode(Integer.MIN_VALUE);
        ListNode node_r = new ListNode(0);
        ListNode node_d = new ListNode(0);
        node_l.next = head;
        ListNode p=node_l, q = node_r, d = node_d;
        while (p!=null){
            if (p.val < x){
                q.next = new ListNode(p.val);
                q = q.next;
                p = p.next;
            }
            else {
                d.next = new ListNode(p.val);
                d = d.next;
                p = p.next;
            }
        }
        q.next = node_d.next;
        return node_r.next.next;
    }

}
