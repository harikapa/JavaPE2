package com.stackroute.pe2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class FolderFileNamesReaderTest {

    public static FolderFileNamesReader folderFileNamesReader;

    @BeforeClass
    public static void setUp()
    {
        folderFileNamesReader = new FolderFileNamesReader();
    }

    @AfterClass
    public static void tearDown()
    {
        folderFileNamesReader = null;
    }

    @Test()
    public void testForGetTextFilenamesOfFolder()
    {
        String[] filenames = folderFileNamesReader.getFolderFilenames("/home/harika/Documents", "txt");

        assertEquals(2,filenames.length);

        assertEquals("FileDemo.txt", filenames[0]);

        assertEquals("sample.txt", filenames[1]);
    }

    @Test()
    public void testForGetPdfFilenamesOfFolder()
    {
        String[] filenames = folderFileNamesReader.getFolderFilenames("/home/harika/Documents", "pdf");

        assertEquals(1,filenames.length);

        assertEquals("demo.pdf", filenames[0]);
    }


    @Test()
    public void testForGetFilenamesOfFolderFailure()
    {
        String[] filenames = folderFileNamesReader.getFolderFilenames("/home/harika/Documents/Dummy", "pdf");

        assertNull(null,filenames);

    }
}