package com.java.likou.链表;




/**
 * 请编写一个函数，使其可以删除某个链表中给定的（非末尾）节点。传入函数的唯一参数为 要被删除的节点 。
 *
 *  
 *
 * 现有一个链表 -- head = [4,5,1,9]，它可以表示为:
 *
 *
 *
 *  
 *
 * 示例 1：
 *
 * 输入：head = [4,5,1,9], node = 5
 * 输出：[4,1,9]
 * 解释：给定你链表中值为 5 的第二个节点，那么在调用了你的函数之后，该链表应变为 4 -> 1 -> 9.
 */
public class 删除链表中的节点 {

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next  = node.next.next;
    }
}


