package FileHandling;

import java.io.BufferedReader;
import java.io.Console;
import java.io.InputStreamReader;
import java.util.Scanner;


public class ReadingDatafromUser {
    public static void main(String[] args) throws Exception {
        //1. Command line argument 

        System.out.println("Your name is "+args[0]);

        //Scanner class
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your name");
        String name =sc.nextLine();
        System.out.println("Your name is :"+name);

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your name");
        String names =br.readLine();
        System.out.println("name of a person is :"+names);

        //Console   does not require an exception here
        Console a=System.console();
        System.out.println("enter console class name ");
        String b=a.readLine();
        System.out.println("Name in console class :"+b);
        System.out.println("Enter password");
        char[] pwd=a.readPassword();
        System.out.println(pwd);
    

    }
    
}
