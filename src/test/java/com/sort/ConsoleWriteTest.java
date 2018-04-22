package com.sort;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ConsoleWriteTest {
    List<Student2age2grade> list;
    @Before
    public void setUp() throws Exception {
        list = new ArrayList<Student2age2grade>();
        list.add(new Student2age2grade(123,12,4.5)) ;
        list.add(new Student2age2grade(124,11,5.5)) ;
        list.add(new Student2age2grade(122,12,4.5)) ;
        list.add(new Student2age2grade(126,14,6.5)) ;
        list.add(new Student2age2grade(127,12,2.5)) ;
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void writeData() {
        ConsoleWrite cw=new ConsoleWrite();
        cw.writeData(',','\'',list);
    }
}