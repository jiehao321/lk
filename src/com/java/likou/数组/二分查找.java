package com.java.likou.数组;


/**
 *
 给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。


 示例 1:

 输入: nums = [-1,0,3,5,9,12], target = 9
 输出: 4
 解释: 9 出现在 nums 中并且下标为 4
 */
public class 二分查找 {


    public int search(int[] nums, int target) {
        if (nums == null || nums.length==0)return -1;
        int left=0, right=nums.length-1, mid=0;

        while (left<=right){
            mid = (left + right)/2;
            if (nums[mid] == target)return mid;
            else if (nums[mid] > target) right = mid-1;
            else if (nums[mid] < target) left = mid+1;
        }
        return -1;
    }
}
