package com.java.likou.paixu;

/**
 * @author holler
 * @date 2020-08-29 15:43
 */
public class 插入 {



        public static void main(String[] args) {
        int[] array = {10, 9, 111,11, 138, 56, 37};

        int begin, temp;
        for (begin = 1; begin < array.length; begin++) {
            for (int i = 0; i < begin; i++) {
                if (array[begin] < array[i]) {
                    temp = array[begin];
                    array[begin] = array[i];
                    array[i] = temp;
                }
            }
        }
        for (int value : array) {
            System.out.print("_" + value);
        }

    }
}
