package com.sort;

import java.util.List;
//控制台输出
public class ConsoleWrite implements DataOutput {
    public void writeData(char separator, char quoteChar, List<Student2age2grade> list){
         System.out.println("学号"+separator+"年龄"+separator+"成绩");
         for(Student2age2grade sag:list){
             System.out.println(""+sag.getId()+separator+sag.getAge()+separator+sag.getGrade());
         }

    }
}
