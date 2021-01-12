package com.java.likou.题目.树;


/**
 * 给定一个二叉树，计算 整个树 的坡度 。
 *
 * 一个树的 节点的坡度 定义即为，该节点左子树的节点之和和右子树节点之和的 差的绝对值 。如果没有左子树的话，左子树的节点之和为 0 ；没有右子树的话也是一样。空结点的坡度是 0 。
 *
 * 整个树 的坡度就是其所有节点的坡度之和。
 *
 *  
 *
 * 示例 1：
 *
 *
 * 输入：root = [1,2,3]
 * 输出：1
 * 解释：
 * 节点 2 的坡度：|0-0| = 0（没有子节点）
 * 节点 3 的坡度：|0-0| = 0（没有子节点）
 * 节点 1 的坡度：|2-3| = 1（左子树就是左子节点，所以和是 2 ；右子树就是右子节点，所以和是 3 ）
 * 坡度总和：0 + 0 + 1 = 1
 */
public class 二叉树的坡度 {
    int sum; // 和
    public int findTilt(TreeNode root) {
        find(root);
        return sum;
    }
    private int find(TreeNode root) {
        if (root == null)return 0; // 如果节点为null 返回 0
        int left = find(root.left); // 左边二叉树节点所有的和
        int right = find(root.right); // 右边二叉树所有节点的和
        sum += Math.abs(left - right); // 当前节点左边与右边差的绝对值
        return left + right + root.val; // 返回左右所有的和
    }
}
