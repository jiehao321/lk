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
            // 如果节点为null, 直接返回
            return;
        }
        mode(root.left);
        // 中序遍历, 保证顺序
        if (number == root.val){
            // 当前值与节点值相等, count++
            count ++;
        }else{
            // 不相等, 更换当前值与count
            number = root.val;
            count = 1;
        }
        if (count == max){
            // 如果count与最大的次数相等, 将节点的值插入数组
            list.add(root.val);
        }
        if (count > max){
            // count的数大于最大值, 清空数组
            list.clear();
            // 将当前值加入数组
            list.add(root.val);
            // 更换最大值
            max = count;
        }
        mode(root.right);
    }
}
