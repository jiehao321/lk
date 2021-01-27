package com.java.likou.lk;


import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 给定一副牌，每张牌上都写着一个整数。
 *
 * 此时，你需要选定一个数字 X，使我们可以将整副牌按下述规则分成 1 组或更多组：
 *
 * 每组都有 X 张牌。
 * 组内所有的牌上都写着相同的整数。
 * 仅当你可选的 X >= 2 时返回 true。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：[1,2,3,4,4,3,2,1]
 * 输出：true
 * 解释：可行的分组是 [1,1]，[2,2]，[3,3]，[4,4]
 * 示例 2：
 *
 * 输入：[1,1,1,2,2,2,3,3]
 * 输出：false
 * 解释：没有满足要求的分组。
 */
public class lk_914 {


    public boolean hasGroupsSizeX(int[] deck) {
        if (deck.length<2)return false;
        Arrays.sort(deck);
        for (int i = 0; i < deck.length-1; i++) {
            if (deck[i] == deck[i+1])return true;
        }
        return false;
    }
}
