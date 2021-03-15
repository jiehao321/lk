package com.java.likou.数组;


import java.util.*;

/**
 * 给定一个包含 n 个整数的数组 nums 和一个目标值 target，判断 nums 中是否存在四个元素 a，b，c 和 d ，使得 a + b + c + d 的值与 target 相等？找出所有满足条件且不重复的四元组。
 * <p>
 * 注意：答案中不可以包含重复的四元组。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [1,0,-1,0,-2,2], target = 0
 * 输出：[[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
 * 示例 2：
 * <p>
 * 输入：nums = [], target = 0
 * 输出：[]
 */
public class 四数之和 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> set = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; i++) {
            if (i>0&& nums[i] == nums[i-1])continue;
            for (int j = i+1; j < nums.length-2; j++) {
                if (j > i+1 && nums[j] == nums[j-1])continue;
                int a = j+1, b = nums.length-1;
                while (a < b){
                    int sum = nums[i] + nums[j] + nums[a] + nums[b];
                    if (sum > target)
                        while (a< b && nums[b] == nums[--b]);
                    else if (sum<target)
                        while (a<b && nums[a] == nums[++a]);
                    else {
                        ArrayList<Integer> list = new ArrayList<>();
                        list.add(nums[i]);list.add(nums[j]);list.add(nums[a]);list.add(nums[b]);
                        set.add(list);
                        while (a< b && nums[b] == nums[--b]);
                        while (a<b && nums[a] == nums[++a]);
                    }
                }
            }
        }
        return set;
    }
}
