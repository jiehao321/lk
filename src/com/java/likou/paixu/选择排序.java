package com.java.likou.paixu;

/**
 * @author holler
 * @date 2020-08-29 14:57
 */
public class 选择排序 {


    public static void main(String[] args) {
        int[] array = {10,9,11, 28, 56, 37};
        for (int end = array.length-1; end > 0; end--) {
            int cur = end;
            for (int begin = 0; begin < end; begin++) {
                if (array[begin] >array[end]) cur=begin;
            }
            int temp = array[end];
            array[end] = array[cur];
            array[cur] = temp;
        }
        for (int value : array) {
            System.out.print("_" + value);
        }


    }
}
