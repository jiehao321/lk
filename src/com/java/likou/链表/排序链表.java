package com.java.likou.链表;


import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 给你链表的头结点 head ，请将其按 升序 排列并返回 排序后的链表 。
 *
 * 进阶：
 *
 * 你可以在 O(n log n) 时间复杂度和常数级空间复杂度下，对链表进行排序吗？
 *  
 *
 * 示例 1：
 *
 *
 * 输入：head = [4,2,1,3]
 * 输出：[1,2,3,4]
 * 示例 2：
 *
 *
 * 输入：head = [-1,5,3,4,0]
 * 输出：[-1,0,3,4,5]
 */
public class 排序链表 {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null)return head;
        ListNode listNode = new ListNode(0);
        listNode.next = head;
        List<Integer> list = new ArrayList<>();
        list.add(head.val);
        while (head.next!=null){
            list.add(head.next.val);
            head = head.next;
        }
        head = listNode.next;
        Collections.sort(list);
        for (Integer integer : list) {
            head.val = integer;
            head = head.next;
        }
        return listNode.next;
    }
}
