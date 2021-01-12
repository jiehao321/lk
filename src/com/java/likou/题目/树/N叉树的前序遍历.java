package com.java.likou.题目.树;


import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个 N 叉树，返回其节点值的前序遍历。
 *
 * 例如，给定一个 3叉树 :
 * 返回其前序遍历: [1,3,5,6,2,4]。
 */
public class N叉树的前序遍历 {

    List<Integer> list = new ArrayList<>();
    public List<Integer> preorder(Node root) {
        if (root==null)return list;
        pre(root);
        return list;
    }

    private void pre(Node root) {
        if (root == null)return;
        list.add(root.val);
        for (Node child : root.children) {
            pre(child);
        }
    }
}
