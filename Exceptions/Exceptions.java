package Exceptions;
import java.util.InputMismatchException;
import java.util.Scanner;;

public class Exceptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a= sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        try{
            int res=a/b;
            System.out.println("The result of an exp :"+res);
        }
        //Instead of declaring the multiple catch declare and handle through one super class
        // catch(ArithmeticException e){
        //     e.printStackTrace();

        // }
        // catch(InputMismatchException e){
        //     System.out.println(e);
        // }
        catch(Exception e){
            System.err.println(e);
        }
        finally{
            System.out.println("Program completed finally");
        }
        System.out.println("Rest of the code follows !!!!");

    }
    
}
