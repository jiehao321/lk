package com.java.likou.题目.二叉树;




public class 相同的树 {


    /**
     * 给定两个二叉树，编写一个函数来检验它们是否相同。
     *
     * 如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
     * @param p
     * @param q
     * @return
     */
    // 判断两棵树是否相同
    public boolean isSameTree(TreeNode p, TreeNode q) {

        if (p == null && q == null){
            return true;
        }else if (p == null || q == null){
            return false;
        }
        else if (p.val != q.val){
            return false;
        }else{
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
    }

}


