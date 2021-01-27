package com.java.likou.链表;

public class 返回倒数第k个节点 {

    public int kthToLast(ListNode head, int k) {
        ListNode quick = head, slow=head;
        for (int i = 0; i < k; i++) {
            quick = quick.next;
        }
        while (quick != null){
            quick = quick.next;
            slow = slow.next;
        }
        return slow.val;
    }
}
