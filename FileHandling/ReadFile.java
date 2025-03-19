package FileHandling;

import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    
    public static void main(String[] args) throws IOException{
        FileReader fr=new FileReader("output.txt");
        int x,count=0;
        //Reads the character and return the int
        //-1 is the end of the file
        while((x=fr.read())!= -1){
          System.out.print((char)x);
          count++;
        
        }
        
        System.out.println("Total number odf the character read : "+count);
        fr.close();
        
    }
}
