package com.stackroute.pe2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    public static Factorial factorial;

    @BeforeClass
    public static void setUp()
    {
        factorial = new Factorial();
    }

    @AfterClass
    public static void tearDown()
    {
        factorial = null;
    }

    @Test
    public void testForintFactorialSuccess()
    {
        assertEquals("6",factorial.intfactorial(3));
        assertEquals("1932053504",factorial.intfactorial(13));
        assertEquals("factorial out of range",factorial.intfactorial(20));
    }

    @Test
    public void testForintFactorialFailure()
    {
        assertEquals("factorial out of range",factorial.intfactorial(20));
    }

    @Test
    public void testForLongFactorialSuccess()
    {
        assertEquals("6",factorial.intfactorial(3));
        assertEquals("1932053504",factorial.intfactorial(13));
        assertEquals("2432902008176640000",factorial.longfactorial(20));
        assertEquals("7034535277573963776",factorial.longfactorial(25));
        assertEquals("factorial out of range",factorial.longfactorial(30));
    }

    @Test
    public void testForLongFactorialFailure()
    {
        assertEquals("factorial out of range",factorial.longfactorial(30));
    }
}