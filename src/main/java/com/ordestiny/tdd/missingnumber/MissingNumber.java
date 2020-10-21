package com.ordestiny.tdd.missingnumber;

public class MissingNumber{

    public static int getMissingNumber( int[] numArray ) {

        int lastNum = numArray[numArray.length-1]; //get last number of array
        int actualSum =  (lastNum*(lastNum+1))/2; //find the actual sum using n*(n+1)/2
        int currentSum = 0; //sum of first n natural numbers
        for (int i : numArray) {
            currentSum += i; 
        }
        return actualSum-currentSum;
    }
}
