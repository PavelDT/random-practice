package com.github.paveldt;

public class Calc {
    //hardcoded example
    public int add(int i, int j){
        return i+j;
    }

    //this is the dynamic solution - now you can add as many things to main to calculate as you want
    //treated as an array
    public int add(int...i){
        int sum = 0;
        for(int n : i){
            sum = sum + n;
        }
        return sum;
    }
}
