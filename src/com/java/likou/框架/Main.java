package com.java.likou.框架;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            long x = scanner.nextLong();
            int y = scanner.nextInt();
            System.out.println(minLen(x, y));
        }
    }

    private static long minLen(long x, int y) {
        if (x <= 0 || y <= 0){
            return 0;
        }
        long sum1 = (long) Math.pow(26, y);
        long lastNum = x /sum1;
        long res = (long) Math.log10(lastNum);
        if (lastNum * sum1 < x){
            res += 1;
        }
        return res;
    }
}
