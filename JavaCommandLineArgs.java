public class JavaCommandLineArgs {
    public static void main(String[] args){
        System.out.println(args[0]);
        //The command that we pass usually string type if we do add it will concatinate suppose if we want to perform an addition need to covert to integer
        // int a = Integer.parseInt(args[0]);
        // int b = Integer.parseInt(args[1]);
        // System.out.println(a+b);
        //calculate sum of all the numbers
        int sum =0;
        for(int i =0 ;i<args.length;i++){
            int num= Integer.parseInt(args[i]);
            sum+= num;
        }
        System.out.println("Sum of the numbers is : "+sum);

    }
}
