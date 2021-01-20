package com.java.likou.快慢指针;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * 给定两个数组，编写一个函数来计算它们的交集。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出：[2]
 * 示例 2：
 *
 * 输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出：[9,4]
 */
public class 两个数组的交集 {

    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        if (nums1 == null || nums2 == null || nums1.length == 0 || nums2.length == 0)return new int[0];

        for (int j : nums1) {
            for (int k : nums2) {
                if (j == k) set.add(j);
            }
        }
        int[] ints = new int[set.size()];
        Object[] objects = set.toArray();
        for (int i = 0; i < objects.length; i++) {
            ints[i] = (Integer) objects[i];
        }
        return ints;
    }
}
