package com.ordestiny.tdd.string;

public class FizzBuzz {

    public String fizzBuzz(int num)
    {
        String returnStatement = "";
        for(int i = num; num >= i; i++)
        {
            if((i%3==0) && i%5==0)
            {
                returnStatement += "FizzBuzz\n" ;
            }
            else if(i%3==0)
            {
                returnStatement += "Fizz\n";
            }
            else if(i%5==0)
            {
                returnStatement +="Buzz\n";
            }
            else
            {
                returnStatement += i + "\n";
            }
        }
        return returnStatement;
    }
}
