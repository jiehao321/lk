package com.java.likou.剑指offer;


/**
 * 请实现一个函数，用来判断一棵二叉树是不是对称的。如果一棵二叉树和它的镜像一样，那么它是对称的。
 *
 * 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
 *
 *     1
 *    / \
 *   2   2
 *  / \ / \
 * 3  4 4  3
 * 但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:
 *
 *     1
 *    / \
 *   2   2
 *    \   \
 *    3    3
 *
 *  
 *
 * 示例 1：
 *
 * 输入：root = [1,2,2,3,4,4,3]
 * 输出：true
 */
public class 对称的二叉树 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null)return true;
        return isComp(root.left, root.right);
    }

    private boolean isComp(TreeNode left, TreeNode right) {
        if (left==null && right == null)return true;
        else if (left == null || right == null)return false;
        else if (left.val != right.val)return false;

        return isComp(left.left, right.right) && isComp(left.right, right.left);
    }

}
