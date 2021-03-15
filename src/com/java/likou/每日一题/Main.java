package com.java.likou.每日一题;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (scanner.hasNext()) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            if (x <=0 || y <=0) return;
            int ch =1;
            for (int i = 0; i<y; i++){
                ch = ch*26;
            }
            if (x/ch<1) return;
            int temp = x /ch;
            int z = 1;
            while (temp > 10){
                temp = temp/10;
                z++;
            }
            System.out.println(z);
        }
    }
}
