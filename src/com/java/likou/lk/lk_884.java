package com.java.likou.lk;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * @author holler
 * @date 2020-08-31 15:54
 */
public class lk_884 {
    /**
     * 给定两个句子 A 和 B 。 （句子是一串由空格分隔的单词。每个单词仅由小写字母组成。）
     *
     * 如果一个单词在其中一个句子中只出现一次，在另一个句子中却没有出现，那么这个单词就是不常见的。
     *
     * 返回所有不常用单词的列表。
     *
     * 您可以按任何顺序返回列表。
     *
     *  
     *
     * 示例 1：
     *
     * 输入：A = "this apple is sweet", B = "this apple is sour"
     * 输出：["sweet","sour"]
     * 示例 2：
     *
     * 输入：A = "apple apple", B = "banana"
     * 输出：["banana"]
     */

    public static String[] uncommonFromSentences(String A, String B) {
        ArrayList<String> strList = new ArrayList<>();
        String[] s1 = A.split(" ");
        String[] s2 = B.split(" ");
        for (String s : s1) {
            int status = 0;
            for (String s3 : s1) {
                if (s.equals(s3)) status ++;
            }
            for (String s4 : s2) {
                if (s.equals(s4)) status++;
            }
            if (status==1)strList.add(s);
        }

        for (String s : s2) {
            int status = 0;
            for (String s3 : s1) {
                if (s.equals(s3)) status ++;
            }
            for (String s4 : s2) {
                if (s.equals(s4)) status++;
            }
            if (status==1)strList.add(s);
        }
        String[] strings2 = new String[strList.size()];
        for (int i = 0; i < strList.size(); i++) {
            strings2[i] = strList.get(i);
        }
        return strings2;
    }

    public static void main(String[] args) {
        String A = "this apple is sweet";
        String B = "this apple is sour";
        String[] strings = uncommonFromSentences(A, B);
        for (String string : strings) {
            System.out.print("_" + string);
        }
    }
}
