package com.example.samplebugreportproject;

public class Example {

    private int base;

    public Example(int base){
        this.base = base;
    }

    public static int functionThatNeedsCoverage(int a, int b){
        if(a > b) {
            return a - b;
        } else {
            return a + b;
        }
    }

    public int functionThatNeedsCoverageToo(int a, int b){
        if(a > b) {
            return (a - b) * base;
        } else {
            return (a + b) * base;
        }
    }

}
