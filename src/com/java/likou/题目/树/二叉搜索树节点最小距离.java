package com.java.likou.题目.树;


/**
 * 给定一个二叉搜索树的根节点 root，返回树中任意两节点的差的最小值。
 *
 *  
 *
 * 示例：
 *
 * 输入: root = [4,2,6,1,3,null,null]
 * 输出: 1
 * 解释:
 * 注意，root是树节点对象(TreeNode object)，而不是数组。
 *
 * 给定的树 [4,2,6,1,3,null,null] 可表示为下图:
 *
 *           4
 *         /   \
 *       2      6
 *      / \
 *     1   3
 *
 * 最小的差值是 1, 它是节点1和节点2的差值, 也是节点3和节点2的差值。
 *  
 *
 * 注意：
 *
 * 二叉树的大小范围在 2 到 100。
 * 二叉树总是有效的，每个节点的值都是整数，且不重复。
 */
public class 二叉搜索树节点最小距离 {

    TreeNode node;
    int i = Integer.MAX_VALUE;

    public int minDiffInBST(TreeNode root) {
        min(root);
        return i;
    }

    private void min(TreeNode root) {
        if (root == null) return;
        min(root.left);
        if (node != null){
            int b = Math.abs(root.val - node.val);
            if ( b < i )i = b;
        }
        node = root;
        min(root.right);
    }
}
