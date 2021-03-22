package com.java.likou.数组;


/**
 * 给定两个字符串形式的非负整数 num1 和num2 ，计算它们的和。
 *
 *  
 *
 * 提示：
 *
 * num1 和num2 的长度都小于 5100
 * num1 和num2 都只包含数字 0-9
 * num1 和num2 都不包含任何前导零
 * 你不能使用任何內建 BigInteger 库， 也不能直接将输入的字符串转换为整数形式
 */
public class 字符串相加 {
    public String addStrings(String num1, String num2) {
        int l1 = num1.length()-1, l2 = num2.length()-1, temp=0;
        StringBuilder stringBuilder = new StringBuilder();
        while (l1 >=0 || l2 >= 0){
            int x = 0, y = 0;
            if (l1 >= 0 ){
                x = num1.charAt(l1) - '0';
            }
            if (l2 >= 0 ){
                y = num2.charAt(l2) - '0';
            }
            int sum = x + y + temp;
            if (sum / 10 != 0){
                temp = sum / 10;
                stringBuilder.append(sum %10);
            }else {
                temp = 0;
                stringBuilder.append(sum);
            }
            l1--;
            l2--;
        }
        if (temp != 0)stringBuilder.append(temp);
        return stringBuilder.reverse().toString();

    }
}
