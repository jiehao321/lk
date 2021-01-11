package com.java.likou.动态规划;

import java.util.Vector;

/**
 * @author j
 */
public class 斐波那契数列 {


    int fib(int n) {
        if (n == 2 || n == 1)
            return 1;
        int prev = 1, curr = 1;
        for (int i = 3; i <= n; i++) {
            int sum = prev + curr;
            prev = curr;
            curr = sum;
        }
        return curr;
        }

//    int fib2(int N) {
//        if (N == 0) return 0;
//        if (N == 1) return 1;
//        vector<int> dp(N + 1, 0);
//        // base case
//        dp[1] = dp[2] = 1;
//        for (int i = 3; i <= N; i++)
//            dp[i] = dp[i - 1] + dp[i - 2];
//        return dp[N];
//    }


}
