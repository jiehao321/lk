package com.java.likou.题目.树;


/**
 * 你需要采用前序遍历的方式，将一个二叉树转换成一个由括号和整数组成的字符串。
 *
 * 空节点则用一对空括号 "()" 表示。而且你需要省略所有不影响字符串与原始二叉树之间的一对一映射关系的空括号对。
 *
 * 示例 1:
 *
 * 输入: 二叉树: [1,2,3,4]
 *        1
 *      /   \
 *     2     3
 *    /
 *   4
 *
 * 输出: "1(2(4))(3)"
 *
 * 解释: 原本将是“1(2(4)())(3())”，
 * 在你省略所有不必要的空括号对之后，
 * 它将是“1(2(4))(3)”。
 */
public class 根据二叉树创建字符串 {

    TreeNode prv;
    StringBuilder s = new StringBuilder();

    public String tree2str(TreeNode t) {
        if (t== null)return s.toString();
        tree(t);
        return s.toString().substring(1, s.length()-1);
    }

    private void tree(TreeNode t) {
        if (t == null)return;

        if (prv != null && prv.left==null && prv.right != null)s.append("()");
        s.append("(").append(t.val);
        prv = t;
        tree(t.left);
        tree(t.right);
        s.append(")");
    }
}
