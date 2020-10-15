package com.ordestiny.tdd.fibonacci_series;
class FibonacciSeries {
    int num;
    public FibonacciSeries() {
        num = 10;
    }
    public int displaySeries() {
        int x = -1;
        int y = 1;
        int z = 0;
        for(int i=0;i<num;i++){
            z = x+y;
            x = y;
            y = z;
        }
        return z;
    }
    public static void main(String[] args) {
        FibonacciSeries fibo = new FibonacciSeries();
        int a = fibo.displaySeries();
        System.out.print(a);
    }
}