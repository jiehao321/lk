package com.java.likou.数组;


import java.util.Arrays;

/**
 * 给你一个整数数组 salary ，数组里每个数都是 唯一 的，其中 salary[i] 是第 i 个员工的工资。
 *
 * 请你返回去掉最低工资和最高工资以后，剩下员工工资的平均值。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：salary = [4000,3000,1000,2000]
 * 输出：2500.00000
 * 解释：最低工资和最高工资分别是 1000 和 4000 。
 * 去掉最低工资和最高工资以后的平均工资是 (2000+3000)/2= 2500
 */
public class 去掉最低工资和最高工资后的工资平均值 {

    public double average(int[] salary) {
        Arrays.sort(salary);
        double sum=0;
        int length = salary.length;
        if (length == 1 || length == 2){
            for (int i : salary) {
                sum = sum+i;
            }
            return sum/length;
        }
        for (int i = 1; i <length-1 ; i++) {
            sum = sum+salary[i];
        }
        return sum/(length-2);
    }
}
