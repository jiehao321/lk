package com.java.likou.paixu;

/**
 * @author holler
 * @date 2020-08-29 10:40
 */
public class 冒泡 {

    public static void main(String[] args) {
        int[] array = {10,9,11, 28, 56,  37};

        int begin ,end = array.length, temp;
        for (int i = 0; i < array.length; i++) {
            for (begin = 1; begin < end; begin++) {
                if (array[begin] < array[begin-1]){
                    temp = array[begin];
                    array[begin] = array[begin-1];
                    array[begin-1] = temp;
                }
            }
        }

        for (int value : array) {
            System.out.print("_" + value);
        }


    }
}
