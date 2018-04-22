package com.sort;
import java.util.*;

//输出接口
public interface DataOutput {
    public abstract void writeData(char separator,char quoteChar,List<Student2age2grade> list);
}
