package FileHandling;

import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private int age;
    transient private long aadhar;//if we dont want to convert to byte stream use transient in that case default value printed here 0L
    public Person(String name,int age,long aadhar){
        this.name=name;
        this.age=age;
        this.aadhar=aadhar;
    }
    @Override
    public String toString(){
        return "[Student : =name"+name+"age :"+age+"aadhar +"+aadhar+"]";
    }
    
}
