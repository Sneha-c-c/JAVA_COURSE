package FileHandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWrite {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("Methods.java");
        FileWriter fw=new FileWriter("newFile.java");
        int x,count=0;
        while((x=fr.read())!=-1){
            fw.write(x);
            count++;
        }
        fr.close();
        fw.close();
        System.out.println("total numbers of the character written there is :"+count);
    }
    
}
