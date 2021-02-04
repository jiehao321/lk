package com.java.likou.每日一题;


/**
 *
 给定 n 个整数，找出平均数最大且长度为 k 的连续子数组，并输出该最大平均数。
 示例：
 输入：[1,12,-5,-6,50,3], k = 4
 输出：12.75
 解释：最大平均数 (12-5-6+50)/4 = 51/4 = 12.75
 */
public class 子数组最大平均数I {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0, cu;
        for (int i = 0; i < k; i++)  sum = sum + nums[i];
        cu = sum;
        for (int i = k; i < nums.length; i++) {
            sum = sum + nums[i] - nums[i-k];
            if (sum > cu)cu = sum;
        }
        return cu/k;
    }
}
