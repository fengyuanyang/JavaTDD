package com.ordestiny.tdd.functions;

class MissingNumber {

    static int getMissingNo(int numberArray[]) {

        int n = numberArray.length;
        int i, total;
        total = (n + 1) * (n + 2) / 2;
        for (i = 0; i < n; i++)
            total -= numberArray[i];
        return total;
    }
}