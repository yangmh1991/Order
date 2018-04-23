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
        fdr.readFCsv("D:\\test.csv", CSVWriter.DEFAULT_SEPARATOR,CSVWriter.DEFAULT_QUOTE_CHARACTER);
        List<Student2age2grade> list=fdr.retArray(CSVWriter.DEFAULT_SEPARATOR);
        ArraySort as=new ArraySort();
        //ConsoleObject
        ConsoleWrite cw=new ConsoleWrite();
        //Files write
        FilesWrite fsw=new FilesWrite();
        //id
        as.sequence(list,as.idComparatorAsc());
        File file=new File("D:\\testid.csv");
        try{
            if(!file.exists()){
                file.createNewFile();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        FilesWrite.fileWriter("D:\\testid.csv");
        cw.writeData(CSVWriter.DEFAULT_SEPARATOR,'\0',list);
        fsw.writeData(CSVWriter.DEFAULT_SEPARATOR,'\0',list);
        //age
        as.sequence(list,as.ageComparatorAsc());
        File file2=new File("D:\\testage.csv");
        try{
            if(!file.exists()){
                file.createNewFile();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        FilesWrite.fileWriter("D:\\testage.csv");
        cw.writeData(CSVWriter.DEFAULT_SEPARATOR,'\0',list);
        fsw.writeData(CSVWriter.DEFAULT_SEPARATOR,'\0',list);
        //grade
        as.sequence(list,as.gardeComparatorAsc());
        File file3=new File("D:\\testgrade.csv");
        try{
            if(!file.exists()){
                file.createNewFile();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        FilesWrite.fileWriter("D:\\testgrade.csv");
        cw.writeData(CSVWriter.DEFAULT_SEPARATOR,'\0',list);
        fsw.writeData(CSVWriter.DEFAULT_SEPARATOR,'\0',list);
    }
}
