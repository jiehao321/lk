package com.java.likou;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author holler
 * @date 2020-08-28 17:32
 */
public class lk_443 {

    /**
     * 给定一组字符，使用原地算法将其压缩。
     *
     * 压缩后的长度必须始终小于或等于原数组长度。
     *
     * 数组的每个元素应该是长度为1 的字符（不是 int 整数类型）。
     *
     * 在完成原地修改输入数组后，返回数组的新长度。
     *
     *  
     *
     * 进阶：
     * 你能否仅使用O(1) 空间解决问题？
     *
     *  
     *
     * 示例 1：
     *
     * 输入：
     * ["a","a","b","b","c","c","c"]
     *
     * 输出：
     * 返回 6 ，输入数组的前 6 个字符应该是：["a","2","b","2","c","3"]
     *
     * 说明：
     * "aa" 被 "a2" 替代。"bb" 被 "b2" 替代。"ccc" 被 "c3" 替代。
     * 示例 2：
     *
     * 输入：
     * ["a"]
     *
     * 输出：
     * 返回 1 ，输入数组的前 1 个字符应该是：["a"]
     *
     * 解释：
     * 没有任何字符串被替代。
     * 示例 3：
     *
     * 输入：
     * ["a","b","b","b","b","b","b","b","b","b","b","b","b"]
     *
     * 输出：
     * 返回 4 ，输入数组的前4个字符应该是：["a","b","1","2"]。
     *
     * 解释：
     * 由于字符 "a" 不重复，所以不会被压缩。"bbbbbbbbbbbb" 被 “b12” 替代。
     * 注意每个数字在数组中都有它自己的位置。
     */


    public int compress(char[] chars) {
        HashMap<String, Integer> hm = new HashMap<>();
        ArrayList<String> strList = new ArrayList<>();
        for (char aChar : chars) {
            if (hm.containsKey(String.valueOf(aChar))) {
                hm.put(String.valueOf(aChar), hm.get(String.valueOf(aChar)) + 1);
            } else {
                hm.put(String.valueOf(aChar), 1);
            }
        }
        for (Map.Entry<String, Integer> entry : hm.entrySet()) {
            String s = entry.getValue().toString();
            if (s.length()>1){
                strList.add(entry.getKey());
                for (int i = 0; i < s.length(); i++) {
                    strList.add(String.valueOf(s.toCharArray()[i]));
                }
            }else {
                strList.add(entry.getKey());
                strList.add(s);
            }
        }
        System.out.println(strList.toString());
        chars = strList.toString().toCharArray();
        //strList.forEach(System.out::println);

        return strList.size();
    }

    public int compress2(char[] chars) {
        int anchor = 0, write = 0;
        for (int read = 0; read < chars.length; read++) {
            if (read + 1 == chars.length || chars[read + 1] != chars[read]) {
                chars[write++] = chars[anchor];
                if (read > anchor) {
                    for (char c: ("" + (read - anchor + 1)).toCharArray()) {
                        chars[write++] = c;
                    }
                }
                anchor = read + 1;
            }
        }
        return write;
    }


    public static void main(String[] args) {
        lk_443 lk_443 = new lk_443();
        //["a","a","b","b","c","c","c"]
        char a[]={'a','a','b','b','c','c','c'};
        System.out.println(lk_443.compress(a));

    }
}
