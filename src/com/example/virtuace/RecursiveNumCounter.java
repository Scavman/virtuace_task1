package com.example.virtuace;

public class RecursiveNumCounter {

    private static final int startingNumber = 1;
    private int startingNum = startingNumber;

    public RecursiveNumCounter() {
    }

    public void count(int num){
        System.out.println(startingNum);
        startingNum++;
        if(num >= startingNum)
            count(num);
        startingNum = startingNumber;
    }
}
