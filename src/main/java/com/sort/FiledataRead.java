package com.sort;
import java.io.*;
import com.opencsv.*;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.HeaderColumnNameMappingStrategy;
import com.opencsv.bean.HeaderColumnNameTranslateMappingStrategy;
import org.apache.commons.io.input.*;
import java.util.*;
//读入csv文件
public class FiledataRead{
    private Reader fr=null;
    CSVReader csvReader;
    FiledataRead(){
    }
    public void readFCsv(String filepath,char separator,char quotechar){
        try{
            csvReader = new CSVReader(new InputStreamReader(new BOMInputStream(new FileInputStream(filepath)),"utf-8"), separator, quotechar);
            //fr=new InputStreamReader(new FileInputStream(filepath),"utf-8");
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(UnsupportedEncodingException e){
            e.printStackTrace();
        }
    }
    public CSVReader getFr(char separator){
        csvReader= new CSVReader(fr,separator,CSVWriter.DEFAULT_QUOTE_CHARACTER);
        return  csvReader;
    }

    public List<Student2age2grade> retArray(char separator){
        /*ColumnPositionMappingStrategy<Student2age2grade> sta=new ColumnPositionMappingStrategy<Student2age2grade>();
        sta.setType(Student2age2grade.class);
        String[] columns=new String[]{"id","age","grade"};
        sta.setColumnMapping(columns);
        CsvToBean csvToBean = new CsvToBean();*/
        //getFr(separator);
        //System.out.println("lgetFr");
        //csvReader= new CSVReader(fr,separator,CSVWriter.NO_QUOTE_CHARACTER);
        List list=new ArrayList<Student2age2grade>();
        /*HeaderColumnNameMappingStrategy<Student2age2grade> mapper = new
                HeaderColumnNameMappingStrategy<Student2age2grade>();
        mapper.setType(Student2age2grade.class);
        CsvToBean<Student2age2grade>  csvToBean = new CsvToBean<Student2age2grade>();*/
        try {
            String[] list1=csvReader.readNext();
            while(null!=(list1=csvReader.readNext())){
                list.add(new Student2age2grade(Integer.parseInt(list1[0]),Integer.parseInt(list1[1]),Double.parseDouble(list1[2])));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        /*for (Student2age2grade p : list) {
            System.out.println(p.toString());
        }*/
        return list;
    }
}
