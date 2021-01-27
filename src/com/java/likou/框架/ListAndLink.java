package com.java.likou.框架;

/**
 * @author j
 */
public class ListAndLink {


    /**
     * 数组遍历框架，典型的线性迭代结构：
     */
    void traverse(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // 迭代访问 arr[i]
        }
    }


    /**
     * 链表普通遍历
     * @param head
     */
    void traverse1(ListNode head) {
        for (ListNode p = head; p != null; p = p.next) {
            // 迭代访问 p.val
        }
    }

    /**
     * 链表迭代遍历
     * @param head
     */
    void traverse2(ListNode head) {
        // 递归访问 head.val
        traverse2(head.next);
    }


}

/** 基本的单链表节点 */
class ListNode {
    int val;
    ListNode next;
}
