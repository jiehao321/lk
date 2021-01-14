package com.java.likou.题目.树;


import java.util.ArrayList;
import java.util.List;

/**
 * 给你一个树，请你 按中序遍历 重新排列树，使树中最左边的结点现在是树的根，并且每个结点没有左子结点，只有一个右子结点。
 *
 *  
 *
 * 示例 ：
 *
 * 输入：[5,3,6,2,4,null,8,1,null,null,null,7,9]
 *
 *        5
 *       / \
 *     3    6
 *    / \    \
 *   2   4    8
 *  /        / \
 * 1        7   9
 *
 * 输出：[1,null,2,null,3,null,4,null,5,null,6,null,7,null,8,null,9]
 *
 *  1
 *   \
 *    2
 *     \
 *      3
 *       \
 *        4
 *         \
 *          5
 *           \
 *            6
 *             \
 *              7
 *               \
 *                8
 *                 \
 *                  9
 */
public class 递增顺序查找树 {

    List<Integer> list = new ArrayList<>();
    public TreeNode increasingBST(TreeNode root) {

        increasing(root);
        TreeNode ans = new TreeNode(0), cur = ans;
        for(int v : list) {
            cur.right = new TreeNode(v);
            cur = cur.right;
        }

        return ans.right;
    }

    private void increasing(TreeNode root) {
        if (root == null) return;

        increasing(root.left);
        list.add(root.val);
        increasing(root.right);

    }
}
