package com.java.likou.题目.二叉树;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * 给定一个二叉树，返回其节点值自底向上的层序遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）
 *
 * 例如：
 * 给定二叉树 [3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回其自底向上的层序遍历为：
 *
 * [
 *   [15,7],
 *   [9,20],
 *   [3]
 * ]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/binary-tree-level-order-traversal-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class 二叉树的层序遍历II {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        // 最后返回的list
        ArrayList<List<Integer>> bottom = new ArrayList<>();

        // 递归
        level(root, 0, bottom);
        // 反转
        Collections.reverse(bottom);
        return bottom;
    }

    /**
     *
     * @param root 传过来的节点
     * @param i 层数
     * @param bottom  返回的数组
     */
    private void level(TreeNode root, int i, ArrayList<List<Integer>> bottom) {
        if (root == null){
            // 如果节点为null 直接返回
            return;
        }
        if (i >= bottom.size()){
            // 如果层数大于等于数组的大小, 增加一个空数组
            bottom.add(new ArrayList<>());
        }


        level(root.left, i+1, bottom);
        level(root.right, i+1, bottom);
        // 对当前层进行赋值
        bottom.get(i).add(root.val);
    }


}
