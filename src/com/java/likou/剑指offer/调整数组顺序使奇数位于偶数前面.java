package com.java.likou.剑指offer;


/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数位于数组的前半部分，所有偶数位于数组的后半部分。
 *
 *  
 *
 * 示例：
 *
 * 输入：nums = [1,2,3,4]
 * 输出：[1,3,2,4]
 * 注：[3,1,2,4] 也是正确的答案之一。
 * [2,16,3,5,13,1,16,1,12,18,11,8,11,11,5,1]
 * [1,5,3,5,13,1,16,1,12,18,11,8,11,11,16,2]
 */
public class 调整数组顺序使奇数位于偶数前面 {

    public int[] exchange(int[] nums) {
        int left=0, right = nums.length-1;

        while (left <= right){
            if (nums[left] % 2 == 0 && nums[right] %2 != 0){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                right--;
                left++;
            }else if (nums[left] % 2 != 0 && nums[right] %2 != 0)left++;
            else if (nums[left] % 2 == 0 && nums[right] %2 == 0)right--;
            else {
                left++;
                right--;
            }
        }
        return nums;
    }
}
