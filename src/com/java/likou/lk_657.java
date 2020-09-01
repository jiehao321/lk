package com.java.likou;

/**
 * @author holler
 * @date 2020-08-28 10:27
 */
public class lk_657 {
    /**
     * 在二维平面上，有一个机器人从原点 (0, 0) 开始。给出它的移动顺序，判断这个机器人在完成移动后是否在 (0, 0) 处结束。
     * <p>
     * 移动顺序由字符串表示。字符 move[i] 表示其第 i 次移动。机器人的有效动作有 R（右），L（左），U（上）和 D（下）。如果机器人在完成所有动作后返回原点，则返回 true。否则，返回 false。
     * <p>
     * 注意：机器人“面朝”的方向无关紧要。 “R” 将始终使机器人向右移动一次，“L” 将始终向左移动等。此外，假设每次移动机器人的移动幅度相同。
     * <p>
     *  
     * <p>
     * 示例 1:
     * <p>
     * 输入: "UD"
     * 输出: true
     * 解释：机器人向上移动一次，然后向下移动一次。所有动作都具有相同的幅度，因此它最终回到它开始的原点。因此，我们返回 true。
     * 示例 2:
     * <p>
     * 输入: "LL"
     * 输出: false
     * 解释：机器人向左移动两次。它最终位于原点的左侧，距原点有两次 “移动” 的距离。我们返回 false，因为它在移动结束时没有返回原点。
     */


    /**
     * 我的实现
     * @param moves
     * @return
     */
    public Boolean judgeCircle(String moves) {

        char[] array = moves.toCharArray();

        for (int i1 = 0; i1 < array.length; i1++) {
            if (array[i1] == 0) continue;
            char c1 = conversionToChar(array[i1]);
            if ((c1 == 1)) return false;
            if (!(comparable(c1, array, i1))) return false;
        }

        return true;
    }

    private boolean comparable(char c1, char[] array, int i) {
        if (c1 == 0) return true;
        for (int i1 = i; i1 < array.length; i1++) {
            if (array[i1] == c1) {
                array[i1] = 0;
                return true;
            }
        }
        return false;
    }

    private char conversionToChar(char c) {
        if (Character.toString(c).equals("U")) return "D".charAt(0);
        if (Character.toString(c).equals("D")) return "U".charAt(0);
        if (Character.toString(c).equals("R")) return "L".charAt(0);
        if (Character.toString(c).equals("L")) return "R".charAt(0);
        return 1;
    }



    /**
     * 最优方法
     * @param moves 移动距离
     * @return
     */
    public Boolean judgeCircle2(String moves) {

        int ud =0;
        int lr = 0;
        char[] c = moves.toCharArray();
        for(char ch:c){
            if(ch=='L') lr--;
            else if(ch=='R') lr++;
            else if(ch=='U') ud++;
            else if(ch=='D') ud--;
        }
        return ud == 0 && lr == 0;
    }

    public static void main(String[] args) {
        lk_657 test1 = new lk_657();
        Boolean ud = test1.judgeCircle("LRLR");
        System.out.println(ud);
    }
}
