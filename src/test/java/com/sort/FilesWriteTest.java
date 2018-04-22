package com.sort;

import com.opencsv.CSVWriter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class FilesWriteTest {
    List<Student2age2grade> list;
    Writer wr=null;
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
    public void fileWriter() throws FileNotFoundException{
        File file=new File("D:\\test.csv");
        try{
            if(!file.exists()){
                file.createNewFile();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        wr=FilesWrite.fileWriter("D:\\test.csv");
    }

    @Test
    public void writeData() throws FileNotFoundException{
        FilesWriteTest ft=new FilesWriteTest();
        ft.fileWriter();
        FilesWrite fw=new FilesWrite();
        fw.writeData(',', CSVWriter.NO_QUOTE_CHARACTER,list);
    }
}