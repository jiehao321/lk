package com.java.likou.排序;

/**
 * @author holler
 * @date 2020-08-29 14:57
 */
public class 选择排序 {


    public static void main(String[] args) {
        int[] array = {10,9,11, 28, 56, 37};
        for (int i = 0; i < array.length-1; i++) {
            int min = i;
            for (int j = i+1; j < array.length; j++){
                if (array[min] > array[j]) min = j;
            }
            int tmp = array[i];
            array[i] = array[min];
            array[min] = tmp;
        }

        for (int value : array) {
            System.out.print("_" + value);
        }
    }
}
