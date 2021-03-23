package com.java.likou.剑指offer;


import java.util.HashMap;

/**
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 *
 *  
 *
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 *
 *  
 *
 * 示例 1:
 *
 * 输入: [1, 2, 3, 2, 2, 2, 5, 4, 2]
 * 输出: 2
 */
public class 数组中出现次数超过一半的数字 {

    public int majorityElement(int[] nums) {
        int len = nums.length / 2;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)){
                int i = map.get(num) + 1;
                if (i > len)return num;
                else map.put(num, i);
            }else {
                map.put(num, 1);
            }
        }
        return nums[0];
    }
}
