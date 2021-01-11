package com.java.likou.kuangjia;


import javax.swing.tree.TreeNode;

/**
 * @author j
 */
public class TreeNode1 {
    void traverse(TreeNode2 root) {
        // 前序遍历
        traverse(root.left);
        // 中序遍历
        traverse(root.right);
        // 后续遍历
    }


    void traverse3(TreeNode3 root) {
        for (TreeNode3 child : root.children)
            traverse3(child);
    }

}

/* 基本的二叉树节点 */
class TreeNode2 {
    int val;
    TreeNode2 left, right;
}

/* 基本的 N 叉树节点 */
class TreeNode3 {
    int val;
    TreeNode3[] children;
}


