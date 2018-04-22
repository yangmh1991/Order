package com.sort;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class ArraySortTest {
    List<Student2age2grade> list;
    ArraySort arraySort=new ArraySort();
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
        for(Student2age2grade s:list){
            System.out.println(s.toString());
        }
    }

    @Test
    public void idComparatorAsc() {
        arraySort.sequence(list,arraySort.idComparatorAsc());
        System.out.println("idComparatorAsc:");
        for(Student2age2grade s:list){
            System.out.println(s.toString());
        }
        int bool=1;
        for(int i=0;i<(list.size()-1);i++){
            if(list.get(i).getId()-list.get(i+1).getId()>0){
                bool=0;
                break;
            }
        }
        assertEquals(1,bool);
    }

    @Test
    public void idComparatorDes() {
        arraySort.sequence(list,arraySort.idComparatorDes());
        System.out.println("idComparatorDes:");
        for(Student2age2grade s:list){
            System.out.println(s.toString());
        }
        int bool=1;
        for(int i=0;i<(list.size()-1);i++){
            if(list.get(i).getId()-list.get(i+1).getId()<0){
                bool=0;
                break;
            }
        }
        assertEquals(1,bool);
    }

    @Test
    public void ageComparatorAsc() {
        arraySort.sequence(list,arraySort.ageComparatorAsc());
        System.out.println("ageComparatorAsc:");
        for(Student2age2grade s:list){
            System.out.println(s.toString());
        }
        int bool=1;
        for(int i=0;i<(list.size()-1);i++){
            if(list.get(i).getAge()-list.get(i+1).getAge()>0){
                bool=0;
                break;
            }
        }
        assertEquals(1,bool);
    }

    @Test
    public void ageComparatorDes() {
        arraySort.sequence(list,arraySort.ageComparatorDes());
        System.out.println("ageComparatorDes:");
        for(Student2age2grade s:list){
            System.out.println(s.toString());
        }
        int bool=1;
        for(int i=0;i<(list.size()-1);i++){
            if(list.get(i).getAge()-list.get(i+1).getAge()<0){
                bool=0;
                break;
            }
        }
        assertEquals(1,bool);
    }

    @Test
    public void gardeComparatorAsc() {
        arraySort.sequence(list,arraySort.gardeComparatorAsc());
        System.out.println("gardeComparatorAsc:");
        for(Student2age2grade s:list){
            System.out.println(s.toString());
        }
        int bool=1;
        for(int i=0;i<(list.size()-1);i++){
            if(list.get(i).getGrade()-list.get(i+1).getGrade()>0){
                bool=0;
                break;
            }
        }
        assertEquals(1,bool);
    }

    @Test
    public void gardeComparatorDes() {
        arraySort.sequence(list,arraySort.gardeComparatorDes());
        System.out.println("gardeComparatorDes:");
        for(Student2age2grade s:list){
            System.out.println(s.toString());
        }
        int bool=1;
        for(int i=0;i<(list.size()-1);i++){
            if(list.get(i).getGrade()-list.get(i+1).getGrade()<0){
                bool=0;
                break;
            }
        }
        assertEquals(1,bool);
    }

    @Test
    public void sequence() {
    }
}