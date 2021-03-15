package com.java.likou.每日一题;


/**
 * 给你一个字符串 s，由若干单词组成，单词之间用空格隔开。返回字符串中最后一个单词的长度。如果不存在最后一个单词，请返回 0 。
 *
 * 单词 是指仅由字母组成、不包含任何空格字符的最大子字符串。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：s = "Hello World"
 * 输出：5
 * 示例 2：
 *
 * 输入：s = " "
 * 输出：0
 */
public class 最后一个单词的长度 {
    public int lengthOfLastWord(String s) {
        if (s.equals(" ") || s.length()==0)return 0;
        String[] s1 = s.split(" ");
        if (s1.length == 0)return 0;
        return s1[s1.length-1].length();
    }

}
