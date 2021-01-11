package com.java.likou.题目.树;


/**
 * 给定一个二叉树，判断它是否是高度平衡的二叉树。
 *
 * 本题中，一棵高度平衡二叉树定义为：
 *
 * 一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1 。
 *
 *  
 *
 * 示例 1：
 *
 *
 * 输入：root = [3,9,20,null,null,15,7]
 * 输出：true
 *
 */
public class 平衡二叉树 {


    public boolean isBalanced(TreeNode root) {


        return dfs(root) != -1;

    }

    /**
     *
     * @param root
     * @return
     */
    private int dfs(TreeNode root) {
        // left 左边树的高度   right  右边树的高度
        int left, right;
        //如果节点 == null   是平衡树
        if (root == null) return 0;

        // 如果返回-1  ;

        if ((left = dfs(root.left)) == -1)return -1;
        if ((right = dfs(root.right)) == -1) return -1;


        return Math.abs(left - right) < 2 ? Math.max(left, right) + 1 : -1;
    }
}
