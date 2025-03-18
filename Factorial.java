public class Factorial {
    public static void main(String[] args){
        int n=10;
        int factorial=1;
        for(int i=1;i<=n;i++){
            factorial*=i;
        }
        System.out.println("factorial of a number is : "+factorial);
    }
    
}
