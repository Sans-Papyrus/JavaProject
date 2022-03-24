package com;

public class ParseInt {
    public static void main(String[] args){
        int x = Integer.parseInt("32", 16);
        int y = Integer.parseInt("10", 8);
        int z = Integer.parseInt("111", 2);

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
