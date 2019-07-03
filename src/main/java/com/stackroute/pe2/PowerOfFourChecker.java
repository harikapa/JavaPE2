package com.stackroute.pe2;

//Write a Java method to check if a given number is power of 4

public class PowerOfFourChecker {

    public PowerOfFourChecker()
    {

    }

    public boolean isNumberPowerOf4(double number)
    {
        if(number == 0)
            return false;

        while(number != 1)
        {
            if(number % 4 != 0)  //to check whether number is divisible by 4

                return false;

            number = number/4;

        }
        return true;
    }
}
