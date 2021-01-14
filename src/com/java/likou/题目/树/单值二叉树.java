package com.java.likou.题目.树;


/**
 *
 如果二叉树每个节点都具有相同的值，那么该二叉树就是单值二叉树。

 只有给定的树是单值二叉树时，才返回 true；否则返回 false。



 示例 1：



 输入：[1,1,1,1,1,null,1]
 输出：true
 */
public class 单值二叉树 {

    public boolean isUnivalTree(TreeNode root) {
        if (root ==null)return true;
        return tr(root, root.val);
    }

    private Boolean tr(TreeNode root, int val) {
        if (root == null)return true;
        if (root.val != val) return false;
        return tr(root.left, val) && tr(root.right, val);
    }
}
