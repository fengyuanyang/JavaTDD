package com.ordestiny.tdd.fibonacci_series;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciSeriesTest {
    int num;
    public FibonacciSeriesTest() {
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

    @Test
    public void testDisplaySeries() {
        System.out.println("displaySeries");
        FibonacciSeriesTest instance = new FibonacciSeriesTest();
        FibonacciSeriesTest fs = new FibonacciSeriesTest();
        int n = instance.displaySeries();
        int result = fs.displaySeries();
        assertEquals(n,result);

        System.out.println("The last Number in Series : "+ result);
    }

}