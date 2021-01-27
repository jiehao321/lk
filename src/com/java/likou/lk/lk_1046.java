package com.java.likou.lk;

/**
 * @author holler
 * @date 2020-08-31 16:45
 */
public class lk_1046 {

    /**
     * 有一堆石头，每块石头的重量都是正整数。
     * <p>
     * 每一回合，从中选出两块 最重的 石头，然后将它们一起粉碎。假设石头的重量分别为 x 和 y，且 x <= y。那么粉碎的可能结果如下：
     * <p>
     * 如果 x == y，那么两块石头都会被完全粉碎；
     * 如果 x != y，那么重量为 x 的石头将会完全粉碎，而重量为 y 的石头新重量为 y-x。
     * 最后，最多只会剩下一块石头。返回此石头的重量。如果没有石头剩下，就返回 0。
     * <p>
     * 示例：
     * <p>
     * 输入：[2,7,4,1,8,1]
     * 输出：1
     * 解释：
     * 先选出 7 和 8，得到 1，所以数组转换为 [2,4,1,1,1]，
     * 再选出 2 和 4，得到 2，所以数组转换为 [2,1,1,1]，
     * 接着是 2 和 1，得到 1，所以数组转换为 [1,1,1]，
     * 最后选出 1 和 1，得到 0，最终数组转换为 [1]，这就是最后剩下那块石头的重量。
     */

    public int lastStoneWeight(int[] stones) {
        int length = stones.length;

        while (length>1){
            int[] ins = takeTuo(stones);
            length = length - 2;
            if (stones[ins[0]]>stones[ins[1]]) {
                stones[ins[0]] = stones[ins[0]]-stones[ins[1]];
                stones[ins[1]] = -1;
                length++;
            }else if (stones[ins[0]]< stones[ins[1]]){
                stones[ins[0]] = stones[ins[1]]-stones[ins[0]];
                stones[ins[1]] = -1;
                length++;
            }else {
                stones[ins[0]] = -1;
                stones[ins[1]] = -1;
            }
        }
        for (int stone : stones) {
            if (!(stone == -1)) return stone;

        }
        return 0;
    }

    private int[]  takeTuo(int[] data) {
        int maxNum = 0;
        int secMaxNum = 0;

        if (data[0] >= data[1]) {
            secMaxNum = 1;
        } else {
            maxNum = 1;
        }
        for (int i = 2; i < data.length; i++) {
            if (data[i] > data[maxNum]) {
                secMaxNum = maxNum;
                maxNum = i;
            } else {
                if (data[i] >= data[secMaxNum]) {
                    secMaxNum = i;
                }
            }
        }
        return new int[]{maxNum, secMaxNum};
    }

    public static void main(String[] args) {
        lk_1046 lk_1046 = new lk_1046();
        int[] a = new int[]{2, 7, 4, 1, 8, 1};
        int i = lk_1046.lastStoneWeight(a);
        System.out.println(i);
    }
}
