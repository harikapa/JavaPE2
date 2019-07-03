package com.stackroute.pe2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeCheckerTest {

    public static PalindromeChecker palindromeChecker;

    @BeforeClass
    public static void setUp()
    {
        palindromeChecker = new PalindromeChecker();
    }

    @AfterClass
    public static void tearDown()
    {
        palindromeChecker = null;
    }

    @Test
    public void testForPalindromeCheckSuccess(){

        assertEquals(true, palindromeChecker.isPalindrome("121"));

        assertEquals(true, palindromeChecker.isPalindrome("lol"));

        assertEquals(true, palindromeChecker.isPalindrome("abcd@dcba"));

        assertEquals(true, palindromeChecker.isPalindrome(""));

    }

    @Test
    public void testForPalindromeCheckFailure(){

        assertEquals(false, palindromeChecker.isPalindrome("1212"));

        assertEquals(false, palindromeChecker.isPalindrome("harika"));

        assertEquals(false, palindromeChecker.isPalindrome("abcd@dcba0"));

        assertEquals(false, palindromeChecker.isPalindrome(null));

    }
}