package com.java.likou.paixu;

public class 排序1 {


    public static void main(String[] args) {

        int[] array = {10, 9, 111, 11, 138, 56, 37};

        // 选择排序
        //choose(array);
        // 插入排序
        //insert(array);
        // 快速排序
        quick(array, 0, array.length-1);
        for (int value : array) {
            System.out.print("_" + value);
        }

    }

    private static void quick(int[] nums, int left, int right) {
        if (left>right)return;
        int lo=left,cur=left+1;
        while (cur<=right){
            if (nums[cur]<=nums[left]){
                swap(nums, cur, lo+1);
                lo++;
            }
            cur++;
        }
        swap(nums, lo, left);
        quick(nums, left, lo-1);
        quick(nums, lo+1, right);
    }

    private static void swap(int[] nums, int i, int cur) {
        int temp = nums[i];
        nums[i] = nums[cur];
        nums[cur] = temp;
    }

    private static void insert(int[] array) {

    }

    private static void choose(int[] array) {


    }

}