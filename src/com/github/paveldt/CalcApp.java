package com.github.paveldt;

public class CalcApp {
    /**
     * Main entry point to the application
     * @param args
     */
    public static void main(String[] args) {
        Calc obj = new Calc();
        System.out.println(obj.add(3, 4, 5, 8) + " is the sum of all the values");
    }
}
