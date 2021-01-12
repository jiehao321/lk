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

    List<Double> list = new ArrayList<>();

    public List<Double> averageOfLevels(TreeNode root) {

        levels(root);
        return list;
    }

    private void levels(TreeNode root) {
        if (root == null) return;

        levels(root.left);
        levels(root.right);


    }
}
