package com.java.likou.数组;


/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：strs = ["flower","flow","flight"]
 * 输出："fl"
 * 示例 2：
 *
 * 输入：strs = ["dog","racecar","car"]
 * 输出：""
 * 解释：输入不存在公共前缀。
 */
public class 最长公共前缀 {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)return "";
        String str = strs[0];
        for (int i = 1; i < strs.length; i++) {
            int j = 0;
            for (; j < strs[i].length() && j < str.length(); j++) {
                if (strs[i].charAt(j) != str.charAt(j)){
                    break;
                }
            }
            str = strs[i].substring(0, j);
            if (str.equals(""))return "";
        }
        return str;
    }
}
