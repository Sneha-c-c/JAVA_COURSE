package Multithreading;

class Table{
public synchronized void printTable(int n){
    for(int i=0;i<=10;i++){
        System.out.println(n+" * "+i+"="+n*i);
    }
    try{
        Thread.sleep(600);
    }
    catch(Exception e){
        System.out.println(e);
    }
}
}

class First extends Thread{
    Table t;
    First(Table t){
        this.t=t;
    }
public void run(){
    t.printTable(3);
}
}


class Second extends Thread {
    Table t;

    Second(Table t) {
        this.t = t;
    }

    public void run() {
        t.printTable(9);
    }
}

public class Synchronized {

    public static void main(String[] args) {
        Table tab=new Table();

        First a=new First(tab);
        a.start();

        Second b=new Second(tab);
        b.start();

        // anonymous class 

        // Third c= new third(){
        //     a.printtable();
        // }
        // c.start()
    }
}