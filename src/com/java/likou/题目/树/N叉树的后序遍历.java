package com.java.likou.题目.树;


import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个 N 叉树，返回其节点值的后序遍历。
 *
 * 例如，给定一个 3叉树 :
 * 返回其后序遍历: [5,6,3,2,4,1].
 */
public class N叉树的后序遍历 {


    List<Integer> list = new ArrayList<>();
    public List<Integer> postorder(Node root) {
        if (root==null)return list;
        pre(root);
        return list;
    }

    private void pre(Node root) {
        if (root == null)return;
        for (Node child : root.children) {
            pre(child);

        }
        list.add(root.val);
    }
}
