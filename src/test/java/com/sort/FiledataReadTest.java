package com.sort;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FiledataReadTest {
    FiledataRead fdr=new FiledataRead();
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void readFCsv() {
        fdr.readFCsv("D:\\app\\csv\\student.csv");
    }

    @Test
    public void getFr() {
    }

    @Test
    public void retArray() {
        fdr.readFCsv("D:\\app\\csv\\student.csv");
        List<Student2age2grade> list=fdr.retArray();
    }
}