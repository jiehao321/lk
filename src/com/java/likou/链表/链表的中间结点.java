package com.java.likou.链表;


/**
 * 如果有两个中间结点，则返回第二个中间结点。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：[1,2,3,4,5]
 * 输出：此列表中的结点 3 (序列化形式：[3,4,5])
 * 返回的结点值为 3 。 (测评系统对该结点序列化表述是 [3,4,5])。
 * 注意，我们返回了一个 ListNode 类型的对象 ans，这样：
 * ans.val = 3, ans.next.val = 4, ans.next.next.val = 5, 以及 ans.next.next.next = NULL.
 */
public class 链表的中间结点 {

    public ListNode middleNode(ListNode head) {
        ListNode quick=head, low = head;
        while (quick != null && quick.next!=null){
            quick = quick.next.next;
            low = low.next;
        }
        return low;
    }
}
