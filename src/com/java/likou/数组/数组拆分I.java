package com.java.likou.数组;


import java.util.Arrays;

/**
 * 给定长度为 2n 的整数数组 nums ，你的任务是将这些数分成 n 对, 例如 (a1, b1), (a2, b2), ..., (an, bn) ，使得从 1 到 n 的 min(ai, bi) 总和最大。
 *
 * 返回该 最大总和 。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：nums = [1,4,3,2]
 * 输出：4
 * 解释：所有可能的分法（忽略元素顺序）为：
 * 1. (1, 4), (2, 3) -> min(1, 4) + min(2, 3) = 1 + 2 = 3
 * 2. (1, 3), (2, 4) -> min(1, 3) + min(2, 4) = 1 + 2 = 3
 * 3. (1, 2), (3, 4) -> min(1, 2) + min(3, 4) = 1 + 3 = 4
 * 所以最大总和为 4
 */
public class 数组拆分I {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for (int i = 0; i < nums.length; i+=2)
            sum = sum + Math.min(nums[i], nums[i+1]);
        return sum;
    }

}
