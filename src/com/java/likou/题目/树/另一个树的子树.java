package com.java.likou.题目.树;


/**
 * 给定两个非空二叉树 s 和 t，检验 s 中是否包含和 t 具有相同结构和节点值的子树。s 的一个子树包括 s 的一个节点和这个节点的所有子孙。s 也可以看做它自身的一棵子树。
 *
 * 示例 1:
 * 给定的树 s:
 *
 *      3
 *     / \
 *    4   5
 *   / \
 *  1   2
 * 给定的树 t：
 *
 *    4
 *   / \
 *  1   2
 * 返回 true，因为 t 与 s 的一个子树拥有相同的结构和节点值。
 */
public class 另一个树的子树 {


    // 给两个树,返回是否有相同的节点
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (t == null) return true;
        if (s == null) return false;

        return isSubtree(s.left, t) || isSubtree(s.right, t) || subtree(s, t);
    }

    private boolean subtree(TreeNode s, TreeNode t) {

        if (s == null && t == null)return true;
        if (s == null || t == null) return false;
        if (s.val != t.val)return false;
        return subtree(s.left, t.left) && subtree(s.right, t.right);
    }
}
