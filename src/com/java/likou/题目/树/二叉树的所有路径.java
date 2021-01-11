package com.java.likou.题目.树;


import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个二叉树，返回所有从根节点到叶子节点的路径。
 * <p>
 * 说明: 叶子节点是指没有子节点的节点。
 * <p>
 * 示例:
 * <p>
 * 输入:
 * <p>
 * 1
 * /   \
 * 2     3
 * \
 * 5
 * <p>
 * 输出: ["1->2->5", "1->3"]
 * <p>
 * 解释: 所有根节点到叶子节点的路径为: 1->2->5, 1->3
 */
public class 二叉树的所有路径 {


    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        binary(root, list, "");
        return list;
    }

    private void binary(TreeNode root, List<String> list, String s) {

        if (root == null) {
            return;
        }
        String s1 = s + root.val;
        if (root.left == null && root.right == null) {
            // 到达根节点 添加进数组
            list.add(s1);
        }
        // 前序遍历
        binary(root.left, list, s1 + "->");
        binary(root.right, list, s1 + "->");
    }


}
