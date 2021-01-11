package com.java.likou.题目.二叉树;


/**
 * 给定一个二叉树，检查它是否是镜像对称的。
 */
public class 对称二叉树 {

    public boolean isSymmetric(TreeNode root) {
        return isIdentical(root, root);
    }

    // 比较两个节点是否相同
    private boolean isIdentical(TreeNode root, TreeNode root1) {
        // 两个节点如果都为空, 返回Ture
        if (root == null && root1 == null){
            return true;
        }else if (root == null || root1 == null){
            // 两个节点其中一个为空  另一个不为空,返回False
            return false;
        }else if (root.val != root1.val){
            // 两个节点的值不相等  返回False
            return false;
        }
        // 进入下次节点比较
        return isIdentical(root.left, root1.right) && isIdentical(root.right, root1.left);
    }


}


