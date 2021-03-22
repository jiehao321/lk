package com.java.likou.数组;


/**
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 *
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 *
 * 示例 1:
 *
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: true
 * 示例 2:
 *
 * 输入: "race a car"
 * 输出: false
 */
public class 验证回文串 {


    public boolean isPalindrome(String s) {
        if (s.equals(""))return true;
        char[] chars = s.toCharArray();
        int left=0, right = s.length()-1;
        while (left <= right){
            if (!Character.isLetterOrDigit(chars[left])) {
                left++;
            }
            else if (!Character.isLetterOrDigit(chars[right])){
                right--;
            }
            else if (Character.toLowerCase(chars[left]) ==  Character.toLowerCase(chars[right])){
                left++;
                right--;
            }else return false;
        }
        return true;
    }

    public static void main(String[] args) {
        验证回文串 a = new 验证回文串();
        a.isPalindrome("0P");
    }
}
