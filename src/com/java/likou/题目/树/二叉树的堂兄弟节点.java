package com.java.likou.题目.树;


/**
 * 在二叉树中，根节点位于深度 0 处，每个深度为 k 的节点的子节点位于深度 k+1 处。
 *
 * 如果二叉树的两个节点深度相同，但父节点不同，则它们是一对堂兄弟节点。
 *
 * 我们给出了具有唯一值的二叉树的根节点 root，以及树中两个不同节点的值 x 和 y。
 *
 * 只有与值 x 和 y 对应的节点是堂兄弟节点时，才返回 true。否则，返回 false。
 *
 *  
 *
 * 示例 1：
 *
 *
 * 输入：root = [1,2,3,4], x = 4, y = 3
 * 输出：false
 */
public class 二叉树的堂兄弟节点 {

    int xp, yp, xc, yc;

    public boolean isCousins(TreeNode root, int x, int y) {
        cousins(root.left, 1, x, y, root);
        cousins(root.right, 1, x, y, root);
        return xp != yp && xc == yc;
    }

    private void cousins(TreeNode root, int i, int x, int y, TreeNode treeNode) {
        if (root == null)return;

        if (root.val == x){
            xp = treeNode.val;
            xc = i;
        }else if (root.val == y){
            yp = treeNode.val;
            yc = i;
        }else {
            cousins(root.left, i+1, x, y, root);
            cousins(root.right, i+1, x, y, root);
        }
    }
}
