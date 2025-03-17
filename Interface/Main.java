package Interface;

public class Main implements Print {

    public void print(){
        System.out.println("printing......");
    }

     public void show(){
        System.out.println("Showing........");
    }
    public static void main(String[] args) {
        Print  p=new Main();
        p.print();
        p.show();
    }

    
}
