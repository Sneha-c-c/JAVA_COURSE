package Reflection;

import java.lang.reflect.*;
import java.util.*;
public class Reflection {
    private String namesdata="Suvarna";
    private static int age=90;
    public static void main(String[] args) throws Exception {
        int mcount=0;
        int ccount = 0;
        //Object abc=new String("This is java");
        // Class c=abc.getClass();//Entry point for reflection

        List a = new ArrayList<>();
        Class c=a.getClass();
        System.out.println(c.getName());

        Method[] m=c.getDeclaredMethods();
        Field[]  f=c.getDeclaredFields();

        for(Method m1:m){
            mcount++;
            Class<?> parametrTypes[] = m1.getParameterTypes();
            for (int i = 0; i < parametrTypes.length; i++) {
                System.out.println("Parameter "+(i+1)+"Parameter type"+parametrTypes[i].getName());
            }
            System.out.println("Data :"+m1.getName());
        }
        System.out.println("No of the methods :"+mcount);
        System.out.println("************************************");
        for(Field f1:f){
            ccount++;
            System.out.println("Data of field :"+f1.getName());
        }
        System.out.println(ccount);


        //=============================Access private members data================

        Reflection ref=new Reflection();
        Class refData =ref.getClass();
        System.out.println(refData.getName());
        //getting private data members
        Field[] reffield = refData.getDeclaredFields();
        for(Field e: reffield){
            System.out.println(e.getName()+"--->"+Modifier.toString(e.getModifiers()));
        }

        //Accessing the private data members

        Field str = refData.getDeclaredField("namesdata");
        str.setAccessible(true);
        String whatsimstring = (String)str.get(ref);
        System.out.println("information hiding here is :"+whatsimstring);
    }
}
