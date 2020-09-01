package com.java.likou;

/**
 * @author holler
 * @date 2020-08-28 15:56
 */
public class lk_984 {

    /**
     * 给定两个整数 A 和 B，返回任意字符串 S，要求满足：
     * <p>
     * S 的长度为 A + B，且正好包含 A 个 'a' 字母与 B 个 'b' 字母；
     * 子串 'aaa' 没有出现在 S 中；
     * 子串 'bbb' 没有出现在 S 中。
     *  
     * <p>
     * 示例 1：
     * <p>
     * 输入：A = 1, B = 2
     * 输出："abb"
     * 解释："abb", "bab" 和 "bba" 都是正确答案。
     * 示例 2：
     * <p>
     * 输入：A = 4, B = 1
     * 输出："aabaa"
     *  
     * <p>
     * 提示：
     * <p>
     * 0 <= A <= 100
     * 0 <= B <= 100
     * 对于给定的 A 和 B，保证存在满足要求的 S。
     * 通过次数5,418提交次数13,921
     */


    public String strWithout3a3b(int A, int B) {
        int c, d = 1;
        StringBuilder str1 = new StringBuilder();
        if (A > B) {
            for (int i = 0; i < A; i++) {
                if (i < B) {
                    str1.append("a");
                    str1.append("b");
                }
            }
            c = A-B;
            for (int j = 0; j < c; j++) {
                if (d>str1.length()) d = str1.length();
                str1.insert(d, "a");
                d+=3;
            }
        } else {
            for (int i = 0; i < B; i++) {
                if (i < A) {
                    str1.append("b");
                    str1.append("a");
                }
            }
            c = B-A;
            for (int j = 0; j < c; j++) {
                if (d>str1.length()) d = str1.length();
                str1.insert(d, "b");
                d+=3;
            }
        }

        return str1.toString();
    }

    public static void main(String[] args) {
        lk_984 lk_984 = new lk_984();
        System.out.println(lk_984.strWithout3a3b(2,5));
    }
}
