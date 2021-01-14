package com.java.likou.paixu;

/**
 * @author holler
 * @date 2020-08-29 10:40
 */
public class 冒泡 {

    public static void main(String[] args) {

        aVoid();

        int[] array = {10,9,11, 28, 56,  37};

        int begin ,end = array.length, temp;
        for (int i = 0; i < array.length; i++) {
            for (begin = 1; begin < end-i; begin++) {
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


    public static void aVoid(){

        int[] array = {10,9,11, 3, 56,  37};
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length-i; j++) {
                if (array[j] < array[j-1]){
                    temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }

        for (int value : array) {
            System.out.print("_" + value);
        }
        System.out.println();


    }
}
