package com.sort;
import java.io.*;
public class FiledataRead{
    FiledataRead(String file) throws FileNotFoundException{
        File filename=new File(file);
        FileReader fr=new FileReader(filename);
    }

}
