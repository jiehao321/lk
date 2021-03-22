package com.java.likou.数组;


/**
 * 实现 strStr() 函数。
 *
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 *
 * 示例 1:
 *
 * 输入: haystack = "hello", needle = "ll"
 * 输出: 2
 * 示例 2:
 *
 * 输入: haystack = "aaaaa", needle = "bba"
 * 输出: -1
 */
public class 实现strStr {
    public int strStr(String haystack, String needle) {
        if (needle.equals(""))return 0;
        char[] ch1 = haystack.toCharArray();
        char[] ch2 = needle.toCharArray();
        int left=0, right=ch2.length-1;
        for (int i = right; i < ch1.length; i++) {
            if (ch1[i] == ch2[ch2.length-1])
                if (comp(ch1, ch2, left))return left;
            left++;
            right++;
        }
        return -1;
    }
    private boolean comp(char[] ch1, char[] ch2, int left) {
        for (char c : ch2) {
            if (c != ch1[left])return false;
            left++;
        }
        return true;
    }
}
