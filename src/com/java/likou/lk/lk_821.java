package com.java.likou.lk;

/**
 * @author holler
 * @date 2020-08-31 14:23
 */
public class lk_821 {
    /**
     * 给定一个字符串 S 和一个字符 C。返回一个代表字符串 S 中每个字符到字符串 S 中的字符 C 的最短距离的数组。
     *
     * 示例 1:
     *
     * 输入: S = "loveleetcode", C = 'e'
     * 输出: [3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0]
     * 说明:
     *
     * 字符串 S 的长度范围为 [1, 10000]。
     * C 是一个单字符，且保证是字符串 S 里的字符。
     * S 和 C 中的所有字母均为小写字母。
     */
    public static int[] shortestToChar(String S, char C) {
        int cur = 0;
        int[] i1 = new int[S.length()];
        char[] c1 = S.toCharArray();
        for (int k = 0; k < c1.length; k++) {
            int t = -1;
            for (int i = 0; i+k < c1.length; i++) {
                if (c1[i+k] == C){
                    t  = i;
                    cur = i;
                    break;
                }
            }
            for (int j = 0; j+k >-1; j--) {
                if (c1[j+k] == C) {
                    if (t == -1){
                        cur = Math.abs(j);
                    }else {
                        cur = Math.min(cur, Math.abs(j));
                    }
                    break;
                }
            }
            i1[k]=cur;
        }
        return i1;
    }

    public static void main(String[] args) {
        String S = "baaa";
        char C = 'b';
        int[] ints = shortestToChar(S, C);
        for (int anInt : ints) {
            System.out.print("_" + anInt);
        }
    }
}
