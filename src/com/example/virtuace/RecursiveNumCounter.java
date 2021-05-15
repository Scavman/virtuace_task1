package com.example.virtuace;

public class RecursiveNumCounter {

    private static final int startingNumber = 1;
    private int startingNum = startingNumber;

    public RecursiveNumCounter() {
    }

    public int count(int num){
        System.out.println(startingNum);
        startingNum++;
        if(num >= startingNum)
            return count(num);
        else
            startingNum = startingNumber;
        return 0;
    }
}
