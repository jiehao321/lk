package com.java.likou.题目.树;


import java.util.ArrayList;
import java.util.List;

/**
 *
 给定一个非空二叉树, 返回一个由每层节点平均值组成的数组。



 示例 1：

 输入：
 3
 / \
 9  20
 /  \
 15   7
 输出：[3, 14.5, 11]
 解释：
 第 0 层的平均值是 3 ,  第1层是 14.5 , 第2层是 11 。因此返回 [3, 14.5, 11] 。
 */
public class 二叉树的层平均值 {

    public List<Double> averageOfLevels(TreeNode root) {
        List<Integer> counts = new ArrayList<Integer>(); // 层数
        List<Double> sums = new ArrayList<Double>(); // 和
        dfs(root, 0, counts, sums);
        List<Double> averages = new ArrayList<Double>(); // 返回
        int size = sums.size();
        for (int i = 0; i < size; i++) {
            averages.add(sums.get(i) / counts.get(i));
        }
        return averages;
    }

    public void dfs(TreeNode root, int level, List<Integer> counts, List<Double> sums) {
        if (root == null) {
            // 节点为null 直接返回
            return;
        }
        if (level < sums.size()) {
            sums.set(level, sums.get(level) + root.val);
            counts.set(level, counts.get(level) + 1);
        } else {
            sums.add(1.0 * root.val);
            counts.add(1);
        }
        dfs(root.left, level + 1, counts, sums);
        dfs(root.right, level + 1, counts, sums);
    }
}
