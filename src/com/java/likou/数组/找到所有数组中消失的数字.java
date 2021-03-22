package com.java.likou.数组;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定一个范围在  1 ≤ a[i] ≤ n ( n = 数组大小 ) 的 整型数组，数组中的元素一些出现了两次，另一些只出现一次。
 * <p>
 * 找到所有在 [1, n] 范围之间没有出现在数组中的数字。
 * <p>
 * 您能在不使用额外空间且时间复杂度为O(n)的情况下完成这个任务吗? 你可以假定返回的数组不算在额外空间内。
 * <p>
 * 示例:
 * <p>
 * 输入:
 * [4,3,2,7,8,2,3,1]
 * <p>
 * 输出:
 * [5,6]
 */
public class 找到所有数组中消失的数字 {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        int cur = 1, i=0;
        while (cur <= nums.length){
            if (i != nums.length-1 && i < nums.length && nums[i] == nums[i + 1] ) {i++;continue;}
            if (  i < nums.length && nums[i] == cur ) {cur++;i++;}
            else {
                list.add(cur);
                cur++;
            }
        }
        return list;
    }
}
