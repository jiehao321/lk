package com.java.likou.lk;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 747. 至少是其他数字两倍的最大数
 * @author holler
 * @date 2020-08-28 12:51
 */
public class lk_747 {

    /**
     * 在一个给定的数组nums中，总是存在一个最大元素 。
     *
     * 查找数组中的最大元素是否至少是数组中每个其他数字的两倍。
     *
     * 如果是，则返回最大元素的索引，否则返回-1。
     *
     * 示例 1:
     *
     * 输入: nums = [3, 6, 1, 0]
     * 输出: 1
     * 解释: 6是最大的整数, 对于数组中的其他整数,
     * 6大于数组中其他元素的两倍。6的索引是1, 所以我们返回1.
     *  
     *
     * 示例 2:
     *
     * 输入: nums = [1, 2, 3, 4]
     * 输出: -1
     * 解释: 4没有超过3的两倍大, 所以我们返回 -1.
     */

    public int dominantIndex(int[] nums) {
        List<Integer> numList = Arrays.stream(nums).boxed().map((x) -> x * 2).collect(Collectors.toList());
        if (nums.length==1){
            return 0;
        }
        int[] ints = getMax(numList);
        if ((ints[0]/2)>=ints[1])return ints[2];
        else return -1;

    }

    private int[] getMax(List<Integer> numList) {
        int i,max, sMax;
        max= numList.get(0);
        sMax= numList.get(1);
        int m = 0;
        for(i=0;i<numList.size();i++)
        {
            if(numList.get(i) >max)
            {
                 sMax=max;
                max=numList.get(i);
                m = i;
            }
            else if(numList.get(i)<max && numList.get(i)> sMax)
                 sMax=numList.get(i);
        }

        return new int[]{max,  sMax, m};
    }

    /**
     * 最佳答案
     * @param nums
     * @return
     */
    public int dominantIndex2(int[] nums) {
        if (nums == null || nums.length == 0)
            return -1;
        int max = 0, second = 0, i, index = 0;
        for (i = 0; i<nums.length; i++){
            if(nums[i] > second){ //大于次大值才进入
                if (nums[i] > max){
                    second = max;
                    max = nums[i];
                    index = i;
                } else
                    second = nums[i];
            }
        }
        return second == 0 || max / second >= 2 ? index : -1;
    }

    public static void main(String[] args) {
        lk_747 lk747 = new lk_747();
        System.out.println(lk747.dominantIndex(new int[]{3, 6, 15, 0}));
    }
}
