package com.stackroute.pe2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class WordFrequencyTest {

    public static WordFrequency wordFrequency;

    @BeforeClass
    public static void setUp()
    {
        wordFrequency = new WordFrequency();
    }

    @AfterClass
    public static void tearDown()
    {
        wordFrequency = null;
    }

    @Test
    public void testForWordFrequency()
    {
        List<WordFrequency.WordCount> result = wordFrequency.findWordfrequency("/home/harika/Documents/FileDemo.txt");
        assertEquals(10, result.size());
        assertEquals("i", result.get(0).word);
        assertEquals(3, result.get(0).count);
        assertEquals("am", result.get(1).word);
        assertEquals(1, result.get(1).count);
    }

    @Test
    public void testForWordFrequencyFailure()
    {
        List<WordFrequency.WordCount> result = wordFrequency.findWordfrequency("/home/harika/Documents/FileDemo1.txt");
        assertNull(null,result);
    }

    @Test
    public void testForWordFrequencySuccess()
    {
        List<WordFrequency.WordCount> result = wordFrequency.findWordfrequency("/home/harika/Documents/sample.txt");
        assertEquals("Write", result.get(1).word);
        assertEquals(3, result.get(1).count);
    }



}