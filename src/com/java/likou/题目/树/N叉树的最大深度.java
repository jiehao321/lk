package com.java.likou.题目.树;


import java.util.ArrayList;
import java.util.Collections;

/**
 * 给定一个 N 叉树，找到其最大深度。
 *
 * 最大深度是指从根节点到最远叶子节点的最长路径上的节点总数。
 *
 * N 叉树输入按层序遍历序列化表示，每组子节点由空值分隔（请参见示例）。
 *
 *  
 *
 * 示例 1：
 *
 *
 *
 * 输入：root = [1,null,3,2,4,null,5,6]
 * 输出：3
 */
public class N叉树的最大深度 {


    public int maxDepth(Node root) {

        return depth(root);
    }

    private int depth(Node root) {
        if (root == null)return 0 ;
        if (root.children.isEmpty()) return 1;
        ArrayList<Integer> list = new ArrayList<>();
        for (Node child : root.children) {
            list.add(depth(child));
        }
        return Collections.max(list)+1;
    }
}
