package com.java.likou.题目.树;


/**
 * 给出一棵二叉树，其上每个结点的值都是 0 或 1 。每一条从根到叶的路径都代表一个从最高有效位开始的二进制数。例如，如果路径为 0 -> 1 -> 1 -> 0 -> 1，那么它表示二进制数 01101，也就是 13 。
 *
 * 对树上的每一片叶子，我们都要找出从根到该叶子的路径所表示的数字。
 *
 * 返回这些数字之和。题目数据保证答案是一个 32 位 整数。
 *
 *  
 *
 * 示例 1：
 *
 *
 * 输入：root = [1,0,1,0,1,0,1]
 * 输出：22
 * 解释：(100) + (101) + (110) + (111) = 4 + 5 + 6 + 7 = 22
 */
public class 从根到叶的二进制数之和 {


    int res = 0;
    public int sumRootToLeaf(TreeNode root){
        preOrder(root,0);
        return res;
    }
    public void preOrder(TreeNode root, int val){
        if(root != null){
            // 值先移位，后相加
            int tmp = (val<<1) + root.val;

            // 当前节点是叶子节点
            if(root.left == null && root.right == null){
                res += tmp;
            } else {
                // 当前节点的左子节点不为空，继续递归，val的值是父节点的值，也就是tmp
                if(root.left != null){
                    preOrder(root.left, tmp);
                }
                if(root.right != null){
                    preOrder(root.right, tmp);
                }
            }
        }
    }
}
