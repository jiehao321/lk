package com.java.likou.题目.树;


/**
 * 给定二叉搜索树的根结点 root，返回值位于范围 [low, high] 之间的所有结点的值的和。
 *
 *  
 *
 * 示例 1：
 *
 *
 * 输入：root = [10,5,15,3,7,null,18], low = 7, high = 15
 * 输出：32
 */
public class 二叉搜索树的范围和 {

    int sum;

    public int rangeSumBST(TreeNode root, int low, int high) {

        rangeSum(root, low, high);

        return sum;
    }

    private void rangeSum(TreeNode root, int low, int high) {
        if (root == null)return;


        rangeSum(root.left, low, high);

        if (root.val>= low && root.val <= high)sum += root.val;

        rangeSum(root.right, low, high);
    }
}
