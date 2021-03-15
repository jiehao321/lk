package com.java.likou.牛客;

import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String target = scanner.nextLine();
            String source = scanner.nextLine();

            int m = target.length();
            int n = source.length();
            int i = n-1, j = m-1;
            while (i >=0 && j >=0){
                if (source.charAt(i) == target.charAt(j)){
                    j--;
                }
                i--;
            }
            if (j>=0)System.out.println(i+1);
            else System.out.println(-1);
        }
    }
}