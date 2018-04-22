package com.sort;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.File;
import java.io.Writer;
import java.util.*;

public class MainTess {
    public static  void main(String[] args) throws Exception{
        /*
        FiledataRead fdr=new FiledataRead();
        fdr.readFCsv("D:\\app\\csv\\student.csv",',');
        fdr.retArray(',');

        List<Student2age2grade> list=new ArrayList<Student2age2grade>();
        list.add(new Student2age2grade(1,12,13));
        list.add(new Student2age2grade(1,13,10));
        list.add(new Student2age2grade(2,12,14));
        ArraySort arr=new ArraySort();
        arr.sequence(list,arr.ageComparatorAsc());
        for(Student2age2grade p : list) {
            System.out.println(p.toString());
        }
        */
        FiledataRead fdr=new FiledataRead();
        fdr.readFCsv("D:\\student.csv");
        List<Student2age2grade> list=fdr.retArray();
        ArraySort as=new ArraySort();
        //ConsoleObject
        ConsoleWrite cw=new ConsoleWrite();
        //Files write
        FilesWrite fsw=new FilesWrite();
        //age asc
        as.ageComparatorAsc();
        as.sequence(list,as.ageComparatorAsc());

        //
        File file=new File("D:\\test.csv");
        try{
            if(!file.exists()){
                file.createNewFile();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        Writer wr=FilesWrite.fileWriter("D:\\test.csv");
        fsw.writeData(',', CSVWriter.NO_QUOTE_CHARACTER,list);
        cw.writeData(',','\'',list);
    }
}
