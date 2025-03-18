import java.util.Scanner;

class JavaUsetInput{
    public static void main(String[] args){
        System.out.println("Taking an input from an user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        int sum = a+b ;
        System.out.println("sum of the numbers is "+sum);

        //To check the validity in java 

        System.out.println("Enter the number");
        boolean b1=sc.hasNextInt();
        System.out.println(b1);

        //string 
        String s= sc.next();  // sneha is good = print sneha only 
        String dc=sc.nextLine();  // sneha is good  = sneha is good

    }
}