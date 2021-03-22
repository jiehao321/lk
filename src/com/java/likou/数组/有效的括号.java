package com.java.likou.数组;


import java.util.Stack;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 * <p>
 * 有效字符串需满足：
 * <p>
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：s = "()"
 * 输出：true
 * 示例 2：
 * <p>
 * 输入：s = "()[]{}"
 * 输出：true
 * 示例 3：
 * <p>
 * 输入：s = "(]"
 * 输出：false
 */
public class 有效的括号 {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if (aChar == '(' || aChar == '[' || aChar == '{') stack.push(aChar);
            else if (stack.empty()) return false;
            else if (aChar == ')'){
                if (stack.pop() != '(')return false;
            }
            else if (aChar == ']'){
                if (stack.pop() != '[')return false;
            }
            else if (aChar == '}'){
                if (stack.pop() != '{')return false;
            }
        }
        return stack.empty();
    }
}
