package com.java.likou.题目.树;


import java.util.ArrayList;
import java.util.Objects;

/**
 * 请考虑一棵二叉树上所有的叶子，这些叶子的值按从左到右的顺序排列形成一个 叶值序列 。
 *
 *
 *
 * 举个例子，如上图所示，给定一棵叶值序列为 (6, 7, 4, 9, 8) 的树。
 *
 * 如果有两棵二叉树的叶值序列是相同，那么我们就认为它们是 叶相似 的。
 *
 * 如果给定的两个头结点分别为 root1 和 root2 的树是叶相似的，则返回 true；否则返回 false 。
 *
 *  
 */
public class 叶子相似的树 {

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        leaf(root1, list);
        leaf(root2, list1);
        if (list.size() != list1.size())return false;
        for (int i = 0; i < list.size(); i++) {
            if (!Objects.equals(list.get(i), list1.get(i)))return false;
        }
        return true;
    }

    private void leaf(TreeNode root, ArrayList<Integer> list) {
        if (root == null)return;

        if (root.left == null && root.right == null)list.add(root.val);

        leaf(root.left, list);
        leaf(root.right, list);

    }
}
