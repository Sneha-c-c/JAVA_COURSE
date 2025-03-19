package Exceptions;
//no need of finally resouces are autoclosed
import java.io.*;
public class Trywiththeresources {
    public static void main(String[] args) throws IOException {
        try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));){
            System.out.println("Enter the name :");
            String name=br.readLine();
            System.out.println("Hello : "+name);
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }
    
}
//We can use the try () with resources without finally and catch 