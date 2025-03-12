public class Operators {

    public static void main(String[] args) {
        int x=10;
        int res= x++ + ++x;
        System.out.println(res);

        int a = 1+(int)(Math.random()*100);
        int b= 1+(int)(Math.random()*100);
        int c = (a>b)? a:b;
        System.out.println(c);
    }
}