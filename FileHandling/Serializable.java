package FileHandling;
import java.io.*;
public class Serializable {

    public static void main(String[] args) throws Exception {

        Person p1 = new Person("sneha", 23, 456782225);
        System.out.println(p1);
        //Serialization
         FileOutputStream fso=new FileOutputStream("output.info");
         ObjectOutputStream obj=new ObjectOutputStream(fso);
         obj.writeObject(p1);
         //Deserialization

         FileInputStream fis=new FileInputStream("output.info");
         ObjectInputStream objs=new ObjectInputStream(fis);
         Person p2=(Person)objs.readObject();

         System.out.println("Person Data :"+p2);
    }
    
}
