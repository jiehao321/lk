package com.java.likou.剑指offer;


import java.util.ArrayList;
import java.util.List;

/**
 * 从上到下按层打印二叉树，同一层的节点按从左到右的顺序打印，每一层打印到一行。
 *
 *  
 *
 * 例如:
 * 给定二叉树: [3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回其层次遍历结果：
 *
 * [
 *   [3],
 *   [9,20],
 *   [15,7]
 * ]
 */
public class 从上到下打印二叉树II {

    public List<List<Integer>> levelOrder(TreeNode root) {
        ArrayList<List<Integer>> list = new ArrayList<>();
        level(root, 1, list);
        return list;
    }

    private void level(TreeNode root, int i, ArrayList<List<Integer>> list) {
        if (root == null)return;
        if (list.size() < i)
            list.add(new ArrayList<>());

        level(root.left, i+1, list);
        level(root.right, i+1, list);
        list.get(i-1).add(root.val);
    }
}
