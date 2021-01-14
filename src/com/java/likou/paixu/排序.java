package com.java.likou.paixu;

public class 排序 {


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
        if (left>=right) return;
        int cur = left + 1;                   // 从左侧第二个元素开始
        int lo = left;                        // 分界点为第一个元素
        while (cur <= right) {
            if (nums[cur] <= nums[left]) {    // 交换位置保证lo的左侧都是小于num[left]
                swap(nums, lo+1, cur);
                lo ++;
            }
            cur++;
        }
        swap(nums, left, lo);                 // 把分界点元素移动到新的分界位置
        quick(nums, left, lo-1);
        quick(nums, lo+1, right);

    }

    private static void swap(int[] nums, int i, int cur) {
        int temp = nums[i];
        nums[i] = nums[cur];
        nums[cur] = temp;
    }

    private static void insert(int[] array) {
        // 每次选择一个放到合适的位置

        for (int i = 0; i < array.length; i++) {

            int j = i, temp = array[i];

            while (j>0 && array[j-1]>temp){
                array[j] = array[j-1];
                j--;
            }
            array[j] = temp;

        }
        for (int value : array) {
            System.out.print("_" + value);
        }
    }

    private static void choose(int[] array) {

        // 选择排序,选择一个数与其他数比较,最小的数与当前的数交换

        int length = array.length;
        for (int i = 0; i < length-1; i++) {
            // 初始位置
            int start = i;
            for (int j = i+1; j < length  ; j++) {
                if (array[j] < array[start]) start = j;
            }
            // 交换
            if (start != i){
                int temp = array[i];
                array[i] = array[start];
                array[start] = temp;
            }
        }
        for (int value : array) {
            System.out.print("_" + value);
        }
    }

}