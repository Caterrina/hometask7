package com.hillel.hometask1;

public class Start {
    public static void main (String[] args) {
        int r = Calculator.add(5, 7);
        System.out.println( r);

        int r2 = Calculator.sub(100, 35);
        System.out.println(  r2);

        int r3 = Calculator.mul(33, 3);
        System.out.println(  r3);

        int r4 = Calculator.div(200, 50);
        System.out.println(  r4);

        double r5= Calculator.add(55.3, 7);
        System.out.println( r5);

    }
}
