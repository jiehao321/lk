package com.java.likou.题目.树;


import java.util.HashSet;
import java.util.Map;

/**
 * 给定一个二叉搜索树和一个目标结果，如果 BST 中存在两个元素且它们的和等于给定的目标结果，则返回 true。
 *
 * 案例 1:
 *
 * 输入:
 *     5
 *    / \
 *   3   6
 *  / \   \
 * 2   4   7
 *
 * Target = 9
 *
 * 输出: True
 */
public class 两数之和IV输入BST {

    HashSet<Integer> map = new HashSet<>();


    public boolean findTarget(TreeNode root, int k) {
        if (root == null)return false;

        boolean target = findTarget(root.left, k);
        if (map.contains(k - root.val)) return true;
        map.add(root.val);

        boolean target1 = findTarget(root.right, k);

        return target || target1;
    }



}
