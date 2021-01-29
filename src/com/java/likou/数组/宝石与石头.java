package com.java.likou.数组;

/**
 *
 给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。 S 中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。

 J 中的字母不重复，J 和 S中的所有字符都是字母。字母区分大小写，因此"a"和"A"是不同类型的石头。

 示例 1:

 输入: J = "aA", S = "aAAbbbb"
 输出: 3
 */
public class 宝石与石头 {

    public int numJewelsInStones(String jewels, String stones) {
        int sum=0;
        int[] ints = new int[200];
        char[] chars = stones.toCharArray();
        for (char aChar : chars) {
            ints[ aChar] = ints[ aChar]+1;
        }
        char[] chars1 = jewels.toCharArray();
        for (char aChar : chars1) {
            if (ints[(int) aChar] != 0){
                sum = sum + ints[(int) aChar];
            }
        }
        return sum;
    }
}
