package com.java.likou.题目.树;


/**
 *
 翻转一棵二叉树。
 */
public class 翻转二叉树 {

    public TreeNode invertTree(TreeNode root) {
        TreeNode a;
        if (root == null){
            return null;
        }

        if (root.left == null && root.right == null){
            return root;
        }
        // 反转
        a = root.left;
        root.left = root.right;
        root.right = a;

        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
