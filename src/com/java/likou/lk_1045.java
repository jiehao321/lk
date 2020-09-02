package com.java.likou;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author holler
 * @date 2020-09-02 11:03
 */
public class lk_1045 {
    /**
     * 给你一个数组 favoriteCompanies ，其中 favoriteCompanies[i] 是第 i 名用户收藏的公司清单（下标从 0 开始）。
     * <p>
     * 请找出不是其他任何人收藏的公司清单的子集的收藏清单，并返回该清单下标。下标需要按升序排列。
     * <p>
     *  
     * <p>
     * 示例 1：
     * <p>
     * 输入：favoriteCompanies = [["leetcode","google","facebook"],["google","microsoft"],["google","facebook"],["google"],["amazon"]]
     * 输出：[0,1,4]
     * 解释：
     * favoriteCompanies[2]=["google","facebook"] 是 favoriteCompanies[0]=["leetcode","google","facebook"] 的子集。
     * favoriteCompanies[3]=["google"] 是 favoriteCompanies[0]=["leetcode","google","facebook"] 和 favoriteCompanies[1]=["google","microsoft"] 的子集。
     * 其余的收藏清单均不是其他任何人收藏的公司清单的子集，因此，答案为 [0,1,4] 。
     * 示例 2：
     * <p>
     * 输入：favoriteCompanies = [["leetcode","google","facebook"],["leetcode","amazon"],["facebook","google"]]
     * 输出：[0,1]
     * 解释：favoriteCompanies[2]=["facebook","google"] 是 favoriteCompanies[0]=["leetcode","google","facebook"] 的子集，因此，答案为 [0,1] 。
     * 示例 3：
     * <p>
     * 输入：favoriteCompanies = [["leetcode"],["google"],["facebook"],["amazon"]]
     * 输出：[0,1,2,3]
     */
    public List<Integer> peopleIndexes(List<List<String>> favoriteCompanies) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < favoriteCompanies.size(); i++) {
            List<String> checkOne = favoriteCompanies.get(i);
            boolean flag = true;
            for (int j = 0; j < favoriteCompanies.size(); j++) {
                if (j == i) continue;
                List<String> second = favoriteCompanies.get(j);
                Set<String> tmpSecond = new HashSet<>(second);
                if (tmpSecond.containsAll(checkOne)) {
                    flag = false;
                    break;
                }
            }
            if (flag) result.add(i);
        }
        return result;
    }

    public static void main(String[] args) {
        lk_1045 l = new lk_1045();
        ArrayList<List<String>> lists = new ArrayList<>();
        ArrayList<String> l1 = new ArrayList<>();
        ArrayList<String> l2 = new ArrayList<>();
        ArrayList<String> l3 = new ArrayList<>();
        ArrayList<String> l4 = new ArrayList<>();
        ArrayList<String> l5 = new ArrayList<>();
        l1.add("leetcode");
        l1.add("google");
        l1.add("facebook");
        l2.add("google");
        l2.add("microsoft");
        l3.add("google");
        l3.add("facebook");
        l4.add("google");
        l5.add("amazon");
        lists.add(l1);
        lists.add(l2);
        lists.add(l3);
        lists.add(l4);
        lists.add(l5);
        List<Integer> integers = l.peopleIndexes(lists);
        integers.forEach(System.out::println);
    }

}
