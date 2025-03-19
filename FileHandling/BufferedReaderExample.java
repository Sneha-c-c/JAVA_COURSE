package FileHandling;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.*;


public class BufferedReaderExample {
    public static void main(String[] args) throws IOException{

        BufferedReader br=new BufferedReader(new FileReader("Factorial.java"));
        BufferedWriter bw=new BufferedWriter(new FileWriter("outputdata.txt"));
        String line;
        int count=0;
        while((line=br.readLine())!=null){
            bw.write(line);
            System.out.println("\n");
            count++;
        }
        System.out.println("data written succcessfully "+ count);
        br.close();
        bw.close();
    }
    
}
