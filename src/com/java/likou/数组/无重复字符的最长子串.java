package com.java.likou.数组;


import java.util.HashSet;

/**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 *  
 *
 * 示例 1:
 *
 * 输入: s = "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 *
 * 输入: s = "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 *
 * 输入: s = "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 * 示例 4:
 *
 * 输入: s = ""
 * 输出: 0
 */
public class 无重复字符的最长子串 {
    public int lengthOfLongestSubstring(String s) {
        if (s.length()==0 || s.length()==1)return s.length();
        int max=1, left=0,right=1;
        char[] chars = s.toCharArray();
        while (right < s.length()){
            if (compare(chars, left, right)){
                left ++;
                right++;
            }else {
                max = Math.max((right - left + 1), max);
                right++;
            }
        }
        return max;
    }
    private boolean compare(char[] chars, int left, int right) {
        HashSet<Character> set = new HashSet<>();
        set.add(chars[right]);
        while (left < right){
            if (set.contains(chars[left]))return true;
            set.add(chars[left]);
            left++;
        }
        return false;
    }
}
