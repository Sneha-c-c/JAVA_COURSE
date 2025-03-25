package Multithreading;
import java.lang.Thread;
public class Banking {
    double balance;
    Banking(double balance){
        this.balance=balance;
    }
    public void getBalence(){
        System.out.println("getting the balance : "+balance);
    }

    public synchronized void withDraw(double amount){
        System.out.println("Going to withdraw an amount");
        if(amount>=balance){
            System.out.println("less balence please wait untill deposit to be done ");
            try{
                wait();
            }catch(Exception e){
                System.out.println(e);
            }
        }
            balance=balance-amount;
            System.out.println("withdrwn success ");
            getBalence();
        
    }

    public synchronized void deposit(double amount){
        System.out.println("Going to deposit");
        balance=balance+amount;
        System.out.println("Deposit completed");
        getBalence();
        notify();
    }

    public static void main(String[] args) {
        Banking c1=new Banking(3000);

        new Thread(){
            public void run(){
                c1.withDraw(3000);
            }
        }.start();

        new Thread() {
            public void run() {
                c1.deposit(5000);
            }
        }.start();
    }
}
