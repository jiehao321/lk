package com.java.likou.题目.树.中等;

/**
 * 给你二叉树的根结点 root ，请你将它展开为一个单链表：
 *
 * 展开后的单链表应该同样使用 TreeNode ，其中 right 子指针指向链表中下一个结点，而左子指针始终为 null 。
 * 展开后的单链表应该与二叉树 先序遍历 顺序相同。
 *  
 *
 * 示例 1：
 *
 *
 * 输入：root = [1,2,5,3,4,null,6]
 * 输出：[1,null,2,null,3,null,4,null,5,null,6]
 * 示例 2：
 *
 * 输入：root = []
 * 输出：[]
 * 示例 3：
 *
 * 输入：root = [0]
 * 输出：[0]
 */
public class 二叉树展开为链表 {
    // 将树展开为链表
    public void flatten(TreeNode root) {
        if (root == null)return;
        // 展开左子树
        flatten(root.left);
        // 展开右子树
        flatten(root.right);
        // 保存右节点
        TreeNode temp = root.right;
        // 将左节点放到右节点
        root.right = root.left;
        // 右节点置为null
        root.left = null;
        // 找到最后一个右节点
        while (root.right!=null)root = root.right;
        // 将原来的右节点置为最后
        root.right = temp;
    }
}
