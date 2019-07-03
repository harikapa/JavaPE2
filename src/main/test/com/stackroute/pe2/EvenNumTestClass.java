package com.stackroute.pe2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumTestClass {

    @Test
    public void testForIsEvenSuccess()
    {
        assertEquals(true, EvenNumTest.isEven(24));
        assertEquals(true, EvenNumTest.isEven(0));
        assertEquals(true, EvenNumTest.isEven(-6524));
    }

    @Test
    public void testForIsEvenFailure()
    {
        assertEquals(false, EvenNumTest.isEven(245));
        assertEquals(false, EvenNumTest.isEven(987654287));
        assertEquals(false, EvenNumTest.isEven(-65249));
    }
}