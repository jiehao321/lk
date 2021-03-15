package com.java.likou.数组;


/**
 * 给定一个循环数组（最后一个元素的下一个元素是数组的第一个元素），输出每个元素的下一个更大元素。数字 x 的下一个更大的元素是按数组遍历顺序，这个数字之后的第一个比它更大的数，这意味着你应该循环地搜索它的下一个更大的数。如果不存在，则输出 -1。
 *
 * 示例 1:
 *
 * 输入: [1,2,1]
 * 输出: [2,-1,2]
 * 解释: 第一个 1 的下一个更大的数是 2；
 * 数字 2 找不到下一个更大的数；
 * 第二个 1 的下一个最大的数需要循环搜索，结果也是 2。
 */
public class 下一个更大元素II {
    public int[] nextGreaterElements(int[] nums) {
        if (nums.length == 1)return new int[]{-1};
        int len = nums.length ;
        int[] ints = new int[nums.length];
        int left=0;
        while (left < len){
            int right=left;
            while (true){
                if (nums[right] > nums[left]){
                    ints[left] = nums[right];
                    break;
                }else right++;
                if (right > len-1)right = 0;
                if (right == left){
                    ints[left] = -1;
                    break;
                }
            }
            left++;
        }
        return ints;
    }
}
