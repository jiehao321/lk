package com.java.likou.快慢指针;


import com.sun.xml.internal.ws.util.StringUtils;

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
        if (s == null || s.length() == 0)return "";
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            String s1 = fet(s, i, i);
            String s2 = fet(s, i, i + 1);
            res = s1.length() > res.length() ? s1 : res;
            res = s2.length() > res.length() ? s2 : res;
        }
        return res;
    }
    private String fet(String s, int i, int j) {
        char[] chars = s.toCharArray();
        while (i >=0 && j < s.length() && chars[i] == chars[j]){
            i--;
            j++;
        }
        return s.substring(i, j+1);
    }
}
