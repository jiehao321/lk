package com.java.likou.数组;

import java.util.Arrays;

public class 加一 {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            int temp = digits[i] + 1;
            digits[i] = temp % 10;
            if (digits[i] != 0) return digits;
        }
        int[] ints = new int[digits.length + 1];
        ints[0] = 1;
        return ints;
    }
}