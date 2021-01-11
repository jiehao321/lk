package com.java.likou.题目.树;


/**
 * 将一个按照升序排列的有序数组，转换为一棵高度平衡二叉搜索树。
 *
 * 本题中，一个高度平衡二叉树是指一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1。
 *
 * 示例:
 *
 * 给定有序数组: [-10,-3,0,5,9],
 *
 * 一个可能的答案是：[0,-3,9,-10,null,5]，它可以表示下面这个高度平衡二叉搜索树：
 *
 *       0
 *      / \
 *    -3   9
 *    /   /
 *  -10  5
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/convert-sorted-array-to-binary-search-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class 将有序数组转换为二叉搜索树 {


    public TreeNode sortedArrayToBST(int[] nums) {

        return dfs(nums, 0, nums.length-1);


    }

    /**
     *
     * @param nums 数组
     * @param i 数组开始位置
     * @param length 数组结束位置
     * @return
     */
    private TreeNode dfs(int[] nums, int i, int length) {
        // 如果开始位置大于结束位置,直接返回null
        if (i > length){
            return null;
        }

        // 中间位置
        int middle = i + (length-i) / 2;
        // 构建中间节点
        TreeNode root = new TreeNode(nums[middle]);
        // 左节点
        root.left = dfs(nums, i, middle - 1);
        // 右节点
        root.right = dfs(nums, middle + 1, length);

        return root;
    }
}
