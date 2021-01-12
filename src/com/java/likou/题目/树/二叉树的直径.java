package com.java.likou.题目.树;


/**
 * 给定一棵二叉树，你需要计算它的直径长度。
 * 一棵二叉树的直径长度是任意两个结点路径长度中的最大值。
 * 这条路径可能穿过也可能不穿过根结点。
 */
public class 二叉树的直径 {
    int max; // 最大值
    public int diameterOfBinaryTree(TreeNode root) {
        diameter(root);
        return max;
    }
    private int diameter(TreeNode root) {
        if (root == null) return 0; // 为null深度为0
        int left = diameter(root.left); // 左节点深度
        int right = diameter(root.right); // 右节点深度
        max = Math.max(max, left + right); // 取左右节点深度的和
        return Math.max(left, right) + 1; // 返回左右节点深度的最大值
    }
}
