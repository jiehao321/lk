package com.java.likou.题目.树;


import java.util.ArrayList;

/**
 * 给定一个有相同值的二叉搜索树（BST），找出 BST 中的所有众数（出现频率最高的元素）。
 *
 * 假定 BST 有如下定义：
 *
 * 结点左子树中所含结点的值小于等于当前结点的值
 * 结点右子树中所含结点的值大于等于当前结点的值
 * 左子树和右子树都是二叉搜索树
 * 例如：
 * 给定 BST [1,null,2,2],
 *
 *    1
 *     \
 *      2
 *     /
 *    2
 * 返回[2]
 */
public class 二叉搜索树中的众数 {

    ArrayList<Integer> list = new ArrayList<>();
    int count =0;
    int max =0;
    int number = 0;

    public int[] findMode(TreeNode root) {
        mode(root);
        int[] ints = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ints[i] = list.get(i);
        }
        return ints;
    }

    private void mode(TreeNode root) {
        if (root == null){
            return;
        }
        mode(root.left);
        // 中序遍历, 保证顺序
        if (number == root.val){
            count ++;
        }else{
            number = root.val;
            count = 1;
        }
        if (count == max){
            list.add(root.val);
        }
        if (count > max){
            list.clear();
            list.add(root.val);
            max = count;
        }
        mode(root.right);
    }
}
