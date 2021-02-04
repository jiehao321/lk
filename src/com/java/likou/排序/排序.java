package com.java.likou.排序;

public class 排序 {


    public static void main(String[] args) {

        int[] array = {10, 9, 111, 11, 138, 56, 37};

        // 选择排序

        choose(array);
        // 插入排序
        //insert(array);
        // 快速排序
        //quick(array, 0, array.length-1);
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
        // 插入排序从左到右进行，每次都将当前元素插入到左侧已经排序的数组中，使得插入之后左部数组依然有序。
        //第 j 元素是通过不断向左比较并交换来实现插入过程：当
        // 第 j 元素小于第 j - 1 元素，就将它们的位置交换，然后令 j 指针向左移动一个位置，不断进行以上操作。
        for (int i = 0; i < array.length; i++) {
            int j = i, temp = array[i];
            while (j>0 && array[j-1]>temp){
                array[j] = array[j-1];
                j--;
            }
            array[j] = temp;
        }
    }

    private static void choose(int[] array) {
        // 选择出数组中的最小元素，将它与数组的第一个元素交换位置。
        // 再从剩下的元素中选择出最小的元素，将它与数组的第二个元素交换位置。不断进行这样的操作，直到将整个数组排序。
        for (int i = 0; i < array.length; i++) {
            int mix=i;
            for (int i1 = mix + 1; i1 < array.length; i1++) {
                if (array[mix] < array[i1])mix=i1;
            }
            swap(array, mix, i);
        }
    }

}