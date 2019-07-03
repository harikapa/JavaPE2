package com.stackroute.pe2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class FileReaderUpperCaseTest {

    public static FileReaderUpperCase fileReaderUpperCase;

    @BeforeClass
    public static void setUp()
    {
        fileReaderUpperCase = new FileReaderUpperCase();
    }

    @AfterClass
    public static void tearDown()
    {
        fileReaderUpperCase = null;
    }

    @Test
    public void testForgivingPdfFilePathAndReturnLength()
    {
        assertEquals(49716, fileReaderUpperCase.fileReader("/home/harika/Downloads/JavaPE1.pdf"));
    }

    @Test
    public void testForgivingTextFilePathAndReturnLength()
    {
        assertEquals(819, fileReaderUpperCase.fileReader("/home/harika/Documents/sample.txt"));
    }

    @Test
    public void testForgivingInCorrectFilePath()
    {
        assertEquals(0, fileReaderUpperCase.fileReader("/home/harika/Documents/sample1.txt"));
    }








}