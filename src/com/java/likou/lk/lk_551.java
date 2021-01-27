package com.java.likou.lk;

/**
 * @author holler
 * @date 2020-09-01 10:04
 */
public class lk_551 {
    /**
     * 给定一个字符串来代表一个学生的出勤记录，这个记录仅包含以下三个字符：
     *
     * 'A' : Absent，缺勤
     * 'L' : Late，迟到
     * 'P' : Present，到场
     * 如果一个学生的出勤记录中不超过一个'A'(缺勤)并且不超过两个连续的'L'(迟到),那么这个学生会被奖赏。
     *
     * 你需要根据这个学生的出勤记录判断他是否会被奖赏。
     *
     * 示例 1:
     *
     * 输入: "PPALLP"
     * 输出: True
     * 示例 2:
     *
     * 输入: "PPALLL"
     * 输出: False
     */


    public boolean checkRecord(String s) {
        int a = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'A'){
                a++;
                if (a>1)return false;
            }
            if (chars[i] == 'L'){
                if (i>=chars.length-2){
                    return true;
                }
                if (chars[i+1] == 'L' && chars[i+2] == 'L')return false;
            }

        }

        return true;
    }

    public static void main(String[] args) {
        String a = "ALL";
        lk_551 lk_551 = new lk_551();
        System.out.println(lk_551.checkRecord(a));
    }
}
