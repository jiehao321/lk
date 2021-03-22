package com.java.likou.数组;


import java.util.Arrays;

/**
 * 给你一个非空数组，返回此数组中 第三大的数 。如果不存在，则返回数组中最大的数。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：[3, 2, 1]
 * 输出：1
 * 解释：第三大的数是 1 。
 * 示例 2：
 *
 * 输入：[1, 2]
 * 输出：2
 * 解释：第三大的数不存在, 所以返回最大的数 2 。
 * 示例 3：
 *1223
 * 输入：[2, 2, 3, 1]
 * 输出：1
 * 解释：注意，要求返回第三大的数，是指在所有不同数字中排第三大的数。
 * 此例中存在两个值为 2 的数，它们都排第二。在所有不同数字中排第三大的数为 1
 */
public class 第三大的数 {

    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        if (nums.length <= 2)return nums[nums.length-1];
        int right=nums.length-1, count=0;

        while (right>0){
            if (nums[right] == nums[right-1]){
                right--;
            }else {
                count++;
                right--;
                if (count == 2)return nums[right];
            }
        }
        return nums[nums.length-1];
    }
}
