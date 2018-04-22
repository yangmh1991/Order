package com.sort;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//排序
public class ArraySort implements Sorting{
    //id Ascend
    public Comparator<Student2age2grade> idComparatorAsc(){
        return new Comparator<Student2age2grade>() {
            public int compare(Student2age2grade o1, Student2age2grade o2) {
                return o1.getId()-o2.getId();
            }
        };
    }
    //id Descend
    public Comparator<Student2age2grade> idComparatorDes(){
        return new Comparator<Student2age2grade>() {
            public int compare(Student2age2grade o1, Student2age2grade o2) {
                return -o1.getId()+o2.getId();
            }
        };
    }

    //age Ascend
    public Comparator<Student2age2grade> ageComparatorAsc(){
        return new Comparator<Student2age2grade>() {
            public int compare(Student2age2grade o1, Student2age2grade o2) {
                return o1.getAge()-o2.getAge();
            }
        };
    }
    //age Descend
    public Comparator<Student2age2grade> ageComparatorDes(){
        return new Comparator<Student2age2grade>() {
            public int compare(Student2age2grade o1, Student2age2grade o2) {
                return -o1.getAge()+o2.getAge();
            }
        };
    }
    //grade Ascend
    public Comparator<Student2age2grade> gardeComparatorAsc(){
        return new Comparator<Student2age2grade>() {
            public int compare(Student2age2grade o1, Student2age2grade o2) {
                if((o1.getGrade()-o2.getGrade()) > 0){
                    return 1;
                }else if((o1.getGrade()-o2.getGrade()) == 0){
                    return 0;
                }else{
                    return -1;
                }

            }
        };
    }
    //grade Descend
    public Comparator<Student2age2grade> gardeComparatorDes(){
        return new Comparator<Student2age2grade>() {
            public int compare(Student2age2grade o1, Student2age2grade o2) {
                if((o1.getGrade()-o2.getGrade()) > 0){
                    return -1;
                }else if((o1.getGrade()-o2.getGrade()) == 0){
                    return 0;
                }else{
                    return 1;
                }

            }
        };
    }

    //
    public List<Student2age2grade> sequence(List student,Comparator<Student2age2grade> comp){
        //age paixu
        Collections.sort(student,comp );
        return student;
    }
}
