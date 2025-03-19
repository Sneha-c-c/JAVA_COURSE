package FileHandling;
import java.io.*;
public class WriteFile {
    public static void main(String[] args) throws IOException {
        // File f=new File("output.txt");
        // FileWriter fw= new FileWriter(f);
        //By default apprnd is false if i put true it will append to normal file not replaced 
        FileWriter fw=new FileWriter("output.txt",true);
        fw.write("\n Java is an object oriented program");
        fw.write("\nJava is robust and distributed\nJava is mutithreaded and have automatic garbage collection");
        fw.close();
        
    }
    
}
