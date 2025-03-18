import java.util.Scanner;
public class JavaConditionalPractice {
    public static void main(String[] args){
        //Avg of first marks 

        // System.out.println("Enter the marks in subject 1 ");
        Scanner sc= new Scanner(System.in);
        // float s1= sc.nextByte();
        // System.out.println("Enter the marks in subject 2 ");
        // float s2= sc.nextByte();
        // System.out.println("Enter the marks in subject 3 ");
        // float s3 = sc.nextByte();

        // float sum = (s1+s2+s3)/3.0f;
        // if(sum>=40 && s1>=35 & s2>=35 && s3>=35){
        //     System.out.println("you have passed the test");
        // }
        // else{
        //     System.out.println("not passed,try again all the best");
        // }

    //Income tax calculation 
    // float tax = 0;
    // float income = sc.nextFloat();
    // if(income < 2.5f){
    //     System.out.println("no tax");
    //     tax = tax + 0;

    // }
    // else if(income>=2.5f && income<5.0f){
    //        tax = tax + 0.05f*(income - 2.5f);
    // }
    // else if(income>=5.0f && income<10.0f){
    //        tax = tax + 0.05f * (5.0f - 2.5f);
    //        tax = tax + 0.2f* (income - 5.0f);
    // }
    // else {
    //     tax = tax + 0.05f * (5.0f - 2.5f);
    //     tax = tax + 0.2f * (10.0f - 5.0f);
    //     tax = tax + 0.3f * (income - 10.0f);
    // }

    // System.out.println("tax : "+tax);

    // Leap year calculation
    System.out.println("Enter an year");
    int year = sc.nextInt();
    if(year%4 ==0 && year%100 !=0 || year % 400 ==0){
        System.out.println("year is an leap year"+year);
    }
    else {
        System.out.println("year is not an leap year"+year);
    }
    
    }
}
