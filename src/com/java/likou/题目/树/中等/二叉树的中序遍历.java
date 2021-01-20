package com.java.likou.题目.树.中等;




import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个二叉树的根节点 root ，返回它的 中序 遍历。
 *
 *
 *
 * 示例 1：
 *
 *
 * 输入：root = [1,null,2,3]
 * 输出：[1,3,2]
 */
public class 二叉树的中序遍历 {

    List<Integer> list = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        inord(root);
        return list;
    }

    private void inord(TreeNode root) {
        if (root == null)return;
        inord(root.left);
        list.add(root.val);
        inord(root.right);
    }
}
