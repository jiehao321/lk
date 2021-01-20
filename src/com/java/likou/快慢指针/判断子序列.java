package com.java.likou.快慢指针;


import com.sun.deploy.util.StringUtils;

/**
 * 给定字符串 s 和 t ，判断 s 是否为 t 的子序列。
 *
 * 字符串的一个子序列是原始字符串删除一些（也可以不删除）字符而不改变剩余字符相对位置形成的新字符串。（例如，"ace"是"abcde"的一个子序列，而"aec"不是）。
 *
 * 进阶：
 *
 * 如果有大量输入的 S，称作 S1, S2, ... , Sk 其中 k >= 10亿，你需要依次检查它们是否为 T 的子序列。在这种情况下，你会怎样改变代码？
 *
 * 致谢：
 *
 * 特别感谢 @pbrother 添加此问题并且创建所有测试用例。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：s = "abc", t = "ahbgdc"
 * 输出：true
 * 示例 2：
 *
 * 输入：s = "axc", t = "ahbgdc"
 * 输出：false
 */
public class 判断子序列 {

    public boolean isSubsequence(String s, String t) {
        int i = 0;
        for (char ch : s.toCharArray()) {
            // 找到 t 上第一个匹配的 ch
            while (i < t.length() && t.charAt(i) != ch) i++;
            // 如果 t 穷尽，跳出，注意始终对 i 加一
            if (i++ >= t.length()) break;
        }
        return i <= t.length();
    }
}
