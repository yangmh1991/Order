package com.sort;
import java.io.*;
import com.opencsv.*;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.HeaderColumnNameMappingStrategy;
import com.opencsv.bean.HeaderColumnNameTranslateMappingStrategy;
import org.apache.commons.io.input.*;
import java.util.*;
//读入csv文件
public class FiledataRead{
    private Reader fr=null;
    FiledataRead(){
    }
    public void readFCsv(String filepath){
        try{
            File file = new File(filepath);
            fr = new InputStreamReader(new BOMInputStream(new FileInputStream(file)),"utf-8");

        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(UnsupportedEncodingException e){
            e.printStackTrace();
        }
    }
    public CSVReader getFr(char separator){
        CSVReader csvReader = new CSVReader(fr,separator,CSVWriter.NO_QUOTE_CHARACTER);
        return  csvReader;
    }

    public List<Student2age2grade> retArray(char separator){
        HeaderColumnNameTranslateMappingStrategy<Student2age2grade> sta=new HeaderColumnNameTranslateMappingStrategy<Student2age2grade>();
        sta.setType(Student2age2grade.class);
        Map<String,String> mapper=new HashMap<String, String>();
        mapper.put("学号","id");
        mapper.put("年龄","age");
        mapper.put("成绩","grade");
        sta.setColumnMapping(mapper);
        CsvToBean<Student2age2grade> csvToBean = new CsvToBean<Student2age2grade>();
        List<Student2age2grade> list=csvToBean.parse(sta,getFr(separator));
        for (Student2age2grade p : list) {
            System.out.println(p.toString());
        }
        return list;
    }
}
