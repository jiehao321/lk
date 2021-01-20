package com.java.likou.快慢指针;


/**
 * 给你一个字符串 s，找到 s 中最长的回文子串。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：s = "babad"
 * 输出："bab"
 * 解释："aba" 同样是符合题意的答案。
 * 示例 2：
 * <p>
 * 输入：s = "cbbd"
 * 输出："bb"
 */
public class 最长回文子串 {
    public String longestPalindrome(String s) {
        String res = ""; //初始化定义
        for (int i = 0; i < s.length(); i++) {
            String s1 = pal(s, i, i);
            String s2 = pal(s, i, i + 1);
            res = res.length() > s1.length() ? res : s1;
            res = res.length() > s2.length() ? res : s2;
        }
        return res;
    }

    private String pal(String s, int i, int i1) {
        char[] chars = s.toCharArray();
        while (i >= 0 && i1 < s.length() && chars[i] == chars[i1]) {
            i--;
            i1++;
        }
        return s.substring(i + 1, i1);
    }
}
