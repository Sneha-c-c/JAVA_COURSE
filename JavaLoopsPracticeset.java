public class JavaLoopsPracticeset {
    public static void main(String[] args){
        System.out.println("problem 1 :");
        for(int i = 4; i>=1 ;i--){
            for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }

    System.out.println("problem 2:");
    for(int i = 1;i<=5;i++){
        for(int j = 1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }

    System.out.println("Problem 3 ");
    int sum = 0;
    for(int i=2;i<=10;i++){
        if(i%2==0){
            sum = sum+i;
        }
        i++;
    }
    System.out.println(sum);
     
    System.out.println("problem 4 : ");
    int n = 5;
    for(int i = 1; i<=10; i++){
        System.out.printf("%d X %d = %d\n",n , i, n*i);
    }

    }


}

