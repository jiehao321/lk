package com.java.likou.数组;


/**
 * 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
 *
 * 如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。
 *
 * 假设环境不允许存储 64 位整数（有符号或无符号）。
 *  
 *
 * 示例 1：
 *
 * 输入：x = 123
 * 输出：321
 * 示例 2：
 *
 * 输入：x = -123
 * 输出：-321
 * 示例 3：
 *
 * 输入：x = 120
 * 输出：21
 */
public class 整数反转 {

    public int reverse(int x) {
        int res = 0;
        while (x != 0){
            int temp = x % 10;

            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE/10 && temp > 7))return 0;
            if (res < Integer.MIN_VALUE / 10 || (res == Integer.MIN_VALUE/10 && temp < -8))return 0;

            res = res * 10 + temp;
            x = x/10;
        }
        return res;
    }
}
