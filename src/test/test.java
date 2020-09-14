package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class test {
    private final static String FOLDER_PATH="C:\\Users\\Gunay\\Desktop";

    private final static String FILE_PATH=FOLDER_PATH+File.separator+"Data";

    public static void write() throws Exception{
        File file=new File(FILE_PATH);
        if (!file.exists()){
            file.mkdir();
        }
        FileWriter fw=new FileWriter(FILE_PATH+File.separator+"data.xml",true);
        BufferedWriter bw=new BufferedWriter(fw);
        bw.write("SALAM");
        bw.newLine();
        bw.close();
    }

    public static void main(String[] args) throws Exception {
        write();

    }
}
