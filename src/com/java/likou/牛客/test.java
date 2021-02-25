package com.java.likou.牛客;

public class test {


    public static void main(String[] args) {
        String a = "ABCabc";
        char d = 'A';
        int e;
        int f = 0;
        int c = (int) d;
        if (c>92){
             e = c-32;
        }else {
            e = c + 32;
        }
        char[] chars = a.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c || chars[i] == e){f++;}
        }
        System.out.println(f);

        String oo = "0xAA";
        System.out.println(Integer.parseInt(oo.substring(2), 16));

    }
}
