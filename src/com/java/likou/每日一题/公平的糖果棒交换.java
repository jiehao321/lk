package com.java.likou.每日一题;


import java.util.Arrays;

/**
 *
 爱丽丝和鲍勃有不同大小的糖果棒：A[i] 是爱丽丝拥有的第 i 根糖果棒的大小，B[j] 是鲍勃拥有的第 j 根糖果棒的大小。

 因为他们是朋友，所以他们想交换一根糖果棒，这样交换后，他们都有相同的糖果总量。（一个人拥有的糖果总量是他们拥有的糖果棒大小的总和。）

 返回一个整数数组 ans，其中 ans[0] 是爱丽丝必须交换的糖果棒的大小，ans[1] 是 Bob 必须交换的糖果棒的大小。

 如果有多个答案，你可以返回其中任何一个。保证答案存在。
 示例 1：

 输入：A = [1,1], B = [2,2]
 输出：[1,2]
 */
public class 公平的糖果棒交换 {

    public int[] fairCandySwap(int[] A, int[] B) {
        int sumA=0, sumB=0, temp=0 , left=0, right=0;
        int[] ints = new int[2];
        for (int i : A) {
            sumA+=i;
        }
        for (int i : B) {
            sumB+=i;
        }
        temp = (sumA - sumB)/2;
        Arrays.sort(A);
        Arrays.sort(B);
        while (left <A.length && right<B.length ){
            if (A[left] - B[right] == temp){
                ints[0] = A[left];
                ints[1] = B[right];
                break;
            }else if (A[left] - B[right] > temp){
                right++;
            }else left++;
        }
        return ints;
    }
}
