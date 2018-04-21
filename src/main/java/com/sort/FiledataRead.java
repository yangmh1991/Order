package com.sort;
import java.io.*;
public class FiledataRead{
    private FileReader fr=null;
    FiledataRead(String file) throws FileNotFoundException{
        File filename=new File(file);
        fr=new FileReader(filename);
    }

    public FileReader getFr(){
        return  fr;
    }

    public String retNewline(){

        return ;
    }
}
