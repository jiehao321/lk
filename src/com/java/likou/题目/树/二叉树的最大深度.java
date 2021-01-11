package com.java.likou.题目.树;


/**
 * 给定一个二叉树，找出其最大深度。
 *
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 *
 * 说明: 叶子节点是指没有子节点的节点
 */
public class 二叉树的最大深度 {


    // 给一个节点,  返回最大深度
    public int maxDepth(TreeNode root) {

        if (root == null){
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        // 取左右两边最大值 加上节点本身
        return Math.max(left, right) + 1;
    }
}
