package com.java.likou.题目.树;


/**
 *
 给你一棵所有节点为非负值的二叉搜索树，请你计算树中任意两节点的差的绝对值的最小值。



 示例：

 输入：

 1
 \
 3
 /
 2

 输出：
 1

 解释：
 最小绝对差为 1，其中 2 和 1 的差的绝对值为 1（或者 2 和 3）。
 */
public class 二叉搜索树的最小绝对差 {
    // 二叉搜索树用中序排序

    TreeNode prv; // 前一个节点
    int min = Integer.MAX_VALUE; // 初始化min值

    public int getMinimumDifference(TreeNode root) {
        minDiffer(root);
        return min;
    }

    private void minDiffer(TreeNode root) {
        // 如果节点为null, 直接返回
        if (root == null)return;


        minDiffer(root.left);
        // 中序保证顺序
        if (prv != null){
            // 将当前节点与前一个节点比较
            min = Math.min(min, Math.abs(root.val - prv.val));
        }
        prv = root;

        minDiffer(root.right);
    }
}
