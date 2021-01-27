package com.java.likou.lk;

/**
 * @author holler
 * @date 2020-10-28 15:30
 */
public class lk_541 {


    /**
     * 给定一个字符串 s 和一个整数 k，你需要对从字符串开头算起的每隔 2k 个字符的前 k 个字符进行反转。
     *
     * 如果剩余字符少于 k 个，则将剩余字符全部反转。
     * 如果剩余字符小于 2k 但大于或等于 k 个，则反转前 k 个字符，其余字符保持原样。
     *  
     *
     * 示例:
     *
     * 输入: s = "abcdefg", k = 2
     * 输出: "bacdfeg"
     *  
     *
     * 提示：
     *
     * 该字符串只包含小写英文字母。
     * 给定字符串的长度和 k 在 [1, 10000] 范围内。
     */


    public String reverseStr(String s, int k) {
        char[] ch = s.toCharArray();
        int n = ch.length;
        // 每2k个元素为一组进行反转
        for (int i = 0; i < n; i += 2 * k){
            int left = i;
            int right = (i + k - 1 < n) ? i + k -1 : n - 1; //判断下标是否越界
            while (left <= right){
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;
                left++;
                right--;
            }
        }
        return new String(ch);
    }

}
