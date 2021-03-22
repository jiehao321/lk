package com.java.likou;


/**
 * 给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，
 * 写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
 */
public class test {


    public static int test(int[] nums, int target){
        if (nums.length ==0 ) return -1;
        System.out.println(Integer.MAX_VALUE);
        return test1(nums, 0, nums.length-1, target);
    }

    public static int test1(int[] nums, int left, int right, int target){
        if (left > right)return -1;
        int mid = (left + right) / 2;
        if (nums[mid] == target) return mid;
        else if (nums[mid] > target){
            return test1(nums, left, mid-1, target);
        }else {
            return test1(nums, mid+1, right, target);
        }
    }


    public static void main(String[] args) {
        int[] ints = {-1,0,3,5,9,12};
        int target = -1;
        int test = test(ints, target);
        System.out.println(test);
    }
}
