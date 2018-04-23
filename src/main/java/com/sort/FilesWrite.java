package com.sort;

import com.opencsv.CSVWriter;
import com.opencsv.bean.BeanToCsv;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;

import java.io.*;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.List;
//文件输出
public class FilesWrite implements DataOutput {
    static Writer fw=null;
    //
    public static Writer fileWriter(String filename) throws FileNotFoundException{

        try {
            fw = new FileWriter(filename);
            fw.write(new String(new byte[]{(byte)0xEF,(byte)0xBB,(byte)0xBF}));
        }catch(Exception e){
            System.out.println("File '"+filename+"' doesn't exist!");
            e.getStackTrace();
        }
        return fw;
    }

    public Writer getFw(){
        return fw;
    }
    public void writeData(char separator,char quoteChar,List<Student2age2grade> list){
        //设置顺序
        String[] colMapping = {"id","age","grade"};
        ColumnPositionMappingStrategy<Student2age2grade> mapper=new ColumnPositionMappingStrategy<Student2age2grade>();
        mapper.setType(Student2age2grade.class);
        mapper.setColumnMapping(colMapping);

        try {
             //写表头
             CSVWriter csvWriter = new CSVWriter(fw,separator,quoteChar);
             String[] header={"学号","年龄","成绩"};
             BeanToCsv beanToCsv=new BeanToCsv();
             beanToCsv.write(mapper,fw,list);
             csvWriter.close();
             fw.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
