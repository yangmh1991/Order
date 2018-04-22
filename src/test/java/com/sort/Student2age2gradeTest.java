package com.sort;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Student2age2gradeTest {
    Student2age2grade s2a2g;
    @Before
    public void setUp() throws Exception {
        s2a2g = new Student2age2grade(120,21,89.5);
        System.out.println(s2a2g.toString());
    }

    @After
    public void tearDown() throws Exception {
        System.out.println(s2a2g.toString());
    }

    @Test
    public void setId() throws Exception{
        s2a2g.setId(123);
        assertEquals(123,s2a2g.getId());
    }

    @Test
    public void getId() throws Exception{
        Student2age2grade s=new Student2age2grade(124,12,62);
        assertEquals(124,s.getId());
    }

    @Test
    public void setAge() throws Exception{
        assertEquals(21,s2a2g.getAge());
        s2a2g.setAge(23);
        assertEquals(23,s2a2g.getAge());
    }

    @Test
    public void getAge() throws Exception{
        Student2age2grade s=new Student2age2grade(124,12,62);
        assertEquals(12,s.getAge());
    }

    @Test
    public void setGrade() throws Exception{
        s2a2g.setGrade(29);
        assertEquals(29,s2a2g.getGrade(),0.01);
    }

    @Test
    public void getGrade() throws Exception{
        Student2age2grade s=new Student2age2grade(124,12,62);
        assertEquals(62,s.getGrade(),0.01);
    }


}