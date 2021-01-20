package com.java.likou.题目.树.中等;


/**
 * 给定一个二叉树，根节点为第1层，深度为 1。在其第 d 层追加一行值为 v 的节点。
 *
 * 添加规则：给定一个深度值 d （正整数），针对深度为 d-1 层的每一非空节点 N，为 N 创建两个值为 v 的左子树和右子树。
 *
 * 将 N 原先的左子树，连接为新节点 v 的左子树；将 N 原先的右子树，连接为新节点 v 的右子树。
 *
 * 如果 d 的值为 1，深度 d - 1 不存在，则创建一个新的根节点 v，原先的整棵树将作为 v 的左子树。
 *
 * 示例 1:

 */
public class 在二叉树中增加一行 {

    int a, b;

    public TreeNode addOneRow(TreeNode root, int v, int d) {
        a = v;
        b = d-1;
        add(root, 0);
        return root;
    }

    private void add(TreeNode root, int i) {
        if (root == null)return;
        if (b == i){
            TreeNode left = root.left;
            TreeNode right = root.right;
            root.left = new TreeNode(a);
            root.right = new TreeNode(a);
            root.left.left = left;
            root.right.right = right;
            return;
        }
        add(root.left, i+1);
        add(root.right, i+1);
    }
}
