package com.java.likou.题目.树.中等;


import java.util.ArrayList;
import java.util.List;

/**
 *
 给你一个二叉树，请你返回其按 层序遍历 得到的节点值。 （即逐层地，从左到右访问所有节点）。
 示例：
 二叉树：[3,9,20,null,null,15,7],

 3
 / \
 9  20
 /  \
 15   7
 返回其层序遍历结果：

 [
 [3],
 [9,20],
 [15,7]
 ]
 */
public class 二叉树的层序遍历 {

    List<List<Integer>>list = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        lev(root, 0);
        return list;
    }

    private void lev(TreeNode root, int i) {
        if (root == null)return;
        if (i>=list.size())list.add(new ArrayList<>());
        list.get(i).add(root.val);
        lev(root.left, i+1);
        lev(root.right, i+1);

    }
}
