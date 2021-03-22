package com.java.likou.剑指offer;


import com.java.likou.链表.ListNode;

import java.util.ArrayList;

/**
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 *
 *
 *
 * 示例 1：
 *
 * 输入：head = [1,3,2]
 * 输出：[2,3,1]
 */
public class 从尾到头打印链表 {

    public int[] reversePrint(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        reverse(head, list);
        int[] ints = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ints[i] = list.get(i);
        }
        return ints;
    }

    private void reverse(ListNode head, ArrayList<Integer> list) {
        if (head == null)return;
        reverse(head.next, list);
        list.add(head.val);
    }
}
