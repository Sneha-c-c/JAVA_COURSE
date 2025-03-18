package Exceptions;
import java.io.*;
public class BufferedException {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String name=null;
        int age=0;
        System.out.println("Enter name and number");
        try{
            
         name =br.readLine();
         age=Integer.parseInt(br.readLine());
        }
        catch(Exception e){
            System.err.println(e);
        }
        finally{
            if(br!=null)
               br.close();//Close the resources 
            
            System.out.println("Finally closed");
        }
        System.out.println(name+" "+age);
        System.out.println("Program been closed");

    }
    

}
