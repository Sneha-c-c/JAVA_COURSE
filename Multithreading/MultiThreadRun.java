package Multithreading;
//public class MultiThreadRun extends A implements Runnable=possible
//public class MultiThreadRun extends Thread,a= Not possible

public class MultiThreadRun implements Runnable{
    @Override
    public void run(){
        for(int i=0;i<=10;i++){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Runnable r1=new MultiThreadRun();
        Runnable r2=new MultiThreadRun();
        Thread t1=new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
        //t1.run(); behaves like the normal methods 
    }
}
