package Multithreading;
import java.lang.Thread;

public class Muthithreading  extends Thread{
    @Override
    public void run(){
        for(int i=0;i<=10;i++){
            System.out.println(Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getPriority());

            System.out.println(i);
            try{
                Thread.sleep(700);//predict out put  Thread.sleep(700,500)  more delay
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
    public static void main(String[] args) throws Exception {
        Muthithreading t1=new Muthithreading();
        t1.setPriority(10);//10 max 1 min   
        t1.start();

        t1.join();//Extends exceptions 
        Muthithreading t2=new Muthithreading();
        t2.setName("second");

        t2.start();
        Muthithreading t3= new Muthithreading();
        t3.setName("third");
        t3.start();
        
        // for(int i=100;i<=110;i++){
        //     System.out.println(i);
        // }
    }
}
