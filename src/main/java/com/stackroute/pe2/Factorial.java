package com.stackroute.pe2;

//Write a program to list all the factorials, that can be expressed as an int (i.e., 32-bit
//signed integer)

public class Factorial {

    public Factorial()
    {

    }

    public String intfactorial(int number)  //method with int range factorial
    {
        int fact = 1;

        while(number > 0)
        {
            fact = fact * (number--);
        }
        System.out.println(fact);

        if(fact < 0)
        {
            return "factorial out of range";
        }
        else
        {
            return fact+"";
        }
    }


    public String longfactorial(int number)  //method with long range factorial
    {
        long fact = 1;

        while(number > 0)
        {
            fact = fact * (number--);
        }
        System.out.println(fact);

        if(fact < 0)
        {
            return "factorial out of range";
        }
        else
        {
            return fact+"";
        }

    }
}
